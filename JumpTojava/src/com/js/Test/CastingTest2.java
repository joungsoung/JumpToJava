package com.js.Test;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine)car;	/* ����� ������ �߻��Ѵ�.(����Ÿ���� �ν��Ͻ� ��
		�ڼ�Ÿ���� ���������� �����ϴ� ���� ������� �ʴ´�. --> Child c = new Person(); */
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
