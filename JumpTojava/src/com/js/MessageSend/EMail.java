package com.js.MessageSend;

import javax.swing.JOptionPane;

public class EMail extends Message {
	String fromAddr, title, msg, toAddr;
	
	public EMail(String  fromAddr, String  title, String  msg, String  toAddr) {
		this.fromAddr = fromAddr;
		this.title = title;
		this.msg = msg;
		this.toAddr = toAddr;
	}

	@Override
	public void send() {
		JOptionPane.showMessageDialog(null, "�������ּ�: " + fromAddr + "\r\n"
				+ "�޴��ּ�: " + toAddr + "\r\n"
				+ "����: " + title + "\r\n"
				+ "����: " + msg + "\r\n"
				+ "\r\nE-Mail �߼��� �Ϸ�Ǿ����ϴ�.");
	}
}
