package com.virtual.oops;

public class MethodOverloading_Ex {
	public void add(float a, float b) {
		System.out.println("add of two float's :" + (a + b));
	}

	public void add(int a, int b) {
		System.out.println("add of two int's :" + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("add of three int's :" + (a + b + c));
	}

	public void add(int a, float b) {
		System.out.println("add of int , float :" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of float , int  :" + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloading_Ex obj = new MethodOverloading_Ex();

		obj.add(12, 13);
		obj.add(12.5f, 13.34f);
		obj.add(12, 13,14);
		obj.add(12, 13.45f);
		obj.add(12.12f, 13);//
		obj.add('a','b');//type promotion  
		
	}
}
