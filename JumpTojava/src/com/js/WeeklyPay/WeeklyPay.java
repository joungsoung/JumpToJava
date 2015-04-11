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
	JFrame frame = new JFrame("�ֱ� ����");
	JPanel panelName = new JPanel();
	JPanel panelWorkTime = new JPanel();
	JPanel panelHouly = new JPanel();
	JLabel labelName = new JLabel("         �̸� : ");
	JLabel labelWorkTime = new JLabel("�ٹ��ð� : ");
	JLabel labelHouly = new JLabel("         �ñ� : ");
	JLabel labelWeekly = new JLabel("�ֱ� : ");
	JLabel labelTotal = new JLabel();
	JTextField fieldName = new JTextField(10);
	JTextField fieldWorkTime = new JTextField(10);
	JTextField fieldHouly = new JTextField(10);
	JButton btn1 = new JButton("��� (S)");
	JButton btn2 = new JButton("�ʱ�ȭ (D)");

	public WeeklyPay() {
		frame.setResizable(false);
		frame.setSize(400,  350);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		panelName.setBounds(10, 20, 200, 30);
		panelName.add(labelName);
		panelName.add(fieldName);
		
		panelWorkTime.setBounds(10, 60, 200, 30);
		panelWorkTime.add(labelWorkTime);
		panelWorkTime.add(fieldWorkTime);
		fieldWorkTime.addKeyListener(new FildListener());
		
		panelHouly.setBounds(10, 100, 200, 30);
		panelHouly.add(labelHouly);
		panelHouly.add(fieldHouly);
		fieldHouly.addKeyListener(new FildListener());
		
		btn1.setSize(10, 10);
		btn1.setBounds(10, 160, 160, 30);
		btn1.setMnemonic('S');
		btn1.addActionListener(new BtnListener(this));
		
		btn2.setSize(10, 10);
		btn2.setBounds(200, 160, 160, 30);
		btn2.setMnemonic('D');
		btn2.addActionListener(new BtnListener(this));
		
		labelWeekly.setBounds(40, 230, 160, 30);
		labelTotal.setBounds(80, 230, 160, 30);

		frame.add(panelName);
		frame.add(panelWorkTime);
		frame.add(panelHouly);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(labelWeekly);
		frame.add(labelTotal);
		frame.setVisible(true);
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
					workTime = Integer.parseInt(fieldWorkTime.getText());
					hourly = Integer.parseInt(fieldHouly.getText());
					if (workTime > 40) {
						overTime = workTime - 40;
						workTime = workTime - overTime;
					}
					weekly = (int) ((workTime * hourly) + ((hourly * 1.5) * overTime));
					labelTotal.setText(df.format(weekly) + "��");
				} else if (com.equals("�ʱ�ȭ (D)")) {
					fieldName.setText(null);
					fieldWorkTime.setText(null);
					fieldHouly.setText(null);
					labelTotal.setText(null);
					fieldName.requestFocus();	//��Ŀ���� fildName�� �̵�
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
