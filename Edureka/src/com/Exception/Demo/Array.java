package com.Exception.Demo;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<Object> e1=new ArrayList<Object>();
		e1.add(10);
		e1.add("Hello");
		e1.add('H');
		e1.add(30);
		e1.add(40);
		System.out.println(e1);
		System.out.println(e1.get(0));
		System.out.println(e1.contains("Hello"));
		e1.add(0, 20);
		System.out.println(e1);
		System.out.println(e1.isEmpty());
		System.out.println(e1.indexOf("Hello"));
		System.out.println(e1.size());
		
		
		

	}

}
