package com.js;

public class BankRelays {
	@SuppressWarnings("unused")
	private String name, choice;
	@SuppressWarnings("unused")
	private int money;

	private Bank bnk = new Bank();

	public void relays(String name, String choice, int money) {
		this.name = name;
		this.choice = choice;
		this.money = money;

		if (choice.equals("1")) {
			bnk.deposit(name, choice, money);
		} else if (choice.equals("2")) {
			bnk.withdrawa(name, choice, money);
		}
	}
}
