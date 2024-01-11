package com.virtual.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1.collections are not fixed in size /growable in nature   -->AL-->10-->16 -->(cc*3/2)+1
//2.collections will allow both homogeneous and heterogeneous data.  TREESET,TREEMAP
//3.lots of predefined methods
//Set:
//=====
//1.duplicates are not allowed 
//2.insertion order is not preserved 
public class SetEx {

	public static void main(String[] args) {//for CSO we need to pass our comparator class 
		TreeSet<String> set = new TreeSet<String>(new Reverse());// 10-->Comparable->compareTo-->NSO 
		set.add("narendra");						//		Comparator-->compare--->CSO
		set.add("mahesh");
		set.add("naresh");							//
		set.add("ramesh");
		set.add("sandeep");
		set.add("sukesh");
		set.add("rajesh");
		set.add("narendra");
		set.add("akash");

		System.out.println(set);//mahesh,narendra
		//System.out.println("narendra".compareTo("naresh"));//0
		
		
		//return -ve if obj1 has to come before obj2
		//return +ve if obj1 has to come after obj2
		//return 0 if both objects are same 
		
		

//		TreeSet set1 = new TreeSet();// 10
//		set1.add("narendra");
//		set1.add(123);
//		System.out.println(set1);
	}

}

class Reverse implements Comparator<String>
{

	@Override
	public int compare(String obj1, String obj2) {
		
		//return -obj1.compareTo(obj2);
		return obj2.compareTo(obj1);
	}
	
}
