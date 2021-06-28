package com.Exception.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> v=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}System.out.println(v);
		Iterator<Integer> i=v.iterator();
		while(i.hasNext())
		{
			Integer val = i.next();
			if(val%2==0)
				System.out.println(val);
			else
			i.remove();
		}System.out.println(v);
	}

}
