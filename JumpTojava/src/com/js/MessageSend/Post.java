package com.js.MessageSend;

import javax.swing.JOptionPane;

public class Post extends Message {
	String title, from, to, msg;
	
	public Post(String from, String title, String to, String msg) {
		this.title = title;
		this.from = from;
		this.to = to;
		this.msg = msg;
	}

	@Override
	public void send() {
		JOptionPane.showMessageDialog(null, "�����»��: " + from + "\r\n"
				+ "�޴»��: " + to + "\r\n"
				+ "�����ּ�: " + title + "\r\n"
				+ "����: " + msg + "\r\n"
				+ "\r\n���� �߼��� �Ϸ�Ǿ����ϴ�.");
	}
}
