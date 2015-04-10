package com.js.AwtTest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_Composite {
	JFrame jFrame = new JFrame();	//��ü���� ������
	JPanel jPanel = new JPanel();	//��ܿ� �� �г�
	
	JButton btn1 = new JButton("1����ư");
	JButton btn2 = new JButton("2����ư");
	JButton btn3 = new JButton("3����ư");
	JButton btn4 = new JButton("4����ư");
	
	public Layout_Composite() {
		
		//�гο� ��ư �߰�
		jPanel.add(btn1);
		jPanel.add(btn2);
		jFrame.add(jPanel, "North");	//�����ӿ� ���� �߰�
		
		//�����ӿ� ��ư �߰�
		jFrame.add(btn3, "West");
		jFrame.add(btn4, "Center");
		
		jFrame.setSize(300, 300);	//������ ũ��
		jFrame.setVisible(true);	//������ ���̱�
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Layout_Composite();
	}
}
