package com.js.Io;

import java.io.FileWriter;
import java.io.IOException;

public class OutFile2 {
	public static void main(String[] args) throws IOException {
		String data;
		FileWriter fw = new FileWriter("d:/Donot/workspace/FileWriter.txt");
		data = "Hello world";
		fw.write(data);
		fw.close();
		
		FileWriter fw2 = new FileWriter("d:/Donot/workspace/FileWriter.txt", true);
		data = "\r\nHi";
		fw2.write(data);
		fw2.close();
	}
}
