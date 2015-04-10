package com.js.AwtTest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_Composite {
	JFrame jFrame = new JFrame();	//전체적인 프레임
	JPanel jPanel = new JPanel();	//상단에 들어갈 패널
	
	JButton btn1 = new JButton("1번버튼");
	JButton btn2 = new JButton("2번버튼");
	JButton btn3 = new JButton("3번버튼");
	JButton btn4 = new JButton("4번버튼");
	
	public Layout_Composite() {
		
		//패널에 버튼 추가
		jPanel.add(btn1);
		jPanel.add(btn2);
		jFrame.add(jPanel, "North");	//프레임에 패털 추가
		
		//프레임에 버튼 추가
		jFrame.add(btn3, "West");
		jFrame.add(btn4, "Center");
		
		jFrame.setSize(300, 300);	//프레임 크기
		jFrame.setVisible(true);	//프레임 보이기
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout_Composite();
	}
}
