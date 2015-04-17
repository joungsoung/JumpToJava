package com.js;

import javax.swing.JOptionPane;

public class CoffeeMachineMain extends CoffeeMachine {
	
	private static int money, choice;

	public static void main(String[] args) {
		String var = JOptionPane.showInputDialog(null, "동전이나, 지페를 넣어주세요");
		try {
			money = Integer.parseInt(var);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "숫자만 입력할 수 있습니다.");
			System.exit(0);
		}
		
		String var2 = JOptionPane.showInputDialog(null, "원하시는 커피를 선택해 주세요\n"
				+ "1)블랙커피    2)설탕커피    3)프림커피");
		try {
			choice = Integer.parseInt(var2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "숫자만 입력할 수 있습니다.");
			System.exit(0);
		}
		
		CoffeeMachine co = new CoffeeMachine();
		
		if (money < co.coffeePrice[choice - 1]) {
			JOptionPane.showMessageDialog(null, co.coffeeKind[choice - 1]
					+ " 의 가격은" + co.coffeePrice[choice - 1] + "원 입니다\n"
					+ "돈을 더 넣으세요.");
			System.exit(0);
		}
		
		co.out(money, choice);
	}
}
