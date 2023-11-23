package com.virtual.basics;

import java.util.Scanner;//ctrl+shift+O

//by default package for every java file is java.lang 
public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Student id:");
		int sid = scan.nextInt();
		System.out.println("Enter Student Name:");
		String sname = scan.next();
		System.out.println("Enter Student marks:");
		float smarks = scan.nextFloat();
		System.out.println("Enter Student value:");
		boolean result = scan.nextBoolean();
		System.out.println("student info :"+sid+" \n "+sname+"\n "+smarks+" \n"+result);
		scan.close();
	}

}
