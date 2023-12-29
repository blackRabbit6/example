package com.acorn.controlevent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboDemo {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JComboBox<String> cbName;
	 
	public static void main(String[] args){
		JComboDemo label = new JComboDemo(); 
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

		String[] name = {"홍길동", "김길동", "박길동"};
		cbName = new JComboBox<String>(name);
		cbName.setBounds(30, 20, 80, 20);

		controlPanel.add(cbName);
		
		cbName.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {			
				statusLabel.setText(cbName.getSelectedItem().toString());
			}
		});
		
		mainFrame.setVisible(true); 
	}
}
