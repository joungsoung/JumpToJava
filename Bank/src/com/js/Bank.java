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

		JOptionPane.showMessageDialog(null, name + "님 의 잔액 : " + df.format(balance));
	}

	public void deposit(String name, String choice, int money) {
		this.name = name;
		this.balance = bkw.select(name);
		bkw.insert(name, choice, money);
		
		JOptionPane.showMessageDialog(null, "전잔액 : " + df.format(balance) + "\n"
				+ "입금액 : " + df.format(money) +"\n"
						+ "최종잔액 : " + df.format(balance+money) + "\n"
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
		
		JOptionPane.showMessageDialog(null, "전잔액 : " + df.format(balance) + "\n"
				+ "출금액 : " + df.format(money) +"\n"
						+ "최종잔액 : " + df.format(balance-money) + "\n"
								+ "출금처리가 완료됬습니다.");
	}

}
