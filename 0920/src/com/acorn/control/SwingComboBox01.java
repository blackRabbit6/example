package com.acorn.control;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SwingComboBox01 {
	
	JFrame f;
	JComboBox<String> cbName;
	
	public SwingComboBox01() {
		f = new JFrame("콤보박스 예제");
		
		String[] name = {"홍길동", "김길동", "박길동"};
		cbName = new JComboBox<String>(name);
		cbName.setBounds(30, 20, 80, 20);

		f.add(cbName); 
		
		f.setLocation(500, 300);
		f.setSize(300, 500); 
		f.setLayout(null); 
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingComboBox01();
	}

}
