package com.virtual.oops;

class Parent {
	int a = 222;

	public Parent() {
		this("india");
		System.out.println("default constructor of parent class");
	}
	public Parent(String name) {
		System.out.println("param constructor of parent class");
	}
	public void m1() {
		System.out.println("am from m1 method of parent");
	}
}

public class ThisSuperEx extends Parent {

	int a = 333;

	public ThisSuperEx() {
		super();
		System.out.println("default constructor of child");// 3
	}

	public ThisSuperEx(int a) {
		this();// 2
		System.out.println(a + " " + this.a + " " + super.a);// 4
		this.m1();
		super.m1();
	}

	@Override
	public void m1() {
		System.out.println("am from m1 method of child");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx(444);// 1
	}

}
