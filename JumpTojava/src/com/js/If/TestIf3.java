package com.js.If;

import java.util.ArrayList;

public class TestIf3 {
	public static void main(String[] args) {
		/* 만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라 */
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("handphone");
		pocket.add("paper");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}
}
