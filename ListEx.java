package com.virtual.collections;

import java.util.ArrayList;
import java.util.Iterator;

//1.collections are not fixed in size /growable in nature   -->AL-->10-->16 -->(cc*3/2)+1
//2.collections will allow both homogeneous and heterogeneous data. 
//3.lots of predefined methods
//List:
//=====
//1.duplicates are allowed 
//2.insertion order is preserved 
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//10
		list.add("narendra");
		list.add("mahesh");
		list.add("naresh");
		list.add("ramesh");
		list.add("rajesh");
		list.add("narendra");
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
		String name=itr.next();
			if(name.length()>6)
				System.out.println(name);
		}
		
//		System.out.println(list.contains("sandeep"));
//		System.out.println(list.size());
//		//list.add(123);
//		System.out.println(list);
//		list.remove("ramesh");
//		System.out.println(list);
//		ArrayList list1=new ArrayList();//10
//		list1.add("narendra1");
//		list1.add(1233);
//		list1.add(false);
//		list1.add(234.12);
//		list1.add(234.54f);
//		list1.add(1233);
//		list1.add("shanmukashiva");
//		System.out.println(list1);
//	
//		list1.addAll(list);
//		
//		System.out.println(list1);
//		//list1.removeAll(list);
//		list1.retainAll(list);
//		System.out.println("after retaining ..."+list1);
//		list1.clear();
//		System.out.println(list1);
//		System.out.println(list1.isEmpty());
//		//System.out.println(list1.get(6));
//		//System.out.println(list1.indexOf("shanmukashiva"));
	}

}
