package com.virtual.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "suresh");
		map.put(123, "rajesh");
		map.put(21, "naresh");
		map.put(32, "ghani");
		map.put(76, "phani");
		map.put(34, "mahesh");
		map.put(111, "sheshu");
		System.out.println(map);

		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> entries1 = entries.iterator();

		while (entries1.hasNext()) {
			Entry<Integer, String> entry = entries1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

//		Set<Integer> keys = map.keySet();
//
//		Iterator<Integer> keys1 = keys.iterator();
//
//		while (keys1.hasNext()) {
//			int key=keys1.next();
//			System.out.println(key+" "+map.get(key));
//
//		}

//		System.out.println(map.size());
//		System.out.println(map.get(111));
//		map.remove(111);
//		System.out.println(map);
//		System.out.println(map.containsKey(32));
//		System.out.println(map.containsValue("sandeep"));
//		
//		HashMap<Integer,String> map1=new HashMap<Integer,String>();
//		map1.put(555, "kumar");
//		map1.put(666, "sai");
//		System.out.println(map1);
//		map1.putAll(map);
//		System.out.println(map1);
//		System.out.println(map1.isEmpty());
//		map1.clear();
//		System.out.println(map1.isEmpty());

	}

}
