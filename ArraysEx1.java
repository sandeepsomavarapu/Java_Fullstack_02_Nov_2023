package com.virtual.basics;

public class ArraysEx1 {
	public static void main(String[] args) {

//		int marks[] = { 12, 32, 43, 22, 46, 8, 64, 121, 545 };//array literal creation
//
//		for (int i = 0; i < marks.length; i++) {//iterating the array getting values
//			if (marks[i] % 2 == 0)
//				System.out.println(marks[i]);
//		}
//		System.out.println("****************");

		// we can give size of an array dynamically also by using scanner ...

//		int marks1[] = new int[7]; // creating an array using new keyword with size 15
//		System.out.println("Storing the values");
//		for (int i = 0, j = 1; j < 15; j++) { // storing 1-15 values only even numbers in array using for loop
//			if (j % 2 == 0) {
//				marks1[i] = j;
//				i++;
//			}
//		}
//		System.out.println(marks1.length);// the way get length of an array
//
//		System.out.println("printing the values");// iterating the array getting values
//		for (int i = 0; i < marks1.length; i++) {
//			System.out.println(marks1[i]);
//		}
		//two dimentional array

		int ids[][] = { { 12, 32, 43, 22 }, { 46, 83, 64, 12 } };

		for (int i = 0; i < ids.length; i++) {
			for (int j = 0; j <4; j++) {
			//	System.out.println(i+" "+j);
				System.out.print(ids[i][j]+" ");
			}
			System.out.println();
		}

	}
}
