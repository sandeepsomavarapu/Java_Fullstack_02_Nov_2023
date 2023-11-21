package com.virtual.basics;

public class IfExample {
	public static void main(String[] args) {
		int marks = 56;
		if (marks > 65) {
			System.out.println("First Class");
		}
		else if ( marks > 40) {
			System.out.println("Second Class");
		}
		System.out.println("After If Block The remaining statements...");
	}
}
