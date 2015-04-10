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
		//super("������");						//������ ���� ����
		this.setTitle("������");				//������ ���� ����
		this.setLayout(new FlowLayout());	//���̾ƿ� ����
		
		this.add(b1);	//��ư1 �߰�
		this.add(b2);	//��ư2 �߰�
		this.add(b3);	//��ư3 �߰�
		
		this.setSize(300, 400);	//������ ũ�� ����
		this.setVisible(true);	//������ ���̵��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ��ư Ȱ��
	}
	
	public static void main(String[] args) {
		new Layout_FlowLayout();
	}
}
