package com.acorn.control;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLabel01 {
	
	JFrame f;
	JLabel labelFirst;
	JLabel labelSecond;
	
	public SwingLabel01() {
		f = new JFrame("Test Label");

		labelFirst = new JLabel("labelFirst");
		labelFirst.setBounds(150, 100, 80, 50);
		labelSecond = new JLabel("labelSecond");
		labelSecond.setBounds(150, 150, 80, 50);
		
		f.add(labelFirst);
		f.add(labelSecond);
		
		f.setSize(450, 600);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingLabel01();
	}

}
