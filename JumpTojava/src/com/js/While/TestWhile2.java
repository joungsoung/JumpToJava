package com.js.While;

public class TestWhile2 {
	public static void main(String[] args) {
		/* 1���� 10���� �� Ȧ���� ����ϱ� */
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
