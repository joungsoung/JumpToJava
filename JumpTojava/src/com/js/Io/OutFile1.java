package com.js.Io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutFile1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("d:/Donot/workspace/out.txt");
		String data = "Hello World.";
		output.write(data.getBytes());
		output.close();
	}
}
