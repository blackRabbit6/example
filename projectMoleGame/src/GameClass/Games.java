package GameClass;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
//import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


// 유스케이스 만든대로 클래스 만들기

public class Games extends JFrame implements ActionListener,Runnable{
	JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER,0,480));
	JPanel iClick = new JPanel();
	JButton btn = new JButton("게임 시작");
	JButton click[] = new JButton[16];
	Container c = getContentPane();
	// 유저 이름
	JPanel namePan = new JPanel();
	JLabel nameLab = new JLabel("닉네임: ");
	// 이름 텍스트 숫자 제한
	JTextField nameField = new JTextField(10);
	JButton nameButton = new JButton("확인");
	// 이미지
	// 안 된 이유는 내가 이미지 파일 주소를 안넣어서
	ImageIcon icon1 = new ImageIcon(Games.class.getResource("/GameClass/img/digda.png"));
	ImageIcon icon2 = new ImageIcon(Games.class.getResource("/GameClass/img/digda2.png"));
	ImageIcon icon3 = new ImageIcon(Games.class.getResource("/GameClass/img/dochi.png"));
	ImageIcon icon4 = new ImageIcon(Games.class.getResource("/GameClass/img/null.png"));
	// null 은 아예 그림색깔 같겠금 하자 안그럼 이상함
	JLabel score = new JLabel ("Score: 0");
	// 타이머 
	// 버튼이랑 연결시켜 게임시작이라고 누르면 작동 되게 만들어놓음
	// 게임 시작후 타이머 시작과 동시에 버튼 비활성화
	JLabel time = new JLabel("Time 0:60"); 
	JPanel PanelSt = new JPanel();
	JPanel top = new JPanel();
	
	int ran1 = 0; // 두
	int ran2 = 0; // 왕두
	int ran3 = 0; // 고슴
	int cnt = 0;
	int n = 10;
	String userId = ""; // 유저이름
	int hedgehogSc = -10; // 고슴도치 점수
	int kMoleSc = 100; // 왕두더지 점수
	int kMoleIcon2 = 0; // 왕두더지 등장수
	
	private boolean kMole = true; // 왕두더지 등장허용여부
	
	private final Object lock = new Object(); // 동기화객체
	private ImageIcon lastIcon = null; 
	
	// 순위표
	private List<PlayerInfo> leaderboard = new ArrayList<>();
	JButton leaderboardButton = new JButton("순위표 보기");
    JButton retryButton = new JButton("다시 도전");
	
    boolean gameInProgress = false; // 게임이 진행 중인지 여부를 추적하는 변수 추가
    
    private boolean newGame = false; // 새로운 게임 여부 플래그
    
    private String originalUserId = ""; // 게임 시작 전의 사용자 이름 저장
    private int originalScore = 0; // 게임 시작 전의 점수 저장
    
    private String previousUserId = ""; // 이전 게임의 사용자 ID
    private int previousScore = 0; // 이전 게임의 점수
    
	Games() {
		
		String cursorImagePath = "/GameClass/img/cursor.png"; // 이미지 파일 경로

        try {
            BufferedImage cursorImage = ImageIO.read(Games.class.getResource(cursorImagePath));

            int newWidth = 10; // 새로운 이미지 가로 크기
            int newHeight = 10; // 새로운 이미지 세로 크기
            Image resizedCursorImage = cursorImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

            Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(resizedCursorImage, new Point(0, 0), "customCursor");
            this.setCursor(customCursor);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		// header
		top.setLayout(new FlowLayout(FlowLayout.LEFT));
		top.add(time);
		top.add(namePan);
		c.add(top,BorderLayout.NORTH);
		
		add(pan);
		pan.add(btn);
		
		
		nameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				userId = nameField.getText();
				namePan.setVisible(false);
				on();
			}
		});
		namePan.add(nameLab);
		namePan.add(nameField);
		namePan.add(nameButton);
		
		// 유저 이름 패널등장
		namePan.setVisible(true);
		
		// main
		// 두더지 나타나는 창
		c.add(iClick,BorderLayout.CENTER);
		iClick.setLayout(new GridLayout(4,4));
		for(int i=0; i<click.length; i++) {
			click[i] = new JButton();
			iClick.add(click[i],BorderLayout.CENTER);
			click[i].setBackground(new Color(124,252,0));
		}
		
		// footer
		c.add(PanelSt,BorderLayout.SOUTH);
		// 점수
		PanelSt.setLayout(new GridLayout(1,2));
		PanelSt.add(score);
		// 버튼
		PanelSt.setLayout(new FlowLayout(FlowLayout.RIGHT));
		PanelSt.add(btn);

		// 순위표, 다시 버튼
		PanelSt.add(leaderboardButton);
		PanelSt.add(retryButton);
		
		setListeners();
		setVisible(true);
		
//		setVisible(true);
		setSize(800,700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 다시 시작 버튼을 위한 리스너 등록
        retryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
                btn.setEnabled(true); // 게임 버튼 활성화
//                Thread th = new Thread(this);
//                th.start(); // 타이머 시작
            }
        });
		
		Start();
		
		resetGame(); //겜 초기화
	}
		
	// 시작버튼 누르면 실행 + 유저 이름
	public void Start() {
//		on();
		btn.addActionListener(this);
		for(int i=0; i<click.length; i++)
			click[i].addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			if(!gameInProgress) {
			if(userId.isEmpty()) {
				JOptionPane.showMessageDialog(this, "ID 입력하세요.");
				namePan.setVisible(true); // 이름 패널 다시 보이게, 안쓰면 걍 없어짐
			}else {
				
				ran1 = (int) (Math.random() * click.length); // 아이콘이 나올 위치 랜덤 설정
                click[ran1].setIcon(icon1); // 랜덤 위치에 아이콘을 띄움
                Thread th = new Thread(this);
                th.start(); // 타이머 시작
                random(ran1); // 랜덤 위치에 아이콘을 띄우기 위해 호출
                if (newGame) {
                    originalUserId = userId;
                    originalScore = cnt;
                }
//				random(0);
				}
			}
		}else {
			// else 부분이기에 click 버튼 이벤트 처리
			for(int i=0; i<click.length; i++) {
				if(e.getSource() == click[i])
					random(i);
			}
		}
		
		retryButton.setEnabled(false);//진행중 다시도전 비활성
		
	}
	// 점수
	private synchronized void updateScore(ImageIcon icon) {
	    if (lastIcon == null) {
	        lastIcon = icon;
	    } else {
	        if (isIconEqual(lastIcon, icon)) {
	            
	            if (isIconEqual(icon, icon1)) {
	                cnt += 10;
	            } else if (isIconEqual(icon, icon2)) {
	                cnt -= 10;
	                if (cnt < 0) {
	                    cnt = 0;
	                }
	            }
	        }
	        lastIcon = icon;
	    }
	    
	    score.setText("Score: " + cnt);
	}

	private boolean isIconEqual(ImageIcon icon1, ImageIcon icon2) {
	    return icon1.getImage().equals(icon2.getImage());
	}



	private void random(int i) {

	    if (i != ran1 && i != ran2 && i != ran3) return;

	    synchronized (lock) {
	        if (click[i].getIcon() == icon1) {
	            cnt += 10; // 두더지 10점 추가
	        } else if (click[i].getIcon() == icon3) {
	            cnt -= 10; // 고슴도치 10점 감소
	            if (cnt < 0) {
	                cnt = 0;
	            }
	        } else if (click[i].getIcon() == icon2) {
	            cnt += 100; // 왕두더지 100점 추가
	            if (cnt < 0) {
	                cnt = 0;
	            }
	            kMoleIcon2++; // 왕두더지 등장 수 증가
	            if (kMoleIcon2 >= 2 && n <= 30) {
	                ran2 = (int) (Math.random() * click.length);
	                synchronized (lock) {
	                    click[ran2].setIcon(icon2);
	                }
	                kMoleIcon2++;
	                if(kMoleIcon2 >2) {
	                	kMole = false;
	                }
	            }
	        }
	        score.setText("Score: " + cnt);
	        click[i].setIcon(icon4);
	    }

	    Timer time = new Timer();
	    TimerTask timerTask = new TimerTask() {
	        @Override
	        public void run() {
	            click[ran1].setIcon(icon4);
	            ran1 = (int) (Math.random() * click.length);
	            click[ran1].setIcon(icon1);
	        }
	    };
	    time.schedule(timerTask, 100);
	    
	    ran2 = (int) (Math.random() * click.length);
	    ran3 = (int) (Math.random() * click.length);

	    Random random = new Random();
	    int randomValue = random.nextInt(10);

	    if (randomValue < 4) { // 40% 확률로 고슴도치
	        synchronized (lock) {
	            click[ran3].setIcon(icon3);
	        }
	    } else if (randomValue < 8) { // 40% 확률로 왕두더지
	        if (kMoleIcon2 < 2 && n <= 30) {
	            synchronized (lock) {
	                click[ran2].setIcon(icon2);
	            }
	        } else {
	            click[ran2].setIcon(icon4);
	        }
	    } else { // 20% 확률로 보이지 않는 아이콘
	        click[ran3].setIcon(icon4);
	    }
		
	}

	//타이머
	@Override
	public void run() {
		n = 5;
		while(true) {
			try{
				Thread.sleep(1000); //1초
			}catch(InterruptedException e) {};
			n--;
			if(n == 0) { //시간 초과 후 두더지 안나오게 하고 시간초 부분을 게임오버로 출력+버튼 클릭 못하게 하기
				click[ran1].setIcon(icon4);	//null
				click[ran2].setIcon(icon4);	//null
				time.setText("Game Over !!");
				off(); // 게임종료시 호출
				addScoreToLeaderboard();
				retryButton.setEnabled(true); // 다시시작 버튼 활성
				btn.setEnabled(false); // 게임종료시 게임시작버튼 비활성
				break;
			}
			time.setText("Time 0:"+n);
		}
	}
	
	
	public void off() {
		for(int i=0; i<click.length; i++)
			click[i].setEnabled(false);
	}
	
	public void on() {
		for(int i=0; i<click.length; i++)
			click[i].setEnabled(true);
	}
	
	//순위표, 재시도
			private void setListeners() {
		        leaderboardButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                showLeaderboard();
		            }
		        });

		        retryButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                resetGame();
		                btn.setEnabled(true); // 게임버튼 활성화
		            }
		        });
		        
		    }
	
			// 순위표 정보
			private void addScoreToLeaderboard() {
				PlayerInfo player = new PlayerInfo(userId, cnt);
				leaderboard.add(player);
				leaderboard.sort(null);
				if(leaderboard.size()>10) {
					leaderboard.remove(leaderboard.size()-1);
				}
			}
	
	//순위표 보여주기
	private void showLeaderboard() {
		if(leaderboard.isEmpty()) {
			JOptionPane.showMessageDialog(this,"순위 없음");
			return;
		}
		
		StringBuilder leaderboardText = new StringBuilder("순위표:\n");
		for(int rank=0; rank<leaderboard.size(); rank++) {
			PlayerInfo player = leaderboard.get(rank);
			leaderboardText.append(rank+1).append(". ").append(player.getId()).append(": ").append(player.getScore()).append("\n");
		}
		
		JOptionPane.showMessageDialog(this, leaderboardText.toString(), "순위표", JOptionPane.PLAIN_MESSAGE);
		
	}
	
		
	// 게임 초기화 기능 구현
	private void resetGame() {
		kMoleIcon2=0;
		userId = ""; //새로운 게임 시작 id 초기화
	    cnt = 0; // 게임 시작 전의 점수로 복원
	    n = 5;
	    lastIcon = null;
	    newGame = true; // 다시 도전 버튼 누를 때 새로운 게임으로 설정
	    previousUserId = userId; //현재 게임 id -> 이전게임 id로 저정
	    previousScore = cnt;
	    for (JButton button : click) {
	        button.setIcon(icon4);
	        button.setEnabled(true);
	    }

	    score.setText("Score: " + cnt);
	    time.setText("Time 0:60");
	    namePan.setVisible(true); // 사용자 이름 입력창 보이게
	    retryButton.setEnabled(false); // 끝나고 다시 도전 버튼 비활성화
//	    ran1 = (int) (Math.random() * click.length);
//        click[ran1].setIcon(icon1); // 게임 시작시 아이콘 출력
	    
	    gameInProgress = false; // 게임 초기화 시 게임 진행 상태 초기화
        
	 // 다시 시작 버튼을 누른 상태에서 바로 아이콘을 띄우도록 호출
	    if (gameInProgress && !userId.isEmpty()) {
	        on(); // 아이콘 띄우기 전에 버튼 활성화
	        ran1 = (int) (Math.random() * click.length); // 아이콘이 나올 위치 랜덤 설정
	        click[ran1].setIcon(icon1); // 랜덤 위치에 아이콘을 띄움
	        Thread th = new Thread(this);
	        th.start(); // 타이머 시작
	        random(ran1); // 랜덤 위치에 아이콘을 띄우기 위해 호출
	    }
	}
	
	
	
	// 순위표, 다시하기
	private class PlayerInfo implements Comparable<PlayerInfo>{
		private String id;
		private int score;
	
		public PlayerInfo(String id, int score) {
			this.id = id;
			this.score = score;
		}
	
		public String getId() {
			return id;
		}
	
		public int getScore() {
			return score;
		}
	
		@Override
		public int compareTo(PlayerInfo other) {
			return Integer.compare(other.score, this.score);
		}
}

	
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new Games();
				}
			});
    }
}
