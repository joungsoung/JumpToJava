package com.js.While;

public class TestWhile {
	public static void main(String[] args) {
		/*
		 * 돈(300원)을 받으면 커피를 줘라. 자판기에는 10잔 분량의 커피가 있다. 
		 * 커피가 떨어지면 판매중지 를 표시한다
		 */
		int coffee = 10;
		int money = 300;

		while (money == 300) {
			if (coffee == 0) {
				System.out.println("커피가 없습니다. \"판매중지\"");
				break;
			} else {
				System.out.println("돈을 받았으니 커피를 줍니다. 남은 커피의 양은 "+(coffee-1)+" 잔 입니다.");
			}
			coffee--;
		}
	}
}
