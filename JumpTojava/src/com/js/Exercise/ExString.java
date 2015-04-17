package com.js.Exercise;

public class ExString {
	public static void main(String[] args) {
		// Strimg 객체의 생성 방법
		String str1 = "자바 Programming";
		String str2 = new String("Java");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("--------------------------------------");
		
		/********** String 객체의 메서드 사용 ************/
		// 1) 문자열의 길이를 조회
		int str1_len = str1.length();
		int str2_len = str2.length();
		System.out.println("str1.length : " + str1_len);
		System.out.println("str2.length : " + str2_len);
		System.out.println("--------------------------------------");
		
		//2) 특정 문자열이 처음으로 나타나는 위치를 조회
		int str1_pos = str1.indexOf(" ");
		int str2_pos = str2.indexOf("a");
		System.out.println("str1.intexOF(\" \") : " + str1_pos);
		System.out.println("str2.intexOF(\"a\") : " + str2_pos);
		System.out.println("--------------------------------------");
		
		// 3) 특정 문자열이 나타나는 마지막 위치를 조회
		int str1_last_pos = str1.lastIndexOf(" ");
		int str2_last_pos = str2.lastIndexOf("a");
		System.out.println("str1.lastIndexOf(\" \") : " + str1_last_pos);
		System.out.println("str2.lastIndexOf(\"a\") : " + str2_last_pos);
		System.out.println("--------------------------------------");
		
		// 4) A를 B로 치환
		String new_str1 = str1.replace(" ", "-");
		String new_str2 = str2.replace("a", "A");
		System.out.println("str1.replace(\" \", \"-\") : " + new_str1);
		System.out.println("str2.replace(\"a\", \"A\") : " + new_str2);
		System.out.println("--------------------------------------");
		
		// 5) 문자열 자르기
		// - 첯 번째 파라미터 : 시작위치
		// - 두 번째 파라미터 : 끝 위치
		String sub_str1 = str1.substring(2, 3);
		String sub_str2 = str2.substring(2, 3);
		System.out.println("str1.substring(2, 3) : " + sub_str1);
		System.out.println("str2.substring(2, 3) : " + sub_str2);
		System.out.println("--------------------------------------");
		
		// 이메일 주소에서 아이디와 도메인을 구별하기
		String email = "joungsoung@gmail.com";
		int s = email.indexOf("@");
		String email_id = email.substring(0, s);
		String email_domain = email.substring(s+1, email.length());
		
		System.out.println("email : joungsoung@gmail.com");
		System.out.println("email_id : " + email_id);
		System.out.println("email_domain : " + email_domain);
		System.out.println("--------------------------------------");
		
		// 주민등록번호에서 생년월일 추출하기
		// ex) 8305211234567 --> 1983년 05월 21일 남자
		String jumin = "8305211234567";
		String yy = jumin.substring(0, 2);
		String mm = jumin.substring(2, 4);
		String dd = jumin.substring(4, 6);
		String gender_code = jumin.substring(6, 7);
		String gender = "남자";
		
		if (gender_code.equals("1") || gender_code.equals("2")) {
			yy = "19" + yy;
		} else {
			yy = "20" + yy;
		}
		
		if (gender_code.equals("2") || gender_code.equals("4")) {
			gender = "여자";
		}
		
		// 형식에 따른 문자열 출력을 위한 Static 메서드 사용
		String result = String.format("%s년 %s월 %s일 %s", yy, mm, dd, gender);
		System.out.println("주민번호 : " + jumin);
		System.out.println(result);
		System.out.println("--------------------------------------");
		
		// 문자열 앞뒤 공백 제거
		String input = "      itfreestyle       ";
		String output = input.trim();
		System.out.println("input = " + input);
		System.out.println("output = " + output);
		System.out.println("--------------------------------------");
		
		// 문자 사이의 공백 제거
		String k = "a a a a a a a";
		String k2 = k.replace(" ", "");
		System.out.println(k);
		System.out.println(k2);
	}
}
