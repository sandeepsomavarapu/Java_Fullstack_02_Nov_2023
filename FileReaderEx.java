package com.virtual.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("studentInfo.txt");
		int result = reader.read();
		while(result!=-1)
		{
			char data=(char) result;
			System.out.println(data);
			result=reader.read();
		}

	}

}
