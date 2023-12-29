package com.acorn.control;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingMenu01 {
	
	JFrame f;
	JMenuBar mbTextEdit;
	JMenu muFile, muPrint;
	JMenuItem miCommand1, miCommand2, miCommand3, miCommand4, miCommand5;
	
	public SwingMenu01() {
		f = new JFrame("메뉴 예제");
		
		mbTextEdit = new JMenuBar();
		muFile = new JMenu("Menu");
		muPrint = new JMenu("Sub Menu");
		
		miCommand1 =  new JMenuItem("item 1");
		miCommand2 =  new JMenuItem("item 2");
		miCommand3 =  new JMenuItem("item 3");
		miCommand4 =  new JMenuItem("item 4");
		miCommand5 =  new JMenuItem("item 5");
		
		muFile.add(miCommand1); muFile.add(miCommand2); muFile.add(miCommand3); 
		muPrint.add(miCommand4); muPrint.add(miCommand5);
		muFile.add(muPrint);
		
		mbTextEdit.add(muFile);
		
		f.setJMenuBar(mbTextEdit);
		
		f.setLocation(500, 300);
		f.setSize(300, 500); 
		f.setLayout(null); 
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingMenu01();
	}

}
