package com.virtual.oops;

public class Constructor_Ex {
	public Constructor_Ex() {
		System.out.println("default constructor");
	}

	public Constructor_Ex(String msg) {
		System.out.println("param constructor : " + msg);
	}

	public void displayMsg() {
		System.out.println("am from displayMsg method....");
	}

	public static void main(String[] args) {
		Constructor_Ex obj = new Constructor_Ex("narendra");// jvm will add default constructor

		obj.displayMsg();
	}

}
