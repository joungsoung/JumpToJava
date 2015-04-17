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
		JOptionPane.showMessageDialog(null, "보내는주소: " + fromAddr + "\r\n"
				+ "받는주소: " + toAddr + "\r\n"
				+ "제목: " + title + "\r\n"
				+ "내용: " + msg + "\r\n"
				+ "\r\nE-Mail 발송이 완료되었습니다.");
	}
}
