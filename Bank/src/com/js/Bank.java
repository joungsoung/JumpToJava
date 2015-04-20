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

		JOptionPane.showMessageDialog(null, name + "님 의 balance : " + balance + "원");
	}

	public void deposit(String name, String choice, int money) {
		this.name = name;
		this.balance = bkw.select(name);
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "전balance : " + balance + "\n"
				+ "입money : " + money +"\n"
						+ "최종money : " + (balance+money) + "\n"
								+ "입금처리가 완료됬습니다.");
	}

	public void withdrawa(String name, String choice, int money) {
		this.balance = bkw.select(name);
		
		if (balance < money) {
			JOptionPane.showMessageDialog(null, "거래 오류     \"balance부족\"");
			System.exit(0);
		}
		this.name = name;
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "전balance : " + balance + "\n"
				+ "출money : " + money +"\n"
						+ "최종money : " + (balance-money) + "\n"
								+ "출금처리가 완료됬습니다.");
	}

}

















