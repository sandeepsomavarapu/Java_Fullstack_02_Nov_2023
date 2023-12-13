package com.virtual.oops;

class ParentEx {
	public void m2() {
		System.out.println("welcome to hyderabad");
	}
	public void m3() {
		System.out.println("welcome to telangana");
	}
	
}

public class MethodOverridingEx extends ParentEx{
	
	public void m1() {
		System.out.println("welcome to india");
	}
	@Override
	public void m3() {
		System.out.println("welcome to AP");
	}
	public static void main(String[] args) {
		MethodOverridingEx obj=new MethodOverridingEx();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}
