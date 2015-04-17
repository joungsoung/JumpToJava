package com.js;

public class GoBank {
	@SuppressWarnings("unused")
	private String 선택;
	@SuppressWarnings("unused")
	private int 금액;

	private Bank go = new Bank();

	public void 전달(String 선택, int 금액) {
		this.선택 = 선택;
		this.금액 = 금액;

		if (선택.equals("1")) {
			go.입금(금액);
		} else {
			go.출금(금액);
		}
	}
	
	public void 전달(String 선택) {
		this.선택 = 선택;
		go.get잔액();
	}
}
