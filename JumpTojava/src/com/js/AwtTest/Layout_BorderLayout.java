package com.js.AwtTest;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_BorderLayout {
	JFrame jFrame = new JFrame("프레임");
	JButton btn1 = new JButton("1번버튼");
	JButton btn2 = new JButton("2번버튼");
	JButton btn3 = new JButton("3번버튼");
	JButton btn4 = new JButton("4번버튼");
	JButton btn5 = new JButton("5번버튼");
	
	public Layout_BorderLayout() {
		//컴퍼넌트를 넣을 컨테이너 구하기
		Container container = jFrame.getContentPane();
		
		//컨테이너에 컴포넌트를 추가
		container.add(btn1, BorderLayout.NORTH);
		container.add(btn2, BorderLayout.EAST);
		container.add(btn3, BorderLayout.WEST);
		container.add(btn4, BorderLayout.SOUTH);
		container.add(btn5, BorderLayout.CENTER);
		
		jFrame.setSize(300, 300);	//프레임 크기 지정
		jFrame.setVisible(true);	//프레임 보이기 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout_BorderLayout();
	}
}
