package com.acorn.control;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingTextField01 {
	
	JFrame f;
	JLabel lblFirstName, lblMiddleName, lblLastName, lblAge;	
	JTextField tflFirstName, tflMiddleName, tflLastName, tflAge;
	JButton btnClick;
	
	public SwingTextField01() {
		f = new JFrame("텍스트 필드 프로그램");

		lblFirstName = new JLabel("First Name"); lblFirstName.setBounds(30, 30, 80, 50);
		tflFirstName = new JTextField(); tflFirstName.setBounds(120, 40, 250, 30);
		
		lblMiddleName = new JLabel("Middle Name"); lblMiddleName.setBounds(30, 90, 80, 50);
		tflMiddleName = new JTextField(); tflMiddleName.setBounds(120, 100, 250, 30);
		
		lblLastName = new JLabel("Last Name"); lblLastName.setBounds(30, 150, 80, 50);
		tflLastName = new JTextField(); tflLastName.setBounds(120, 160, 250, 30);
		
		lblAge = new JLabel("Age"); lblAge.setBounds(30, 210, 40, 50);	
		tflAge = new JTextField(); tflAge.setBounds(120, 220, 80, 30);
		
		btnClick = new JButton("클릭");
		btnClick.setBounds(120, 260, 200, 30);
		
		f.add(lblFirstName); f.add(lblMiddleName); f.add(lblLastName); f.add(lblAge);	
		f.add(tflFirstName); f.add(tflMiddleName); f.add(tflLastName); f.add(tflAge);
		f.add(btnClick);
		
		f.setSize(500, 350); f.setLayout(null); f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingTextField01();
	}

}
