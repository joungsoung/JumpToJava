package com.js.Test;

import javax.swing.JOptionPane;

public class WeeklyPay2 {
	public static void main(String[] args) {
		String name; // 이름을 기억할 공간
		String timeV; // 근무시간을 입력할 공간
		String payV; // 시급을 입력할 공간
		String result; // 총 내용을 저장할 공간
		int pay; // 입력받은 pay를 정수로 저장
		int time; // 근무시간 정수 저장
		int tot; // 총 계산된 급액

		result = ""; // result 값 내용 비움(초기화)

		for (int i = 0; i < 3; i++) {
			name = JOptionPane.showInputDialog((i + 1) + "번 직원의 이름을 입력하세요.");
			timeV = JOptionPane.showInputDialog((i + 1) + "번 직원의 근무시간을 입력하세요.");
			time = Integer.parseInt(timeV);
			payV = JOptionPane.showInputDialog((i + 1) + "번 직원의 시급을 입력하세요.");
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

		JOptionPane.showMessageDialog(null, result, "결과",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
