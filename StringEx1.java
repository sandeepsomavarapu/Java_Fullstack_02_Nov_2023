package com.virtual.stringex;

public class StringEx1 {

	public static void main(String[] args) {

		String name = "welcome to India";
		String name1 = "welcome to india";

		System.out.println(name == name1);// true
		System.out.println(name.equalsIgnoreCase(name1));// true
		System.out.println(name.compareTo(name1));// 0

		System.out.println(name.charAt(2));// l
		System.out.println(name.codePointAt(2));//
		System.out.println(name.contains("india"));// true
		System.out.println(name.endsWith("india"));// true
		System.out.println(name.toUpperCase());

		String name2 = new String("welcome to india");//heap
		String name3 = new String("welcome to india");
		
		
		System.out.println(name2 == name3);// false
		System.out.println(name2.equals(name3));// true
		System.out.println(name2.compareTo(name3));// 0

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		String name = "narendra";// literal,immutable
//
//		name.concat(" Babu");// narendra Babu-->GC
//
//		System.out.println(name);// narendra Babu
//
//		String name1 = new String("narendra");// new	
//		StringBuilder name2 = new StringBuilder("narendra");// new ,muttable
//
//		name2.append(" kommanaboina");
//
//		System.out.println(name2);
//
//		StringBuffer name3 = new StringBuffer("narendra");// new ,muttable
//
//		name3.append(" kommanaboina");
//
//		System.out.println(name3);
	}

}
