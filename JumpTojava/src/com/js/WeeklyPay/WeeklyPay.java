package com.js.WeeklyPay;

import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class WeeklyPay extends JFrame {
	JLabel labelName, labelWorkTime, labelHouly, labelWeekly, labelTotal;
	JTextField fildName, fildWorkTime, fildHouly;
	
	public WeeklyPay() {
		JFrame frame = new JFrame("�ֱ� ����");
		frame.setResizable(false);
		frame.setSize(400, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panelName = new JPanel();
		panelName.setBounds(10, 20, 200, 30);
		labelName = new JLabel("         �̸� : ");
		fildName = new JTextField(10);
		panelName.add(labelName);
		panelName.add(fildName);
		
		JPanel panelWorkTime = new JPanel();
		panelWorkTime.setBounds(10, 60, 200, 30);
		labelWorkTime = new JLabel("�ٹ��ð� : ");
		fildWorkTime = new JTextField(10);
		panelWorkTime.add(labelWorkTime);
		panelWorkTime.add(fildWorkTime);
		
		JPanel panelHourly = new JPanel();
		panelHourly.setBounds(10, 100, 200, 30);
		labelHouly = new JLabel("         �ñ� : ");
		fildHouly = new JTextField(10);
		panelHourly.add(labelHouly);
		panelHourly.add(fildHouly);
		
		JButton btn1 = new JButton("��� (S)");
		btn1.setSize(10, 10);
		btn1.setBounds(10, 160, 160, 30);
		btn1.setMnemonic('S');	//����Ű�� Alt+�� �� ����
		
		JButton btn2 = new JButton("�ʱ�ȭ (D)");
		btn2.setSize(10, 10);
		btn2.setBounds(200, 160, 160, 30);
		btn2.setMnemonic('D');	//����Ű�� Alt+D �� ����
		
		labelWeekly = new JLabel("�ֱ� : ");
		labelWeekly.setBounds(40, 230, 160, 30);
		
		labelTotal = new JLabel("");
		labelTotal.setBounds(80, 230, 160, 30);
		
		frame.add(panelName);
		frame.add(panelWorkTime);
		frame.add(panelHourly);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(labelWeekly);
		frame.add(labelTotal);
		frame.setVisible(true);
		
		fildHouly.addKeyListener(new FildListener());
		fildWorkTime.addKeyListener(new FildListener());	//���ڸ� �ԷµǴ��� ����
		btn1.addActionListener(new BtnListener(this));
		btn2.addActionListener(new BtnListener(this));
	}
	
	private class FildListener extends KeyAdapter {
		String a;
		
		public void keyReleased(KeyEvent e) {
			JTextField s = (JTextField)e.getSource();
			
			try {
				if (!s.getText().isEmpty())
					Integer.parseInt(s.getText());
				a = s.getText();
			} catch (NumberFormatException k) {
				s.setText(a);
				JOptionPane.showMessageDialog(
						null, "���ڸ� �Է��ϼ���", "Not Number", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private class BtnListener implements ActionListener {
		int workTime, hourly, overTime, weekly;
		
		public BtnListener(JFrame f) {}	//�������� �ŰԺ����� JFrame�� ���� ������ �����ư���� Ȯ���� �ȵ�

		@Override
		public void actionPerformed(ActionEvent e) {
			DecimalFormat df = new DecimalFormat("#,###");
			Object com = e.getActionCommand();	//�����ư���� com�� ����
			
			try {
				if (com.equals("��� (S)")) {
					workTime = Integer.parseInt(fildWorkTime.getText());
					hourly = Integer.parseInt(fildHouly.getText());
					if (workTime > 40) {
						overTime = workTime - 40;
						workTime = workTime - overTime;
					}
					weekly = (int) ((workTime * hourly) + ((hourly * 1.5) * overTime));
					labelTotal.setText(df.format(weekly) + "��");
				} else if (com.equals("�ʱ�ȭ (D)")) {
					fildName.setText(null);
					fildWorkTime.setText(null);
					fildHouly.setText(null);
					labelTotal.setText(null);
					fildName.requestFocus();	//��Ŀ���� fildName�� �̵�
				}
			} catch (NumberFormatException k) {
				JOptionPane.showMessageDialog(
						null, "�Է������� �ùٸ��� �ʽ��ϴ�", null, JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	public static void main(String[] args) {
		new WeeklyPay();
	}
}
