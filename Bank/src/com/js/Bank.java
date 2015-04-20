package com.js;

import javax.swing.JOptionPane;

public class Bank {

	@SuppressWarnings("unused")
	private String name;
	int balance;
	
	BankDBWriter bkw = new BankDBWriter();

	public void getbalance(String name) {
		this.name = name;
		this.balance = bkw.select(name);

		JOptionPane.showMessageDialog(null, name + "�� �� �ܾ� : " + balance + "��");
	}

	public void deposit(String name, String choice, int money) {
		this.name = name;
		this.balance = bkw.select(name);
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "���ܾ� : " + balance + "\n"
				+ "�Աݾ� : " + money +"\n"
						+ "�����ܾ� : " + (balance+money) + "\n"
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
		
		JOptionPane.showMessageDialog(null, "���ܾ� : " + balance + "\n"
				+ "��ݾ� : " + money +"\n"
						+ "�����ھ� : " + (balance-money) + "\n"
								+ "���ó���� �Ϸ����ϴ�.");
	}

}
