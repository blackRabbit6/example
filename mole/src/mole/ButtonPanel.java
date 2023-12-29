package mole;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonPanel extends JPanel implements ActionListener, Runnable{
	private JButton btnGameStart;
    private JButton btnRetry;
    private JButton btnShowLeaderboard;
    private JButton btnInputNickname; // 닉네임 입력 버튼 추가
    private JLabel score = new JLabel("Score: 0"); // 점수를 표시할 라벨
    private AnimalCreation animalCreation; // AnimalCreation 객체 추가

    private JButton btnStart;
    private JButton[] clickButtons;
    
    JPanel iClick = new JPanel();
	JButton btn = new JButton("게임 시작");
//	JButton click[] = new JButton[16];
	JLabel time = new JLabel("Time 0:60"); 
	ImageIcon icon1 = new ImageIcon(ButtonPanel.class.getResource("/mole/img/digda.png"));
	ImageIcon icon2 = new ImageIcon(ButtonPanel.class.getResource("/mole/img/digda2.png"));
	ImageIcon icon3 = new ImageIcon(ButtonPanel.class.getResource("/mole/img/dochi.png"));
	ImageIcon icon4 = new ImageIcon(ButtonPanel.class.getResource("/mole/img/null.png"));
	
    int ran1 = 0; // 두
	int ran2 = 0; // 왕두
	int ran3 = 0; // 고슴
	private int cnt = 0;
	int n = 10;
	private String userId = ""; // 유저이름
	int hedgehogSc = -10; // 고슴도치 점수
	int kMoleSc = 100; // 왕두더지 점수
	int kMoleIcon2 = 0; // 왕두더지 등장수
	
	// userIdField 선언 및 초기화
	private JTextField userIdField = new JTextField(10);
	// 유저 이름
	JPanel namePan = new JPanel();
	JLabel nameLab = new JLabel("닉네임: ");
//	private ImageIcon icon4;
    private ImageIcon lastIcon = null;
//    private JLabel score;
    private boolean kMole = false; // 초기값 설정
    
    private boolean gameInProgress = false; // 게임이 진행 중인지 여부를 추적하는 변수 추가
    private boolean newGame = false; // 새로운 게임 여부 플래그
    private String originalUserId = ""; // 게임 시작 전의 사용자 이름 저장
    private int originalScore = 0; // 게임 시작 전의 점수 저장
    
    private String previousUserId = ""; // 이전 게임의 사용자 ID
    private int previousScore = 0; // 이전 게임의 점수
    
    private final Object lock = new Object();
    
    private final Leaderboard leaderboard; // Leaderboard 객체 추가
    
    public ButtonPanel(Leaderboard leaderboard, JButton[] clickButtons) {
    	
    	this.clickButtons = clickButtons;
    	setLayout(new BorderLayout());
    	this.leaderboard = leaderboard;
    	
    	// header 패널 생성 및 추가
        JPanel headerPanel = new JPanel();
        JLabel headerLabel = new JLabel("Header Area");
        headerPanel.add(headerLabel);
        add(headerPanel, BorderLayout.NORTH);
        
        JPanel mainPanel = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < clickButtons.length; i++) {
            clickButtons[i] = new JButton();
            mainPanel.add(clickButtons[i]);
            clickButtons[i].addActionListener(this::buttonClicked);
        }
        add(mainPanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
    	btnStart = new JButton("게임 시작");
    	
        btnStart.addActionListener(e -> {
            for (JButton button : clickButtons) {
                button.setEnabled(true); // 모든 버튼 활성화
            }
            btnStart.setEnabled(false); // 시작 버튼 비활성화
            inputNickname(); // 이름 입력 메서드 호출
        });        

    	// ButtonPanel 생성자 내에서 animalCreation 객체 생성 및 click 배열 전달
        animalCreation = new AnimalCreation(clickButtons, score, kMole);
        // 패널에 ID 입력 칸과 버튼 추가
        add(nameLab);
        add(userIdField);
        btnInputNickname = new JButton("닉네임 입력"); // 닉네임 입력 버튼 초기화
        btnInputNickname.addActionListener(e -> inputNickname());
        add(btnInputNickname);

        // 패널에 타이머 추가
        add(time);
        
        // 버튼 패널을 추가
        add(btn, BorderLayout.SOUTH);

        // 나머지 버튼 초기화 및 리스너 추가
        btnGameStart = new JButton("게임 시작");
        btnGameStart.addActionListener(e -> startGame());
        btnRetry = new JButton("다시 도전");
        btnRetry.addActionListener(e -> resetGame());
        btnShowLeaderboard = new JButton("순위표 보기");
        btnShowLeaderboard.addActionListener(e -> showLeaderboard());

        // 패널에 버튼 추가
        add(btnGameStart,BorderLayout.SOUTH);
        add(btnRetry,BorderLayout.SOUTH);
        add(btnShowLeaderboard,BorderLayout.SOUTH);
        add(score,BorderLayout.SOUTH);

        // 버튼 위치와 크기 설정
//        btnGameStart.setBounds(20, 20, 120, 30);
//        btnRetry.setBounds(160, 20, 120, 30);
//        btnShowLeaderboard.setBounds(300, 20, 120, 30);
    }

    public void off() {
		for(int i=0; i<clickButtons.length; i++)
			clickButtons[i].setEnabled(false);
	}
	
	public void on() {
		for(int i=0; i<clickButtons.length; i++)
			clickButtons[i].setEnabled(true);
	}
	// 추가된 버튼 이벤트 핸들러
    private void buttonClicked(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        int index = -1;
        for (int i = 0; i <clickButtons.length; i++) {
            if (clickedButton == clickButtons[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // 버튼 클릭 처리 로직 호출
            random(index);
        }
    }
	// 닉네임 입력
	 private void inputNickname() {
	        // 닉네임 입력 버튼 동작
	        String userId = userIdField.getText();
	        if (userId.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "닉네임을 입력하세요.");
	        } else {
	        	this.userId = userId; // 입력된 닉네임을 클래스 변수에 저장
	            userIdField.setEditable(false);
	            btnInputNickname.setEnabled(false);
	            btnGameStart.setEnabled(true); // 게임 시작 버튼 활성화
	        }
	    }
	
	// 게임 시작
	private void startGame() {
		on();
		btn.addActionListener(this);
		for(int i=0; i<clickButtons.length; i++)
			clickButtons[i].addActionListener(this);
		
		ran1 = (int) (Math.random() * clickButtons.length); // 아이콘이 나올 위치 랜덤 설정
		clickButtons[ran1].setIcon(icon1); // 랜덤 위치에 아이콘을 띄움
		
		Thread thread = new Thread(this);
        thread.start();
        
        PlayerInfo player = new PlayerInfo(userId, cnt);
        leaderboard.addScore(player);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btn) {
	        if (!gameInProgress) {
	            if (userId.isEmpty()) {
	                JOptionPane.showMessageDialog(this, "ID 입력하세요.");
	                namePan.setVisible(true); // 이름 패널 다시 보이게, 안쓰면 걍 없어짐
	            } else {
	                ran1 = (int) (Math.random() * clickButtons.length); // 아이콘이 나올 위치 랜덤 설정
	                clickButtons[ran1].setIcon(icon1); // 랜덤 위치에 아이콘을 띄움
	                Thread th = new Thread(this);
	                th.start(); // 타이머 시작
	                animalCreation.createRandomAnimal(ran1); // 랜덤 위치에 동물 생성 및 점수 업데이트
	                if (newGame) {
	                    originalUserId = userId;
	                    originalScore = cnt;
	                }
	            }
	        }
	    } else {
	        // else 부분이기에 click 버튼 이벤트 처리
	        for (int i = 0; i < clickButtons.length; i++) {
	            if (e.getSource() == clickButtons[i]) {
	                animalCreation.createRandomAnimal(i); // 클릭한 버튼의 인덱스에 따라 동물 생성 및 점수 업데이트
	            }
	        }
	    }
	    btnRetry.setEnabled(false); // 진행중 다시도전 비활성
	}

	
    // 게임 초기화
    private void resetGame() {
        // 게임 초기화 로직 추가
    	btnGameStart.setEnabled(true);
        btnRetry.setEnabled(false);
        gameInProgress = true; // 게임이 다시 시작되었음을 표시

        userId = ""; // userId 초기화
        cnt = 0; // cnt 초기화
        gameInProgress = false;
        
        kMoleIcon2 = 0; // kMoleIcon2 변수 초기화 (있는 경우에만)
        userIdField.setEditable(true); // 닉네임 입력 가능하도록 수정
        userIdField.setText(""); // 닉네임 필드 초기화
        btnInputNickname.setEnabled(true); // 닉네임 입력 버튼 활성화
        btnGameStart.setEnabled(false); // 게임 시작 버튼 비활성화
        cnt = 0; // 게임 시작 전의 점수로 복원
        n = 5;
        lastIcon = null;
        newGame = true; // 다시 도전 버튼 누를 때 새로운 게임으로 설정
        previousUserId = userId; // 현재 게임 id -> 이전게임 id로 저장
        previousScore = cnt;

        // 패널 내의 동물 아이콘 초기화 및 활성화
        for (JButton button : clickButtons) {
            button.setIcon(icon4);
            button.setEnabled(true);
        }

        score.setText("Score: " + cnt);
        time.setText("Time 0:60");
        namePan.setVisible(true); // 사용자 이름 입력창 보이게
        btnRetry.setEnabled(false); // 끝나고 다시 도전 버튼 비활성화

        // 다시 시작 버튼을 누른 상태에서 바로 아이콘을 띄우도록 호출
        if (!userId.isEmpty()) {
            on(); // 아이콘 띄우기 전에 버튼 활성화
            ran1 = (int) (Math.random() * clickButtons.length); // 아이콘이 나올 위치 랜덤 설정
            clickButtons[ran1].setIcon(icon1); // 랜덤 위치에 아이콘을 띄움
            Thread th = new Thread(this);
            th.start(); // 타이머 시작
            random(ran1); // 랜덤 위치에 아이콘을 띄우기 위해 호출
            
            // 게임 재시작시 PlayerInfo 객체 생성 및 추가
            PlayerInfo player = new PlayerInfo(userId, cnt);
            leaderboard.addScore(player); 
            
            // 순위표 보기
            showLeaderboard(); // 이 부분 추가
        }
    }
    
    private void random(int i) {

	    if (i != ran1 && i != ran2 && i != ran3) return;

	    synchronized (lock) {
	        if (clickButtons[i].getIcon() == icon1) {
	            cnt += 10; // 두더지 10점 추가
	        } else if (clickButtons[i].getIcon() == icon3) {
	            cnt -= 10; // 고슴도치 10점 감소
	            if (cnt < 0) {
	                cnt = 0;
	            }
	        } else if (clickButtons[i].getIcon() == icon2) {
	            cnt += 100; // 왕두더지 100점 추가
	            if (cnt < 0) {
	                cnt = 0;
	            }
	            kMoleIcon2++; // 왕두더지 등장 수 증가
	            if (kMoleIcon2 >= 2 && n <= 30) {
	                ran2 = (int) (Math.random() * clickButtons.length);
	                synchronized (lock) {
	                	clickButtons[ran2].setIcon(icon2);
	                }
	                kMoleIcon2++;
	                if (kMoleIcon2 > 2) {
	                    kMole = false;
	                }
	            }
	        }
	        score.setText("Score: " + cnt); // 점수 업데이트
	        clickButtons[i].setIcon(icon4);
	    }

	    Timer time = new Timer();
	    TimerTask timerTask = new TimerTask() {
	        @Override
	        public void run() {
	        	clickButtons[ran1].setIcon(icon4);
	            ran1 = (int) (Math.random() * clickButtons.length);
	            clickButtons[ran1].setIcon(icon1);
	        }
	    };
	    time.schedule(timerTask, 100);
	    
	    ran2 = (int) (Math.random() * clickButtons.length);
	    ran3 = (int) (Math.random() * clickButtons.length);

	    Random random = new Random();
	    int randomValue = random.nextInt(10);

	    if (randomValue < 4) { // 40% 확률로 고슴도치
	        synchronized (lock) {
	        	clickButtons[ran3].setIcon(icon3);
	        }
	    } else if (randomValue < 8) { // 40% 확률로 왕두더지
	        if (kMoleIcon2 < 2 && n <= 30) {
	            synchronized (lock) {
	            	clickButtons[ran2].setIcon(icon2);
	            }
	        } else {
	        	clickButtons[ran2].setIcon(icon4);
	        }
	    } else { // 20% 확률로 보이지 않는 아이콘
	    	clickButtons[ran3].setIcon(icon4);
	    }
		
	}
    
    @Override
    public void run() {
        n = 60; // 초기 시간 설정 (60초)
        while (n > 0) {
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n--;

            if (n == 0) { // 시간 초과 처리
                // 아이콘을 초기화하여 더 이상 나타나지 않도록 함
            	clickButtons[ran1].setIcon(icon4);
            	clickButtons[ran2].setIcon(icon4);
                // 시간 초과 메시지 표시 및 필요한 동작 수행
                time.setText("Game Over !!");
                off(); // 게임종료시 호출
//                addScoreToLeaderboard();
                btnRetry.setEnabled(true);
                break;
            }

            time.setText("Time 0:" + n);
        }
    }
    private void setListeners() {
    	btnShowLeaderboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLeaderboard();
            }
        });

        btnRetry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
                btnGameStart.setEnabled(true); // 게임버튼 활성화
            }
        });
        
    }


	// 순위표 보기
    private void showLeaderboard() {
        // 순위표 보기 로직 추가
//    	Leaderboard leaderboard = new Leaderboard(); // Leaderboard 클래스 객체 생성
        String leaderboardText = leaderboard.getLeaderboardText(); // 순위표 내용 가져오기
        
        JOptionPane.showMessageDialog(this, leaderboardText, "Leaderboard", JOptionPane.INFORMATION_MESSAGE);
    }


}
