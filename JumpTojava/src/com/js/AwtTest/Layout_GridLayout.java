package com.js.AwtTest;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_GridLayout {
	JFrame jFrame = new JFrame("프레임");
	JButton btn1 = new JButton("1번버튼");
	JButton btn2 = new JButton("2번버튼");
	JButton btn3 = new JButton("3번버튼");
	JButton btn4 = new JButton("4번버튼");
	JButton btn5 = new JButton("5번버튼");
	JButton btn6 = new JButton("6번버튼");
	
	public Layout_GridLayout() {
		//GredLayout 적용
		jFrame.setLayout(new GridLayout(0, 1));
		//컴퍼넌트를 넣을 컨테이너 구하기
		Container container = jFrame.getContentPane();
		
		//컨테이너에 컴포넌트 추가하기
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		container.add(btn4);
		container.add(btn5);
		container.add(btn6);
		
		jFrame.setSize(300,  300);	//프레임 크기 지정
		jFrame.setVisible(true);	//프레임 보이기
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout_GridLayout();
	}
}
