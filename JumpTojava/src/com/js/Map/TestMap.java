package com.js.Map;
import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		System.out.println(map.get("people"));			// key값 "people" 가져오기 (사람)
		System.out.println(map.containsKey("people"));	// key값 "people" 존재여부 (boolean값 리턴)
		System.out.println(map.remove("people"));		// key값 "people" 의 value 삭제 (사람)
		System.out.println(map.size());					// 총 갯수 리턴
	}
}
