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
		JOptionPane.showMessageDialog(null, "수신번호: " + to + "\r\n"
				+ "발신번호: " + from + "\r\n"
				+ "내용: " + msg + "\r\n"
				+ "\r\nSMS 발송이 완료되었습니다.");
	}
}
