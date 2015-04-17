package com.js;

import javax.swing.JOptionPane;

public class Bank {

	private int 잔액 = 0;

	public int get잔액() {
		return 잔액;
	}

	public void 입금(int 금액) {
		this.잔액 += 금액;
		JOptionPane.showMessageDialog(null, "전잔액 : " + (잔액-금액) + "\n"
				+ "입금액 : " + 금액 +"\n"
						+ "최종금액 : " + 잔액 + "\n"
								+ "입금처리가 완료됬습니다.");
	}

	public void 출금(int 금액) {
		if (잔액 < 금액) {
			JOptionPane.showMessageDialog(null, "거래 오류     \"잔액부족\"");
			System.exit(0);
		}
		this.잔액 -= 금액;
		JOptionPane.showMessageDialog(null, "전잔액 : " + (잔액+금액) + "\n"
				+ "출금액 : " + 금액 +"\n"
						+ "최종금액 : " + 잔액 + "\n"
								+ "출금처리가 완료됬습니다.");
	}
}

















