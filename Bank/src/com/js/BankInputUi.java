package com.js;

import javax.swing.JOptionPane;

public class BankInputUi {
	private String ����;
	private int �ݾ� = 0;
	
	GoBank go = new GoBank();

	public void inputBox() {
		String var = JOptionPane.showInputDialog(null, "�۾� ����\n"
				+ "1)�Ա�    2)���    3)�ܾ�Ȯ��");

		if (var.equals("") || !var.equals("1") && !var.equalsIgnoreCase("2") && !var.equals("3")) {
			JOptionPane.showMessageDialog(null, "���ÿ���");
			return;
		}
		this.���� = var;
		
		if (var.equals("3")) {
			go.����(����);
			return;
		}

		String var2 = JOptionPane.showInputDialog(null,
				"��/��� �� �ݾ��� �Է��ϼ��� (���ڸ� �Է��ϼ���)\n" + "1000 (O)     1,000 (X)");

		try {
			�ݾ� = Integer.parseInt(var2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�Է¿���");
			return;
		}
		go.����(����, �ݾ�);
	}
	
	public static void main(String[] args) {
		BankInputUi i = new BankInputUi();
		i.inputBox();
	}
}
