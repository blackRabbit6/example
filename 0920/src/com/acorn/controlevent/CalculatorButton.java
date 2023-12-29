package com.acorn.controlevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorButton {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new CalculatorFrame();
            frame.setTitle("계산기");
            frame.setSize(300, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class CalculatorFrame extends JFrame {
    private JTextField inputField;

    public CalculatorFrame() {
        // 레이아웃 설정
        setLayout(new BorderLayout());

        // 입력 필드 추가
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);
        add(inputField, BorderLayout.NORTH);

        // 버튼 패널 추가
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        // 버튼 배열 생성
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        // 버튼을 패널에 추가
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));

            if (label.equals("C")) {
                button.addActionListener(new ClearButtonListener());
            } else if (label.equals("=")) {
                button.addActionListener(new CalculateButtonListener());
            } else {
                button.addActionListener(new NumberButtonListener());
            }

            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String currentText = inputField.getText();
            String buttonText = button.getText();
            inputField.setText(currentText + buttonText);
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
        }
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String expression = inputField.getText();
                double result = evaluateExpression(expression);
                inputField.setText(Double.toString(result));
            } catch (Exception ex) {
                inputField.setText("오류");
            }
        }

        private double evaluateExpression(String expression) {
           
            return 0.0;
        }
    }
}
