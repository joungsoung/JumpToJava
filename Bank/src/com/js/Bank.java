package com.js;

import javax.swing.JOptionPane;

public class Bank {

	private int �ܾ� = 0;

	public int get�ܾ�() {
		return �ܾ�;
	}

	public void �Ա�(int �ݾ�) {
		this.�ܾ� += �ݾ�;
		JOptionPane.showMessageDialog(null, "���ܾ� : " + (�ܾ�-�ݾ�) + "\n"
				+ "�Աݾ� : " + �ݾ� +"\n"
						+ "�����ݾ� : " + �ܾ� + "\n"
								+ "�Ա�ó���� �Ϸ����ϴ�.");
	}

	public void ���(int �ݾ�) {
		if (�ܾ� < �ݾ�) {
			JOptionPane.showMessageDialog(null, "�ŷ� ����     \"�ܾ׺���\"");
			System.exit(0);
		}
		this.�ܾ� -= �ݾ�;
		JOptionPane.showMessageDialog(null, "���ܾ� : " + (�ܾ�+�ݾ�) + "\n"
				+ "��ݾ� : " + �ݾ� +"\n"
						+ "�����ݾ� : " + �ܾ� + "\n"
								+ "���ó���� �Ϸ����ϴ�.");
	}
}

















