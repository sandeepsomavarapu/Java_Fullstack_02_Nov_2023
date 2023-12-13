package com.virtual.oops;

interface SuperParent {
	public abstract void mod(int a, int b);

	void message();// public abstract void message()
}

abstract class Parent_Calci implements SuperParent {
	public void mul(int a, int b) {
		System.out.println("mul of two numbers : " + (a * b));
	}

	public abstract void div(int a, int b);

}

public class Calci extends Parent_Calci {

	public void add(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));

	}

	public static void main(String[] args) {
		Calci cal = new Calci();
		cal.add(12, 13);
		cal.sub(23, 12);
		cal.mul(22, 2);
	}

	@Override
	public void div(int a, int b) {

	}

	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

}
