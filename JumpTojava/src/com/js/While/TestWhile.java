package com.js.While;

public class TestWhile {
	public static void main(String[] args) {
		/*
		 * ��(300��)�� ������ Ŀ�Ǹ� ���. ���Ǳ⿡�� 10�� �з��� Ŀ�ǰ� �ִ�. 
		 * Ŀ�ǰ� �������� �Ǹ����� �� ǥ���Ѵ�
		 */
		int coffee = 10;
		int money = 300;

		while (money == 300) {
			if (coffee == 0) {
				System.out.println("Ŀ�ǰ� �����ϴ�. \"�Ǹ�����\"");
				break;
			} else {
				System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�. ���� Ŀ���� ���� "+(coffee-1)+" �� �Դϴ�.");
			}
			coffee--;
		}
	}
}
