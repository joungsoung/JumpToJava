package com.js.Exercise;

public class ExStringBuffer {
	public static void main(String[] args) {
		// StringBuffer  --> �������� ����. > �ӵ��� ������.
		// StringBuilder --> �������� ���ڴ�. > �ӵ��� ������.
		
		//���ڿ��� ������ �� �ִ� ����
		StringBuffer sb = new StringBuffer();
		sb.append("�ڹ�");
		sb.append("Android");
		sb.append(234);
		sb.append(true);
		
		// �߰� Ȯ��
		String str1 = sb.toString();
		System.out.println(str1);
		
		// �߰��� �ٸ� ���� �ֱ�
		sb.insert(2, "JSP");
		
		// �߰� Ȯ��
		String str2 = sb.toString();
		System.out.println(str2);
		
		// ���ڿ� �������� ó��
		sb.reverse();
		String str3 = sb.toString();
		System.out.println(str3);
		
		// ������� ����
		sb.reverse();
		
		// 2��° ��ġ���� 5��° ��ġ���� ""�� ����
		sb.replace(2, 5, "");
		System.out.println(sb.toString());
	}
}
