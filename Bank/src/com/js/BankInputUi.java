package com.js;

import javax.swing.JOptionPane;

public class BankInputUi {
	private String 선택;
	private int 금액 = 0;
	
	GoBank go = new GoBank();

	public void inputBox() {
		String var = JOptionPane.showInputDialog(null, "작업 선택\n"
				+ "1)입금    2)출금    3)잔액확인");

		if (var.equals("") || !var.equals("1") && !var.equalsIgnoreCase("2") && !var.equals("3")) {
			JOptionPane.showMessageDialog(null, "선택오류");
			return;
		}
		this.선택 = var;
		
		if (var.equals("3")) {
			go.전달(선택);
			return;
		}

		String var2 = JOptionPane.showInputDialog(null,
				"입/출금 할 금액을 입력하세요 (숫자만 입력하세요)\n" + "1000 (O)     1,000 (X)");

		try {
			금액 = Integer.parseInt(var2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "입력오류");
			return;
		}
		go.전달(선택, 금액);
	}
	
	public static void main(String[] args) {
		BankInputUi i = new BankInputUi();
		i.inputBox();
	}
}
