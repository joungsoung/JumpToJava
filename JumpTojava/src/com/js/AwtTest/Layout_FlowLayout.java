package com.js.AwtTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Layout_FlowLayout extends JFrame {
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	
	public Layout_FlowLayout() {
		//super("프레임");						//프레임 제목 설정
		this.setTitle("프레임");				//프레임 제목 설정
		this.setLayout(new FlowLayout());	//레이아웃 설정
		
		this.add(b1);	//버튼1 추가
		this.add(b2);	//버튼2 추가
		this.add(b3);	//버튼3 추가
		
		this.setSize(300, 400);	//프레임 크기 지정
		this.setVisible(true);	//프레임 보이도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 활성
	}
	
	public static void main(String[] args) {
		new Layout_FlowLayout();
	}
}
