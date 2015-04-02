package com.js.While;

public class TestWhile2 {
	public static void main(String[] args) {
		/* 1부터 10까지 중 홀수만 출력하기 */
		int number = 0;

		while (number < 10) {
			number++;
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}
}
