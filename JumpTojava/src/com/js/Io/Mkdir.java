package com.js.Io;

import java.io.File;

public class Mkdir {
	public static void main(String[] args) {
		File mkd = new File("d:/Test");
		
		if (!mkd.exists()) {
			mkd.mkdirs();
			System.out.println(mkd+" ������ �����߽��ϴ�.");
		} else {
			System.out.println(mkd+" ������ �̹� �����մϴ�.");
		}
	}
}
