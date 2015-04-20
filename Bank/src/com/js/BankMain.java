package com.js;

import javax.swing.JOptionPane;

public class BankMain {
	private String choice, name;
	private int money = 0;
	
	BankRelays go = new BankRelays();
	Bank bnk = new Bank();

	public void inputBox() {
		String var1 = JOptionPane.showInputDialog(null, "name�� �����ּ���");
		
		if (var1.equals("")) {
			JOptionPane.showMessageDialog(null, "choice����");
			return;
		}
		this.name = var1;
		
		String var = JOptionPane.showInputDialog(null, "�۾� choice\n"
				+ "1)�Ա�    2)���    3)�ܾ�Ȯ��");

		if (var.equals("") || !var.equals("1") && !var.equalsIgnoreCase("2") && !var.equals("3")) {
			JOptionPane.showMessageDialog(null, "choice����");
			return;
		}
		this.choice = var;
		
		if (var.equals("3")) {
			bnk.getbalance(name);
			return;
		}

		String var2 = JOptionPane.showInputDialog(null,
				"��/��� �� money�� �Է��ϼ��� (���ڸ� �Է��ϼ���)\n" + "1000 (O)     1,000 (X)");

		try {
			money = Integer.parseInt(var2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�Է¿���");
			return;
		}
		go.relays(name, choice, money);
	}
	
	public static void main(String[] args) {
		BankMain i = new BankMain();
		i.inputBox();
	}
}
