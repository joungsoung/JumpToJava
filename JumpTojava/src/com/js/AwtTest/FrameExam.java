package com.js.AwtTest;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Button;

/* awt만 을 이용한 프레임(버튼) 만들기 */

public class FrameExam {
	Frame frame = new Frame("프레임");
	Button button = new Button("버튼");
	
	public void crateFrame() {
		frame.setSize(300, 300);	//프레임 크기 지정
		frame.setResizable(false);	//프레임 크기 조절 불가능 지정
		
		/* 순서도 배치는 문단의 텍스트 행처럼 왼쪽에서 오른쪽으로 컴포넌트가 배열된다. 기본적으로 중앙 정렬된다.
		 * java.awt.FlowLayout을 import해야한다. */
		frame.setLayout(new FlowLayout());
		
		
		
		frame.add(button);			//프레임에 컴포넌트 추가
		frame.setVisible(true);		//프레임 보이기
	}
	
	public static void main(String[] args) {
		FrameExam frameExam = new FrameExam();	//프레임 열기
		frameExam.crateFrame();		//메소드를 호출
	}
}
