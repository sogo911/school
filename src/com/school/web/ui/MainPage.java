package com.school.web.ui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainPage extends JFrame{
	
	JButton btn1, btn2, btn3, btn4;
	
	public MainPage() {   //생성자의 규칙. 퍼블릭 + 클레스명과 동일
		super("학생간리시스템");
		btn1 = new JButton ("학생수");
		btn2 = new JButton ("학생등록");
		btn3 = new JButton ("학생검색");
		btn4 = new JButton ("학생목록");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		pack();
		
		
		setLocation(300,300);
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}