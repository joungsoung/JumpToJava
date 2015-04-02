package com.js.For;

public class TestFor2 {
	public static void main(String[] args) {
		/* 총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘은 학생에게는 합격축하를 해주고
		 * 그렇지 않은 학생에게는 반응하지 않는다 */
		int[] marks = {90, 25,67, 45, 80};
		
		for (int i=0; i<marks.length; i++) {
			if (marks[i] < 60) {
				continue;
			}
			System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}
	}
}
