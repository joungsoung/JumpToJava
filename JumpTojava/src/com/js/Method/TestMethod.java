package com.js.Method;

/* 메소드의 종류는 총 4가지 가 있다
 * 1. 매개변수와 리턴값이 있는 메소드 (평범한 메소드)
 * 2. 매개변수는 없고 리턴값만 있는 메소드
 * 3. 매개변수는 있지만 리턴값이 없는 메소드
 * 4. 매개변수와 리턴값 모두 없는 메소드 */

public class TestMethod {
	// 매개변수와, 리턴값 이 있는 메소드 (평범한 메소드)
	public int sum(int a, int b) {
		return a + b;
	}
	// 매개변수는 없고 리턴값만 있는 메소드
	public String say() {
		return "Hi";
	}
	// 매개변수는 있지만 리턴값이 없는 메소드
	public void sum2(int a, int b) {
		System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
	}
	// 매개변수와 리턴값 모두 없는 메소드
	public void say2() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		TestMethod test = new TestMethod();
		// 매개변수와 리턴값이 있는 메소드 호출
		int _sum = test.sum(3, 4);
		System.out.println(_sum);
		// 매개변수는 없고 리턴값만 있는 메소드 호출
		String _say = test.say();
		System.out.println(_say);
		// 매개변수는 있지만 리턴값이 없는 메소드 호출
		test.sum2(3, 4);
		// 매개변수와 리턴값 모두 없는 메소드 호출
		test.say2();
	}
}
