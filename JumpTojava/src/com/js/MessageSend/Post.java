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
		JOptionPane.showMessageDialog(null, "보내는사람: " + from + "\r\n"
				+ "받는사람: " + to + "\r\n"
				+ "받을주소: " + title + "\r\n"
				+ "내용: " + msg + "\r\n"
				+ "\r\n편지 발송이 완료되었습니다.");
	}
}
