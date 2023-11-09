package com.virtual.basics;

//what is the default package in java -->java.lang 
public class Methods_Reference {

	public int addOfThree(int a, int b, int c) {// camelcase
		return a + b + c;
	}

	public void subOfTwo(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}

	public void mulOfTwo() {
		int a = 12;
		int b = 12;
		System.out.println("mul of two numbers : " + (a * b));
	}

	public static String displayMessage() {

		return "hello!! good evening";
	}

	public static void main(String[] args) {
		System.out.println("welcome to eclipse");

		System.out.println(Methods_Reference.displayMessage());// static method calling by using class name
		Methods_Reference obj = new Methods_Reference();// object creation
		obj.mulOfTwo(); // instance method calling by using obj reference
		obj.subOfTwo(12, 13);
		int result = obj.addOfThree(100, 2, 12);
		System.out.println(result);

	}

}
