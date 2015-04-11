package com.js.AwtTest;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SwingStudy extends JFrame {
	
	private JFrame frame = new JFrame("Age Frame");
	private JPanel panel1 = new JPanel();
	private JLabel labelName = new JLabel("�̸� : ");
	private JLabel labelAge = new JLabel("���� : ");
	private JLabel labelAnswer = new JLabel("Answer : ");
	private JLabel labelCommend = new JLabel();
	private JTextField fieldName = new JTextField(10);
	private JTextField fieldAge = new JTextField(10);
	private JButton btnAction = new JButton("�׼� (A)");
	private JButton btnReset = new JButton("�ʱ�ȭ (R)");
	
	public SwingStudy() {
		
		frame.setResizable(false);
		frame.setSize(310, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		panel1.setBackground(Color.GREEN);
		panel1.add(labelName);
		panel1.add(fieldName);
		panel1.add(labelAge);
		panel1.add(fieldAge);
		panel1.setBounds(15, 15, 170, 60);
		
		labelAnswer.setBounds(15, 110, 60, 50);
		labelCommend.setHorizontalAlignment(JTextField.LEFT);
		labelCommend.setBounds(70, 121, 300, 30);
		btnAction.setBounds(190, 16, 100, 25);
		btnAction.setMnemonic('A');
		btnAction.addActionListener(new BtnListener(this));
		btnReset.setBounds(190, 50, 100, 25);
		btnReset.setMnemonic('R');
		btnReset.addActionListener(new BtnListener(this));

		frame.add(labelAnswer);
		frame.add(labelCommend);
		frame.add(panel1);
		frame.add(btnAction);
		frame.add(btnReset);
		frame.setVisible(true);
	}

	public class BtnListener implements ActionListener {
		public BtnListener(JFrame f) {}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("�׼� (A)")) {
				if (fieldName.getText().equals("") || fieldAge.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�Է������� �ùٸ��� �ʽ��ϴ�.");
				} else {
					labelCommend.setText(fieldName.getText() + "�� �� ���̴� " + fieldAge.getText() + "�� �Դϴ�.");
				}
			} else if (e.getActionCommand().equals("�ʱ�ȭ (R)")) {
				fieldName.setText(null);
				fieldAge.setText(null);
				labelCommend.setText(null);
				fieldName.requestFocus();
			}
		}
	}

	public static void main(String[] agsg) {
		new SwingStudy();
	}
}
