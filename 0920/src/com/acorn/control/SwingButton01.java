package com.acorn.control;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButton01 {
	JFrame f;
	
	public SwingButton01() {
		
		f = new JFrame();
		JButton b = new JButton("누르기");
		b.setBounds(130, 100, 150, 60);
		f.add(b);
		
		f.setSize(450, 600);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingButton01();
	}

}
