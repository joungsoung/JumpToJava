package com.js;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Bank {

	@SuppressWarnings("unused")
	private String name;
	int balance;
	
	BankDBWriter bkw = new BankDBWriter();
	DecimalFormat df = new DecimalFormat("#,##0");

	public void getbalance(String name) {
		this.name = name;
		this.balance = bkw.select(name);

		JOptionPane.showMessageDialog(null, name + "�� �� �ܾ� : " + df.format(balance));
	}

	public void deposit(String name, String choice, int money) {
		this.name = name;
		this.balance = bkw.select(name);
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "���ܾ� : " + df.format(balance) + "\n"
				+ "�Աݾ� : " + df.format(money) +"\n"
						+ "�����ܾ� : " + df.format(balance+money) + "\n"
								+ "�Ա�ó���� �Ϸ����ϴ�.");
	}

	public void withdrawa(String name, String choice, int money) {
		this.balance = bkw.select(name);
		
		if (balance < money) {
			JOptionPane.showMessageDialog(null, "�ŷ� ����     \"�ܾ׺���\"");
			System.exit(0);
		}
		this.name = name;
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "���ܾ� : " + df.format(balance) + "\n"
				+ "��ݾ� : " + df.format(money) +"\n"
						+ "�����ܾ� : " + df.format(balance-money) + "\n"
								+ "���ó���� �Ϸ����ϴ�.");
	}

}
