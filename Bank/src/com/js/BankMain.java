package com.js;

import javax.swing.JOptionPane;

public class BankMain {
	private String choice, name;
	private int money = 0;
	
	BankRelays go = new BankRelays();
	Bank bnk = new Bank();

	public void inputBox() {
		String var1 = JOptionPane.showInputDialog(null, "이름 을 적어주세요");
		
		if (var1.equals("")) {
			JOptionPane.showMessageDialog(null, "선택오류");
			return;
		}
		this.name = var1;
		
		String var = JOptionPane.showInputDialog(null, "작업 선택\n"
				+ "1)입금    2)출금    3)잔액확인");

		if (var.equals("") || !var.equals("1") && !var.equalsIgnoreCase("2") && !var.equals("3")) {
			JOptionPane.showMessageDialog(null, "선택오류");
			return;
		}
		this.choice = var;
		
		if (var.equals("3")) {
			bnk.getbalance(name);
			return;
		}

		String var2 = JOptionPane.showInputDialog(null,
				"입/출금 할 금액을 입력하세요 (숫자만 입력하세요)\n" + "1000 (O)     1,000 (X)");

		try {
			money = Integer.parseInt(var2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "입력오류");
			return;
		}
		go.relays(name, choice, money);
	}
	
	public static void main(String[] args) {
		BankMain i = new BankMain();
		i.inputBox();
	}
}
