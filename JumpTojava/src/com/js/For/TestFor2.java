package com.js.For;

public class TestFor2 {
	public static void main(String[] args) {
		/* �� 5���� �л��� ������ ���Ҵµ� ���������� 60���� ���� �л����Դ� �հ����ϸ� ���ְ�
		 * �׷��� ���� �л����Դ� �������� �ʴ´� */
		int[] marks = {90, 25,67, 45, 80};
		
		for (int i=0; i<marks.length; i++) {
			if (marks[i] < 60) {
				continue;
			}
			System.out.println((i+1)+"�� �л� �����մϴ�. �հ��Դϴ�.");
		}
	}
}
