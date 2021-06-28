package com.Exception.Demo;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList<Object> e1=new ArrayList<Object>();
		e1.add("i am");
		e1.add(2);
		e1.add("good");
		System.out.println(e1);
		ArrayList<Object> copy=(ArrayList<Object>) e1.clone();
		System.out.println(copy);
		
				

	}

}
