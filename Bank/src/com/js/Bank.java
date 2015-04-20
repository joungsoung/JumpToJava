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

		JOptionPane.showMessageDialog(null, name + "님 의 잔액 : " + balance + "원");
	}

	public void deposit(String name, String choice, int money) {
		this.name = name;
		this.balance = bkw.select(name);
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "전잔액 : " + balance + "\n"
				+ "입금액 : " + money +"\n"
						+ "최종잔액 : " + (balance+money) + "\n"
								+ "입금처리가 완료됬습니다.");
	}

	public void withdrawa(String name, String choice, int money) {
		this.balance = bkw.select(name);
		
		if (balance < money) {
			JOptionPane.showMessageDialog(null, "거래 오류     \"잔액부족\"");
			System.exit(0);
		}
		this.name = name;
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "전잔액 : " + balance + "\n"
				+ "출금액 : " + money +"\n"
						+ "최종자액 : " + (balance-money) + "\n"
								+ "출금처리가 완료됬습니다.");
	}

}
