package com.js.AwtTest;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Button;

/* awt�� �� �̿��� ������(��ư) ����� */

public class FrameExam {
	Frame frame = new Frame("������");
	Button button = new Button("��ư");
	
	public void crateFrame() {
		frame.setSize(300, 300);	//������ ũ�� ����
		frame.setResizable(false);	//������ ũ�� ���� �Ұ��� ����
		
		/* ������ ��ġ�� ������ �ؽ�Ʈ ��ó�� ���ʿ��� ���������� ������Ʈ�� �迭�ȴ�. �⺻������ �߾� ���ĵȴ�.
		 * java.awt.FlowLayout�� import�ؾ��Ѵ�. */
		frame.setLayout(new FlowLayout());
		
		
		
		frame.add(button);			//�����ӿ� ������Ʈ �߰�
		frame.setVisible(true);		//������ ���̱�
	}
	
	public static void main(String[] args) {
		FrameExam frameExam = new FrameExam();	//������ ����
		frameExam.crateFrame();		//�޼ҵ带 ȣ��
	}
}
