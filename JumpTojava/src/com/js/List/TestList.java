package com.js.List;

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		System.out.println(pitches.get(1));				// 2��° �� ��������
		System.out.println(pitches.size());				// �� ����
		System.out.println(pitches.contains("142"));	// "142" ���翩�� boolean
		
		System.out.println(pitches.remove("129"));		// ��ü "129" �����ϰ� boolean�� ����
		System.out.println(pitches.size());
		System.out.println(pitches.remove(0));			// �ε��� �S��° �� �����ϰ� �����׸� ����
	}
}
