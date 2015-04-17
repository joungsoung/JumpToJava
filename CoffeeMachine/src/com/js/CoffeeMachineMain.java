package com.js;

import javax.swing.JOptionPane;

public class CoffeeMachineMain extends CoffeeMachine {
	
	private static int money, choice;

	public static void main(String[] args) {
		String var = JOptionPane.showInputDialog(null, "�����̳�, ���並 �־��ּ���");
		try {
			money = Integer.parseInt(var);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "���ڸ� �Է��� �� �ֽ��ϴ�.");
			System.exit(0);
		}
		
		String var2 = JOptionPane.showInputDialog(null, "���Ͻô� Ŀ�Ǹ� ������ �ּ���\n"
				+ "1)��Ŀ��    2)����Ŀ��    3)����Ŀ��");
		try {
			choice = Integer.parseInt(var2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "���ڸ� �Է��� �� �ֽ��ϴ�.");
			System.exit(0);
		}
		
		CoffeeMachine co = new CoffeeMachine();
		
		if (money < co.coffeePrice[choice - 1]) {
			JOptionPane.showMessageDialog(null, co.coffeeKind[choice - 1]
					+ " �� ������" + co.coffeePrice[choice - 1] + "�� �Դϴ�\n"
					+ "���� �� ��������.");
			System.exit(0);
		}
		
		co.out(money, choice);
	}
}
