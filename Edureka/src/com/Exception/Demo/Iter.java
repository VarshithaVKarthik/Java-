package com.Exception.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {

	public static void main(String[] args) {
		ArrayList<String> e1=new ArrayList<String>();
		e1.add("hello");
		e1.add("Good");
		e1.add("Morning");
		Iterator<String> e2=e1.iterator();
		while(e2.hasNext())
		{
			System.out.println(e2.next());
		}
	}

}
