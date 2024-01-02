package com.virtual.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployee {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos = new FileOutputStream("emps.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		Employee emp = new Employee(123, "suresh", 2000, "hyderabad");
//		oos.writeObject(emp);//serialization
		
		FileInputStream fos = new FileInputStream("emps.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
		Employee emp=(Employee) oos.readObject();
		System.out.println(emp);//de-serialization
		

	}
}
