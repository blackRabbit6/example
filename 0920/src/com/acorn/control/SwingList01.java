package com.acorn.control;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class SwingList01 {
	
	JFrame f;
	JList<String> lList;

	
	public SwingList01() {
		f = new JFrame("리스트 예제");
		
		DefaultListModel<String> dlm = new DefaultListModel<>();
		dlm.addElement("item1");
		dlm.addElement("item2");
		dlm.addElement("item3");
		dlm.addElement("item4");
		
		lList = new JList<String>(dlm);
		lList.setBounds(100, 30, 100, 80);
		
		f.add(lList);
		f.setLocation(500, 300);
		f.setSize(300, 500); 
		f.setLayout(null); 
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingList01();
	}
}
