package com.js.Map;
import java.util.HashMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "���");
		map.put("baseball", "�߱�");
		
		System.out.println(map.get("people"));			// key�� "people" �������� (���)
		System.out.println(map.containsKey("people"));	// key�� "people" ���翩�� (boolean�� ����)
		System.out.println(map.remove("people"));		// key�� "people" �� value ���� (���)
		System.out.println(map.size());					// �� ���� ����
	}
}
