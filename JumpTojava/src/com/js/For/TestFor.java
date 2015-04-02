package com.js.For;

public class TestFor {
	public static void main(String[] args) {
		/* 총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격기고 그렇지 않으면
		 * 불합격이다. 합격인지 불합격인지에 대한 결과를 보여준다. */
		int[] marks = {90, 25, 67, 45, 80};
		
		for (int i=0; i<marks.length; i++) {
			if (marks[i] > 60) {
				System.out.println((i+1)+"번 학생은 합격 입니다.");
			} else {
				System.out.println((i+1)+"번 학생은 불합격 입니다.");
			}
		}
	}
}
