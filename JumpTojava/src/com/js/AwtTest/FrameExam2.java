package com.js.AwtTest;

import javax.swing.JButton;
import javax.swing.JFrame;

/* swing �� �̿��� ������(��ư) ����� */

public class FrameExam2 {
	JFrame frame = new JFrame("������");
	JButton button = new JButton("��ư");
	
	public void createFrame() {
		frame.add(button);			//�����ӿ� ������Ʈ �߰�
		frame.setSize(300, 600);	//������ ũ�� ����
		frame.setVisible(true);		//������ ���̱�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//JFrame�� �� �ִ� �ݱ��ư Ȱ��
	}
	
	public static void main(String[] args) {
		FrameExam2 frameExam2 = new FrameExam2();
		frameExam2.createFrame();

	}
}
