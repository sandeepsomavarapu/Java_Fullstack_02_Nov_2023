package com.virtual.oops;

 class Parent_Ex {// before the class

	 int age = 31; // before the variable

	public  void printAge() {// before the method
		++age;
		System.out.println("Your age: " + age);
	}

	public void printMsg() {
		System.out.println("Hello! Good Evening");
	}
}

public class Final_Ex extends Parent_Ex {
	@Override
	public void printAge() {
		--age;
		System.out.println("Your age: " + age);
	}

	public static void main(String[] args) {
		Final_Ex obj = new Final_Ex();
		obj.printAge();
		obj.printMsg();
	}

}
