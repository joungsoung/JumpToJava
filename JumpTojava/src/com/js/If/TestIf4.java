package com.js.If;

import java.util.ArrayList;

public class TestIf4 {
	public static void main(String[] args) {
		/* ������ ���� ������ �ýø� Ÿ��, ������ ���̾����� �ð谡 ������ �ýø� Ÿ��
		 * �������� �ð赵 ������ �ɾ�� */
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		//pocket.add("money");
		pocket.add("handphone");
		boolean watch = true;
		
		if (pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else if (watch) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
	}
}

		/*
		 * if (pocket.contains("money") || watch) {
		 * 		System.out.println("�ýø� Ÿ�� ����");
		 * } else {
		 * 		System.out.println("�ɾ��");
		 * }
		 */