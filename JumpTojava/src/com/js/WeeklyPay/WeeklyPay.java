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
		JFrame frame = new JFrame("주급 계산기");
		frame.setResizable(false);
		frame.setSize(400, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panelName = new JPanel();
		panelName.setBounds(10, 20, 200, 30);
		labelName = new JLabel("         이름 : ");
		fildName = new JTextField(10);
		panelName.add(labelName);
		panelName.add(fildName);
		
		JPanel panelWorkTime = new JPanel();
		panelWorkTime.setBounds(10, 60, 200, 30);
		labelWorkTime = new JLabel("근무시간 : ");
		fildWorkTime = new JTextField(10);
		panelWorkTime.add(labelWorkTime);
		panelWorkTime.add(fildWorkTime);
		
		JPanel panelHourly = new JPanel();
		panelHourly.setBounds(10, 100, 200, 30);
		labelHouly = new JLabel("         시급 : ");
		fildHouly = new JTextField(10);
		panelHourly.add(labelHouly);
		panelHourly.add(fildHouly);
		
		JButton btn1 = new JButton("계산 (S)");
		btn1.setSize(10, 10);
		btn1.setBounds(10, 160, 160, 30);
		btn1.setMnemonic('S');	//단축키를 Alt+ㄴ 로 설정
		
		JButton btn2 = new JButton("초기화 (D)");
		btn2.setSize(10, 10);
		btn2.setBounds(200, 160, 160, 30);
		btn2.setMnemonic('D');	//단축키를 Alt+D 로 설정
		
		labelWeekly = new JLabel("주급 : ");
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
		fildWorkTime.addKeyListener(new FildListener());	//숫자만 입력되는지 감시
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
					workTime = Integer.parseInt(fildWorkTime.getText());
					hourly = Integer.parseInt(fildHouly.getText());
					if (workTime > 40) {
						overTime = workTime - 40;
						workTime = workTime - overTime;
					}
					weekly = (int) ((workTime * hourly) + ((hourly * 1.5) * overTime));
					labelTotal.setText(df.format(weekly) + "원");
				} else if (com.equals("초기화 (D)")) {
					fildName.setText(null);
					fildWorkTime.setText(null);
					fildHouly.setText(null);
					labelTotal.setText(null);
					fildName.requestFocus();	//포커스를 fildName로 이동
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
