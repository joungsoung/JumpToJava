package com.js.Io;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class OutFile3 {
	public static void main(String[] args) throws IOException {
		String data;
		PrintWriter pw = new PrintWriter("d:/Donot/workspace/PrintWriter.txt");
		data = "Hello world";
		pw.println(data);
		pw.close();

		PrintWriter pw2 = new PrintWriter(new FileWriter(
				"d:/Donot/workspace/PrintWriter.txt", true));
		data = "Hi";
		pw2.println(data);
		pw2.close();
	}
}
