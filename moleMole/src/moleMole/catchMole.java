package moleMole;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class ScoreEntry {
    private String playerName;
    private int score;

    public ScoreEntry(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}

public class catchMole extends JFrame implements ActionListener, Runnable {
    JButton start = new JButton("Start");
    JButton set[] = new JButton[12];
    ImageIcon iconMole = new ImageIcon(catchMole.class.getResource("//moleMole/img/digda.png"));
    ImageIcon iconKingMole = new ImageIcon(catchMole.class.getResource("//moleMole/img/digda2.png"));
    ImageIcon iconHedgehog = new ImageIcon(catchMole.class.getResource("//moleMole/img/dochi.png"));
    JLabel score = new JLabel("Score : 0");
    JLabel time = new JLabel("Time 0:10");
    Container c = getContentPane();
    JPanel PanelD = new JPanel();
    JPanel PanelSc = new JPanel();
    JPanel PanelSt = new JPanel();
    JTextField inputField = new JTextField(20);
    int cnt = 0;
    int n = 10;
    boolean gameRunning = false;

    private static final int IMAGE_DISPLAY_TIME = 1000;
    private static final int MAX_VISIBLE_IMAGES = 5;

    private ArrayList<ScoreEntry> scoreEntries = new ArrayList<>();
    private JTextArea leaderboardTextArea = new JTextArea(10, 30);

    catchMole() {
        setTitle("Catch Moles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(new BorderLayout(10, 10));
        time.setFont(new Font("Arial", Font.BOLD, 20));
        score.setFont(new Font("Arial", Font.BOLD, 20));

        c.add(time, BorderLayout.NORTH);

        c.add(PanelD, BorderLayout.CENTER);
        PanelD.setLayout(new GridLayout(3, 4));
        for (int i = 0; i < set.length; i++) {
            set[i] = new JButton();
            PanelD.add(set[i], BorderLayout.CENTER);
            set[i].setBorderPainted(false);
            set[i].setFocusPainted(false);
            set[i].setBackground(Color.DARK_GRAY);
        }
        c.add(PanelSc, BorderLayout.SOUTH);
        PanelSc.setLayout(new GridLayout(1, 2));
        PanelSc.add(score);

        PanelSc.add(PanelSt);
        PanelSt.setLayout(new FlowLayout(FlowLayout.RIGHT));
        PanelSt.add(start);
        PanelSt.add(inputField);

        leaderboardTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(leaderboardTextArea);
        c.add(scrollPane, BorderLayout.EAST);

        PanelD.setBackground(Color.DARK_GRAY);
        PanelSt.setBackground(Color.LIGHT_GRAY);
        PanelSc.setBackground(Color.LIGHT_GRAY);
        c.setBackground(Color.LIGHT_GRAY);

        start.addActionListener(this);
        for (int i = 0; i < set.length; i++)
            set[i].addActionListener(this);

        setSize(700, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            if (!gameRunning) {
                String playerName = inputField.getText();
                if (playerName.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "플레이어 이름을 입력하세요", "경고", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                gameRunning = true;
                start.setText("Restart");
                StartGame();
            } else {
                String playerName = inputField.getText();
                if (playerName.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "플레이어 이름을 입력하세요", "경고", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                RestartGame();
            }
        } else {
            for (int i = 0; i < set.length; i++) {
                if (e.getSource() == set[i] && gameRunning) {
                    if (set[i].getIcon() != null) {
                        updateScore(set[i].getIcon());
                        set[i].setIcon(null);
                        set[i].setEnabled(false);
                    }
                }
            }
        }
    }

    public void StartGame() {
        on();
        Thread th = new Thread(this);
        th.start();
        random();
    }

    public void RestartGame() {
        cnt = 0;
        n = 30;
        score.setText("Score : 0");
        time.setText("Time 0:10");
        off();
        gameRunning = false;
        start.setText("Start");
        for (int i = 0; i < set.length; i++) {
            set[i].setIcon(null);
            set[i].setEnabled(false);
        }
    }

    private void updateScore(Icon icon) {
        if (icon == iconMole) {
            cnt += 10;
        } else if (icon == iconKingMole) {
            cnt += 100;
        } else if (icon == iconHedgehog) {
            cnt -= 10;
            if (cnt < 0) {
                cnt = 0;
            }
        }
        score.setText("Score : " + cnt);
    }

    private void random() {
        javax.swing.Timer tm = new javax.swing.Timer(0, null);
        tm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int visibleImageCount = (int) (Math.random() * (MAX_VISIBLE_IMAGES + 1));
                boolean hedgehogAlreadySelected = false;

                for (int i = 0; i < visibleImageCount; i++) {
                    int randomButtonIndex = (int) (Math.random() * set.length);

                    int randomMole;
                    if (hedgehogAlreadySelected) {
                        randomMole = (int) (Math.random() * 2);
                    } else {
                        randomMole = (int) (Math.random() * 3);
                    }

                    if (randomMole == 0) {
                        set[randomButtonIndex].setIcon(iconMole);
                    } else if (randomMole == 1) {
                        set[randomButtonIndex].setIcon(iconKingMole);
                    } else {
                        set[randomButtonIndex].setIcon(iconHedgehog);
                        hedgehogAlreadySelected = true;
                    }

                    set[randomButtonIndex].setEnabled(true);
                    javax.swing.Timer iconRemoveTimer = new javax.swing.Timer(0, null);
                    iconRemoveTimer.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            set[randomButtonIndex].setIcon(null);
                            set[randomButtonIndex].setEnabled(false);
                        }
                    });
                    iconRemoveTimer.setInitialDelay(IMAGE_DISPLAY_TIME);
                    iconRemoveTimer.setRepeats(false);
                    iconRemoveTimer.start();
                }
            }
        });
        tm.setDelay(1000);
        tm.setRepeats(true);
        tm.start();
    }

    @Override
    public void run() {
        n = 10;
        while (gameRunning) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            n--;
            if (n == 0) {
                for (int i = 0; i < set.length; i++) {
                    set[i].setIcon(null);
                    set[i].setEnabled(false);
                }
                time.setText("Game Over !!");
                off();
                gameRunning = false;
                start.setText("Restart");
                break;
            }
            time.setText("Time 0:" + n);
        }
        updateLeaderboard();
        cnt = 0;
        
    }

    private void off() {
        for (int i = 0; i < set.length; i++)
            set[i].setEnabled(false);
    }

    private void on() {
        for (int i = 0; i < set.length; i++)
            set[i].setEnabled(true);
    }

    // 게임이 종료된 후 플레이어 이름과 점수를 추가
    private void updateLeaderboard() {
        String playerName = inputField.getText(); // 플레이어 이름 가져오기
        scoreEntries.add(new ScoreEntry(playerName, cnt));
        Collections.sort(scoreEntries, Comparator.comparingInt(ScoreEntry::getScore).reversed()); // 플레이어 이름과 점수를 scoreEntries에 추가

        StringBuilder leaderboardText = new StringBuilder("순위표:\n");
        for (int i = 0; i < Math.min(scoreEntries.size(), 5); i++) {
            ScoreEntry entry = scoreEntries.get(i);
            leaderboardText.append(i + 1).append(". ").append(entry.getPlayerName()).append(": ")
                    .append(entry.getScore()).append("\n");
        }

        leaderboardTextArea.setText(leaderboardText.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new catchMole());
    }
}