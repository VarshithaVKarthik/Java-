package com.Exception.Demo;

import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> hm=new TreeMap<String, Integer>();
		hm.put("Hi", 1);
		hm.put("Hello", 5);
		hm.put("Hi", 1);
		hm.put("dance", 5);
		hm.put("fool", 4);
		hm.put("Hello", 3);
		System.out.println(hm);
		TreeMap<String, Integer> hm1=new TreeMap<String, Integer>();
		hm1.put("Good", 7);
		hm1.put("Happy", 8);
		hm.putAll(hm1);
		System.out.println(hm1);
		System.out.println(hm);
		System.out.println(hm.containsKey("Hi"));
		System.out.println(hm.containsValue(9));
		  System.out.println(hm.get("dance")); System.out.println(hm.isEmpty());
		  System.out.println(hm.size()); System.out.println(hm.remove("fool", 4));
		  System.out.println(hm); System.out.println(hm.hashCode()); hm.clear();
		  System.out.println(hm); System.out.println(hm.hashCode());
		 
	}

}
