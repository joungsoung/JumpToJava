package com.js.Io;

import java.io.File;

public class Mkdir {
	public static void main(String[] args) {
		File mkd = new File("d:/Test");
		
		if (!mkd.exists()) {
			mkd.mkdirs();
			System.out.println(mkd+" 폴더를 생성했습니다.");
		} else {
			System.out.println(mkd+" 폴더가 이미 존재합니다.");
		}
	}
}
