package com.virtual.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("studentInfo.txt");
		fw.write("welcome to india");
		System.out.println("data written");
		fw.flush();
	}

}
