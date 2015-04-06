package com.js.Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class AddFile {
	public static void main(String[] args) throws IOException {
		String txt = "Hello Joungsoung.";
		String fileName = "d:/Test/HelloJoungsoung.txt";
		String cpfileName = "d:/Test/cp_HelloJoungsoung.txt";
		String addtxt = "\r\nWat's up!";
		String targetDir = "d:/Test";
		
		/* d:/Test ���丮 ���� */
		File mkd = new File(targetDir);
		if (!mkd.exists()) {
			mkd.mkdirs();
		}
		
		/* ���ϻ����ϰ� �����Է� */
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(txt);
		fw.close();
		System.out.println(fileName+" ������ �����߽��ϴ�.");
		
		/* �����Ǿ��ִ� ���Ͽ� �����߰� */
		FileWriter fw2 = new FileWriter(file, true);
		fw2.write(addtxt);
		fw2.close();
		System.out.println(fileName+" �� ������ �߰��߽��ϴ�.");
		
		/* ���� ���� */
		File file2 = new File(cpfileName);
		FileInputStream fi = new FileInputStream(fileName);
		FileOutputStream fo = new FileOutputStream(file2);
		int a;
		while ((a=fi.read()) != -1) {
			fo.write(a);
		}
		System.out.println(fileName+" ������ "+cpfileName+" �� �����߽��ϴ�.");
		fi.close();
		fo.close();
	}
}
