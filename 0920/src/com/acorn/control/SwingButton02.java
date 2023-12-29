package com.acorn.control;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingButton02 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public SwingButton02() {
		JButton b = new JButton("누르기");
		b.setBounds(130, 100, 150, 60);
		add(b);
		
		setSize(450, 600);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingButton02();
	}

}
