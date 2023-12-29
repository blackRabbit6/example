package com.acorn.control;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingArea01 {
	
	JFrame f;
	JTextArea taValue;
	
	public SwingArea01() {
		f = new JFrame("Text Form Example");
		
		taValue = new JTextArea("TextArea");
		taValue.setBounds(30, 20, 400, 250);

		f.add(taValue); 
		
		f.setSize(500, 350); 
		f.setLayout(null); 
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingArea01();
	}

}
