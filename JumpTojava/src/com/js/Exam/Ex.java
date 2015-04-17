package com.js.Exam;

public class Ex {
	public static void main(String[] args) {
		
		int i = 10;
		
		String str = Integer.toString(i);
		System.out.println("str + 1 : " + str + 1);
		
		
		String a = "10";
		//int b = Integer.valueOf(a).intValue();
		int b = Integer.parseInt(a);
		System.out.println("b + 1 : " + b + 1);
		
		
	}
}
