package com.js.If;

import java.util.ArrayList;

public class TestIf3 {
	public static void main(String[] args) {
		/* ���� �ָӴϿ� ���� ������ �ýø� Ÿ��, ������ �ɾ�� */
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("handphone");
		pocket.add("paper");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("�ýø� Ÿ�� ����");
		} else {
			System.out.println("�ɾ��");
		}
	}
}
