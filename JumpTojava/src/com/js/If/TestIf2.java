package com.js.If;

public class TestIf2 {
	public static void main(String[] args) {
		/* 돈이 3000원 이상 있거나 풀러줄 시계가 있다면 택시를 타고 그렇지 않으면 걸어가라 */
		int money = 2000;
		boolean watch = true;
		
		if (money >= 3000 || watch) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}
}
