package com.acorn.controlevent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonDemo {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JButton btnOk;
	private JButton btnCancel;
	 
	public static void main(String[] args){
		JButtonDemo label = new JButtonDemo(); 
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
		
		btnOk = new JButton("확인");
		btnCancel = new JButton("취소");
		controlPanel.add(btnOk);
		controlPanel.add(btnCancel);
		
		btnOk.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("OK Button Clicked");
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText(statusLabel.getText() + " prior action is cancalled");
			}
		});
		
		mainFrame.setVisible(true); 
	}
}
