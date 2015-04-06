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
			System.out.println("정답입니다.");
		} else {
			System.out.println("정답이 아닙니다. 정답은 " + rightAnswer + " 입니다.");
		}
	}
}
