package com.js.Exercise;

public class ExStringBuffer {
	public static void main(String[] args) {
		// StringBuffer  --> 안전성이 좋다. > 속도가 느리다.
		// StringBuilder --> 안전상이 나쁘다. > 속도가 빠르다.
		
		//문자열을 조합할 수 있는 공간
		StringBuffer sb = new StringBuffer();
		sb.append("자바");
		sb.append("Android");
		sb.append(234);
		sb.append(true);
		
		// 중간 확인
		String str1 = sb.toString();
		System.out.println(str1);
		
		// 중간에 다른 내용 넣기
		sb.insert(2, "JSP");
		
		// 중간 확인
		String str2 = sb.toString();
		System.out.println(str2);
		
		// 문자열 역순으로 처리
		sb.reverse();
		String str3 = sb.toString();
		System.out.println(str3);
		
		// 원래대로 복귀
		sb.reverse();
		
		// 2번째 위치부터 5번째 위치까지 ""로 변경
		sb.replace(2, 5, "");
		System.out.println(sb.toString());
	}
}
