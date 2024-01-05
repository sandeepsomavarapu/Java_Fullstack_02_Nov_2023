package com.ot9.stringclasses;

public class StringEx {

	public static void main(String[] args) {
		
		//heap-->SCP
		
		//2 ways
		
		String name="india";//literal-->Scp -->immutable
		String name1=new String("india");
		System.out.println(name.concat(" hyderabad"));
		System.out.println(name);
		
		StringBuilder name2=new StringBuilder("india");
				System.out.println(name2);
				name2.append(" hyderabad");
				System.out.println(name2);
		
	}

}
