package com.js.List;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		System.out.println(pitches.get(1));				// 2번째 값 가져오기
		System.out.println(pitches.size());				// 총 갯수
		System.out.println(pitches.contains("142"));	// "142" 존재여부 boolean
		
		System.out.println(pitches.remove("129"));		// 객체 "129" 삭제하고 boolean값 리턴
		System.out.println(pitches.size());
		System.out.println(pitches.remove(0));			// 인덱스 첯번째 값 삭제하고 삭제항목 리턴
	}
}
