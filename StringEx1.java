package com.virtual.stringex;

public class StringEx1 {

	public static void main(String[] args) {
		String name = "narendra";// literal,immutable

		name.concat(" Babu");// narendra Babu-->GC

		System.out.println(name);// narendra Babu

		String name1 = new String("narendra");// new

		StringBuilder name2 = new StringBuilder("narendra");// new ,muttable

		name2.append(" kommanaboina");

		System.out.println(name2);

		StringBuffer name3 = new StringBuffer("narendra");// new ,muttable

		name3.append(" kommanaboina");

		System.out.println(name3);
	}

}
