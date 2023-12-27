package com.virtual.exceptions;

import java.util.Scanner;

class AgeNotValid extends Exception {
	public AgeNotValid(String message) {
		super(message);
	}
}

public class ValidationTest {

	public static void validateAge(int age) throws AgeNotValid {

		if (age < 18) {
			throw new AgeNotValid("Invalid Age To Vote");
		} else {
			System.out.println("you are allowed to vote...");
		}

	}

	public static void main(String[] args) throws AgeNotValid {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int age = scan.nextInt();
		ValidationTest.validateAge(age);
	}

}
