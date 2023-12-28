package com.virtual.io;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
			File file=new File("empinfo1");
			System.out.println(file.exists());//false
				//file.createNewFile();
			file.mkdir();
			System.out.println(file.exists());
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			System.out.println("folder created....");
			
	}

}
