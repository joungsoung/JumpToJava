package com.js.Exam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Test6 extends JFrame {
	public Test6() {
		setTitle("윈도우 프로그램......");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea textA = new JTextArea();
		add(textA, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		JTextField textF = new JTextField(20);
		JButton btn1 = new JButton("추가");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tf = textF.getText();
				textA.append(tf + "\n");
				textF.setText("");
				textF.requestFocus();
			}
		});
		JButton btn2 = new JButton("종료");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(textF);
		panel.add(btn1);
		panel.add(btn2);
		add(panel, BorderLayout.SOUTH);		
		panel.setBackground(new Color(10, 200, 200));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test6();
	}
}
