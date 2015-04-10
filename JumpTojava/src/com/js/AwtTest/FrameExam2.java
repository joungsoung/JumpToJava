package com.js.AwtTest;

import javax.swing.JButton;
import javax.swing.JFrame;

/* swing 를 이용한 프레임(버튼) 만들기 */

public class FrameExam2 {
	JFrame frame = new JFrame("프레임");
	JButton button = new JButton("버튼");
	
	public void createFrame() {
		frame.add(button);			//프레임에 컴포넌트 추가
		frame.setSize(300, 600);	//프레임 크기 지정
		frame.setVisible(true);		//프레임 보이기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//JFrame에 만 있는 닫기버튼 활성
	}
	
	public static void main(String[] args) {
		FrameExam2 frameExam2 = new FrameExam2();
		frameExam2.createFrame();

	}
}
