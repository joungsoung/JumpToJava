package com.js;

public class GoBank {
	private String ����;
	private int �ݾ�;

	public void ����(String ����, int �ݾ�) {
		this.���� = ����;
		this.�ݾ� = �ݾ�;

		Bank go = new Bank();

		if (����.equals("1")) {
			go.�Ա�(�ݾ�);
		} else {
			go.���(�ݾ�);
		}
	}
}
