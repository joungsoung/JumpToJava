package com.js.Test;

import javax.swing.JOptionPane;

public class WeeklyPay2 {
	public static void main(String[] args) {
		String name; // �̸��� ����� ����
		String timeV; // �ٹ��ð��� �Է��� ����
		String payV; // �ñ��� �Է��� ����
		String result; // �� ������ ������ ����
		int pay; // �Է¹��� pay�� ������ ����
		int time; // �ٹ��ð� ���� ����
		int tot; // �� ���� �޾�

		result = ""; // result �� ���� ���(�ʱ�ȭ)

		for (int i = 0; i < 3; i++) {
			name = JOptionPane.showInputDialog((i + 1) + "�� ������ �̸��� �Է��ϼ���.");
			timeV = JOptionPane.showInputDialog((i + 1) + "�� ������ �ٹ��ð��� �Է��ϼ���.");
			time = Integer.parseInt(timeV);
			payV = JOptionPane.showInputDialog((i + 1) + "�� ������ �ñ��� �Է��ϼ���.");
			pay = Integer.parseInt(payV);

			if (time / 40 >= 1) {
				tot = (time / 40) * pay * 40 + (time % 40) * pay * 15 / 10;
			} else {
				tot = time * pay;
			}

			if (i == 0) {
				result = "" + name + "\t" + tot + "\n";
			} else {
				result = "" + result + name + "\t" + tot + "\n";
			}
		}

		JOptionPane.showMessageDialog(null, result, "���",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
