package com.acorn.controlevent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldDemo {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JLabel lblid;
	private JTextField tfid;
	private JButton btnClick;
	 
	public static void main(String[] args){
		JTextFieldDemo label = new JTextFieldDemo(); 
		label.showLabel();
	}
	
	private void showLabel (){
		mainFrame = new JFrame("Java Swing Button Control");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3, 1));
	
		headerLabel = new JLabel("", JLabel.CENTER); 
		statusLabel = new JLabel("",JLabel.CENTER); 
		statusLabel.setSize(350,100);
		controlPanel = new JPanel();
		
		controlPanel.setLayout(new FlowLayout());
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		
		headerLabel.setText("Control in action: JLabel"); 
		statusLabel.setText("Good luck"); 

		lblid = new JLabel("이름");
		tfid = new JTextField(10);
		btnClick = new JButton("확인");
		
		btnClick.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = tfid.getText();
				if(str.length() >= 1) {
					statusLabel.setText(str);
				} else {
					statusLabel.setText("이름을 입력해주세요");
				}
			}
		});
		
		controlPanel.add(lblid);
		controlPanel.add(tfid);
		controlPanel.add(btnClick);
		

		
		mainFrame.setVisible(true); 
	}
}
