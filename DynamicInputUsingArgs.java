package com.virtual.basics;

public class DynamicInputUsingArgs {
	public static void main(String args[])// java Welcome narendra "23" 24
	{
		System.out.println(args[0]);

		int fnum = Integer.parseInt(args[1]);
		int snum = Integer.parseInt(args[2]);

		System.out.println(fnum + snum);

	}

}
