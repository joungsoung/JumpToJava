package com.js.For;

public class TestFor {
	public static void main(String[] args) {
		/* �� 5���� �л��� ������ ���Ҵµ� ���������� 60���� ������ �հݱ�� �׷��� ������
		 * ���հ��̴�. �հ����� ���հ������� ���� ����� �����ش�. */
		int[] marks = {90, 25, 67, 45, 80};
		
		for (int i=0; i<marks.length; i++) {
			if (marks[i] > 60) {
				System.out.println((i+1)+"�� �л��� �հ� �Դϴ�.");
			} else {
				System.out.println((i+1)+"�� �л��� ���հ� �Դϴ�.");
			}
		}
	}
}
