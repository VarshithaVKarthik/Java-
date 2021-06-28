package com.Exception.Demo;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Object> el=new ArrayList<Object>();
		el.add(20);
		el.add(30);
		el.add(10);
		el.add("John");
		el.add("Abraham");
		el.add(50.0);
		System.out.println(el);
		System.out.println(el.hashCode());
		el.add(50);
		System.out.println(el);
		el.add(0, 34);
		System.out.println(el);
		System.out.println(el.get(0));
		System.out.println(el.size());
		System.out.println(el.isEmpty());
		el.set(0, 10);
		System.out.println(el);
		el.remove(0);
		System.out.println(el);
		el.remove(0);
		System.out.println(el);

	}

}
