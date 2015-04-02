package com.js.If;

import java.util.ArrayList;

public class TestIf4 {
	public static void main(String[] args) {
		/* 지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이없지만 시계가 있으면 택시를 타고
		 * 돈도없고 시계도 없으면 걸어가라 */
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		//pocket.add("money");
		pocket.add("handphone");
		boolean watch = true;
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else if (watch) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}
}

		/*
		 * if (pocket.contains("money") || watch) {
		 * 		System.out.println("택시를 타고 가라");
		 * } else {
		 * 		System.out.println("걸어가라");
		 * }
		 */