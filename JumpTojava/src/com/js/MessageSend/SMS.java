package com.js.MessageSend;

import javax.swing.JOptionPane;

public class SMS extends Message {
	String to, msg, from;
	
	public SMS(String to, String msg, String from) {
		this.to = to;
		this.msg = msg;
		this.from = from;
	}

	@Override
	public void send() {
		JOptionPane.showMessageDialog(null, "���Ź�ȣ: " + to + "\r\n"
				+ "�߽Ź�ȣ: " + from + "\r\n"
				+ "����: " + msg + "\r\n"
				+ "\r\nSMS �߼��� �Ϸ�Ǿ����ϴ�.");
	}
}
