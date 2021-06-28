package com.Exception.Demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratotDemo {

	public static void main(String[] args) {
		ArrayList<String> e=new ArrayList<String>();
		e.add("ibm");
		e.add("ibm");
		e.add("IBM");
		System.out.println(e);
		ListIterator<String> v=e.listIterator();
		while(v.hasNext())
		{
			String val = v.next();
			if(val.equalsIgnoreCase("ibm"))
				v.set("TECH");
			else
				v.remove();
		}System.out.println(e);
	}

}
