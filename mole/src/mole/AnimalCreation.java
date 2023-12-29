package mole;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AnimalCreation extends JComponent{
    private ImageIcon icon1;
    private ImageIcon icon2;
    private ImageIcon icon3;
    private ImageIcon icon4;
    private final Object lock = new Object();
    private ImageIcon lastIcon = null;

    // 새로운 변수 초기화
    private JButton[] click;
    private JLabel score;
    private boolean kMole;
    private int kMoleIcon2 = 0;
    private int n = 0; // 여기에 초기값을 설정해야 합니다.
    private int cnt = 0;

    public AnimalCreation(JButton[] click, JLabel score, boolean kMole) {
        this.click = click;
        this.score = score;
        this.kMole = kMole;
        icon1 = new ImageIcon(AnimalCreation.class.getResource("/mole/img/digda.png"));
        icon2 = new ImageIcon(AnimalCreation.class.getResource("/mole/img/digda2.png"));
        icon3 = new ImageIcon(AnimalCreation.class.getResource("/mole/img/dochi.png"));
        icon4 = new ImageIcon(AnimalCreation.class.getResource("/mole/img/null.png"));
        
        for (int i = 0; i < click.length; i++) {
            final int index = i; // 익명 내부 클래스에서 사용하기 위한 변수
            click[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    createRandomAnimal(index);
                }
            });
        }
    }

    // 동물 랜덤 생성 로직
    public void createRandomAnimal(int index) {
        Random random = new Random();
        int randomValue = random.nextInt(10);

        if (randomValue < 4) { // 40% 확률로 고슴도치
            synchronized (lock) {
                click[index].setIcon(icon3);
                updateScore(icon3);
            }
        } else if (randomValue < 8) { // 40% 확률로 왕두더지
            if (kMoleIcon2 < 2 && n <= 30 && kMole) {
                synchronized (lock) {
                    click[index].setIcon(icon2);
                    updateScore(icon2);
                }
                kMoleIcon2++;
                if (kMoleIcon2 > 2) {
                    kMole = false;
                }
            } else {
                click[index].setIcon(icon4);
            }
        } else { // 20% 확률로 보이지 않는 아이콘
            click[index].setIcon(icon4);
        }
    }

    // 점수 업데이트 로직
    public int updateScore(ImageIcon icon) {
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
        return cnt;
    }

    private boolean isIconEqual(ImageIcon icon1, ImageIcon icon2) {
        return icon1.getImage().equals(icon2.getImage());
    }
}
