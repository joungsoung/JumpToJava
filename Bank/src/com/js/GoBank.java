package com.js;

public class GoBank {
	@SuppressWarnings("unused")
	private String ����;
	@SuppressWarnings("unused")
	private int �ݾ�;

	private Bank go = new Bank();

	public void ����(String ����, int �ݾ�) {
		this.���� = ����;
		this.�ݾ� = �ݾ�;

		if (����.equals("1")) {
			go.�Ա�(�ݾ�);
		} else {
			go.���(�ݾ�);
		}
	}
	
	public void ����(String ����) {
		this.���� = ����;
		go.get�ܾ�();
	}
}
