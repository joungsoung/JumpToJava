package com.js.Io;

import java.util.Scanner;

public class Calculator {
	int x, y, rightAnswer;

	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void sum() {
		rightAnswer = this.x + this.y;
		System.out.print(x + "+" + y + "=");
		scanner();
	}
	public void sub() {
		rightAnswer = this.x - this.y;
		System.out.print(x + "-" + y + "=");
		scanner();
	}
	@SuppressWarnings("resource")
	public void scanner() {
		Scanner sc = new Scanner(System.in);
		if (rightAnswer == sc.nextInt()) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�. ������ " + rightAnswer + " �Դϴ�.");
		}
	}
}
