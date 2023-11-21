package com.virtual.basics;

public class ContinueExample {

	public static void main(String[] args) {
//		int i=12;
//		System.out.println(++i +" "+(i++));
//		System.out.println(i);
//		
		
		for (int i = 1; i <= 10; ++i) {
			// if value of i is between 4 and 9 continue is executed
			if (i > 4 && i < 9) {
				continue;
			}
			System.out.println(i);
		}
	}
}
