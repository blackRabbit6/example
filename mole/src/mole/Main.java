package mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("두더지 게임");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 700);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            // JButton 배열 생성
            JButton[] clickButtons = new JButton[16];
            for (int i = 0; i < clickButtons.length; i++) {
                clickButtons[i] = new JButton();
            }

            JLabel scoreLabel = new JLabel("Score: 0"); // 점수를 표시할 JLabel 생성
            boolean kMole = true; // 왕두더지 등장 여부 초기값 설정

            JPanel iconPanel = new JPanel();
            // 프레임의 컨텐트 팬에 AnimalCreation 패널 추가
            frame.add(iconPanel, BorderLayout.NORTH); // 아이콘 이미지 패널을 프레임에 추가

            // AnimalCreation 객체 생성 초기화
            AnimalCreation animalCreation = new AnimalCreation(clickButtons, scoreLabel, kMole);
            frame.add(animalCreation, BorderLayout.CENTER);

            // Leaderboard 객체 생성
            Leaderboard leaderboard = new Leaderboard();

            // ButtonPanel 객체 생성
            ButtonPanel1 buttonPanel = new ButtonPanel1(leaderboard, clickButtons);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}