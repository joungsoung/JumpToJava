package com.js.Method;

/* �޼ҵ��� ������ �� 4���� �� �ִ�
 * 1. �Ű������� ���ϰ��� �ִ� �޼ҵ� (����� �޼ҵ�)
 * 2. �Ű������� ���� ���ϰ��� �ִ� �޼ҵ�
 * 3. �Ű������� ������ ���ϰ��� ���� �޼ҵ�
 * 4. �Ű������� ���ϰ� ��� ���� �޼ҵ� */

public class TestMethod {
	// �Ű�������, ���ϰ� �� �ִ� �޼ҵ� (����� �޼ҵ�)
	public int sum(int a, int b) {
		return a + b;
	}
	// �Ű������� ���� ���ϰ��� �ִ� �޼ҵ�
	public String say() {
		return "Hi";
	}
	// �Ű������� ������ ���ϰ��� ���� �޼ҵ�
	public void sum2(int a, int b) {
		System.out.println(a+"�� "+b+"�� ���� "+(a+b)+"�Դϴ�.");
	}
	// �Ű������� ���ϰ� ��� ���� �޼ҵ�
	public void say2() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		TestMethod test = new TestMethod();
		// �Ű������� ���ϰ��� �ִ� �޼ҵ� ȣ��
		int _sum = test.sum(3, 4);
		System.out.println(_sum);
		// �Ű������� ���� ���ϰ��� �ִ� �޼ҵ� ȣ��
		String _say = test.say();
		System.out.println(_say);
		// �Ű������� ������ ���ϰ��� ���� �޼ҵ� ȣ��
		test.sum2(3, 4);
		// �Ű������� ���ϰ� ��� ���� �޼ҵ� ȣ��
		test.say2();
	}
}
