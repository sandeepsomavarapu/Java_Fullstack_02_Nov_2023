package com.virtual.oops;

class Caluculator {
	int result = 123;

	public void add(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));

	}

	public void mul(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));

	}
}

class PC_Calci extends Caluculator {
	public void mod(int a, int b) {
		System.out.println("mod of two numbers : " + (a % b));

	}

}

public class Mobile_Calculator extends Caluculator {

	public void div(int a, int b) {
		System.out.println("div of two numbers : " + (a / b));

	}

	public static void main(String[] args) {
		Mobile_Calculator obj = new Mobile_Calculator();
		obj.div(12, 3);
		obj.mul(12, 3);
		obj.add(12, 12);
		obj.sub(32, 33);
		//obj.mod(12,3);

	}

}
