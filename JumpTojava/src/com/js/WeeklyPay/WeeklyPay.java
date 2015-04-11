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
	JFrame frame = new JFrame("주급 계산기");
	JPanel panelName = new JPanel();
	JPanel panelWorkTime = new JPanel();
	JPanel panelHouly = new JPanel();
	JLabel labelName = new JLabel("         이름 : ");
	JLabel labelWorkTime = new JLabel("근무시간 : ");
	JLabel labelHouly = new JLabel("         시급 : ");
	JLabel labelWeekly = new JLabel("주급 : ");
	JLabel labelTotal = new JLabel();
	JTextField fieldName = new JTextField(10);
	JTextField fieldWorkTime = new JTextField(10);
	JTextField fieldHouly = new JTextField(10);
	JButton btn1 = new JButton("계산 (S)");
	JButton btn2 = new JButton("초기화 (D)");

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
						null, "숫자만 입력하세요", "Not Number", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private class BtnListener implements ActionListener {
		int workTime, hourly, overTime, weekly;
		
		public BtnListener(JFrame f) {}	//생성자의 매게변수로 JFrame를 주지 않으면 어느버튼인지 확인이 안됨

		@Override
		public void actionPerformed(ActionEvent e) {
			DecimalFormat df = new DecimalFormat("#,###");
			Object com = e.getActionCommand();	//어느버튼인지 com에 저장
			
			try {
				if (com.equals("계산 (S)")) {
					workTime = Integer.parseInt(fieldWorkTime.getText());
					hourly = Integer.parseInt(fieldHouly.getText());
					if (workTime > 40) {
						overTime = workTime - 40;
						workTime = workTime - overTime;
					}
					weekly = (int) ((workTime * hourly) + ((hourly * 1.5) * overTime));
					labelTotal.setText(df.format(weekly) + "원");
				} else if (com.equals("초기화 (D)")) {
					fieldName.setText(null);
					fieldWorkTime.setText(null);
					fieldHouly.setText(null);
					labelTotal.setText(null);
					fieldName.requestFocus();	//포커스를 fildName로 이동
				}
			} catch (NumberFormatException k) {
				JOptionPane.showMessageDialog(
						null, "입력정보가 올바르지 않습니다", null, JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	public static void main(String[] args) {
		new WeeklyPay();
	}
}
