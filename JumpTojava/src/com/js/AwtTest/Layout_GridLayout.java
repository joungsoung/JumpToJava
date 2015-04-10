package com.js.AwtTest;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout_GridLayout {
	JFrame jFrame = new JFrame("������");
	JButton btn1 = new JButton("1����ư");
	JButton btn2 = new JButton("2����ư");
	JButton btn3 = new JButton("3����ư");
	JButton btn4 = new JButton("4����ư");
	JButton btn5 = new JButton("5����ư");
	JButton btn6 = new JButton("6����ư");
	
	public Layout_GridLayout() {
		//GredLayout ����
		jFrame.setLayout(new GridLayout(0, 1));
		//���۳�Ʈ�� ���� �����̳� ���ϱ�
		Container container = jFrame.getContentPane();
		
		//�����̳ʿ� ������Ʈ �߰��ϱ�
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		container.add(btn4);
		container.add(btn5);
		container.add(btn6);
		
		jFrame.setSize(300,  300);	//������ ũ�� ����
		jFrame.setVisible(true);	//������ ���̱�
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout_GridLayout();
	}
}
