package com.js.Exercise;

public class ExString {
	public static void main(String[] args) {
		// Strimg ��ü�� ���� ���
		String str1 = "�ڹ� Programming";
		String str2 = new String("Java");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("--------------------------------------");
		
		/********** String ��ü�� �޼��� ��� ************/
		// 1) ���ڿ��� ���̸� ��ȸ
		int str1_len = str1.length();
		int str2_len = str2.length();
		System.out.println("str1.length : " + str1_len);
		System.out.println("str2.length : " + str2_len);
		System.out.println("--------------------------------------");
		
		//2) Ư�� ���ڿ��� ó������ ��Ÿ���� ��ġ�� ��ȸ
		int str1_pos = str1.indexOf(" ");
		int str2_pos = str2.indexOf("a");
		System.out.println("str1.intexOF(\" \") : " + str1_pos);
		System.out.println("str2.intexOF(\"a\") : " + str2_pos);
		System.out.println("--------------------------------------");
		
		// 3) Ư�� ���ڿ��� ��Ÿ���� ������ ��ġ�� ��ȸ
		int str1_last_pos = str1.lastIndexOf(" ");
		int str2_last_pos = str2.lastIndexOf("a");
		System.out.println("str1.lastIndexOf(\" \") : " + str1_last_pos);
		System.out.println("str2.lastIndexOf(\"a\") : " + str2_last_pos);
		System.out.println("--------------------------------------");
		
		// 4) A�� B�� ġȯ
		String new_str1 = str1.replace(" ", "-");
		String new_str2 = str2.replace("a", "A");
		System.out.println("str1.replace(\" \", \"-\") : " + new_str1);
		System.out.println("str2.replace(\"a\", \"A\") : " + new_str2);
		System.out.println("--------------------------------------");
		
		// 5) ���ڿ� �ڸ���
		// - �S ��° �Ķ���� : ������ġ
		// - �� ��° �Ķ���� : �� ��ġ
		String sub_str1 = str1.substring(2, 3);
		String sub_str2 = str2.substring(2, 3);
		System.out.println("str1.substring(2, 3) : " + sub_str1);
		System.out.println("str2.substring(2, 3) : " + sub_str2);
		System.out.println("--------------------------------------");
		
		// �̸��� �ּҿ��� ���̵�� �������� �����ϱ�
		String email = "joungsoung@gmail.com";
		int s = email.indexOf("@");
		String email_id = email.substring(0, s);
		String email_domain = email.substring(s+1, email.length());
		
		System.out.println("email : joungsoung@gmail.com");
		System.out.println("email_id : " + email_id);
		System.out.println("email_domain : " + email_domain);
		System.out.println("--------------------------------------");
		
		// �ֹε�Ϲ�ȣ���� ������� �����ϱ�
		// ex) 8305211234567 --> 1983�� 05�� 21�� ����
		String jumin = "8305211234567";
		String yy = jumin.substring(0, 2);
		String mm = jumin.substring(2, 4);
		String dd = jumin.substring(4, 6);
		String gender_code = jumin.substring(6, 7);
		String gender = "����";
		
		if (gender_code.equals("1") || gender_code.equals("2")) {
			yy = "19" + yy;
		} else {
			yy = "20" + yy;
		}
		
		if (gender_code.equals("2") || gender_code.equals("4")) {
			gender = "����";
		}
		
		// ���Ŀ� ���� ���ڿ� ����� ���� Static �޼��� ���
		String result = String.format("%s�� %s�� %s�� %s", yy, mm, dd, gender);
		System.out.println("�ֹι�ȣ : " + jumin);
		System.out.println(result);
		System.out.println("--------------------------------------");
		
		// ���ڿ� �յ� ���� ����
		String input = "      itfreestyle       ";
		String output = input.trim();
		System.out.println("input = " + input);
		System.out.println("output = " + output);
		System.out.println("--------------------------------------");
		
		// ���� ������ ���� ����
		String k = "a a a a a a a";
		String k2 = k.replace(" ", "");
		System.out.println(k);
		System.out.println(k2);
	}
}
