package com.hdfc.loans.personolloans;

public class MethodOverloading {
	
	  public int m1(int i) { System.out.println(i); return i;
	  
	  }
	 
	public float m1(float i)
	{
		System.out.println(i);
		return i;
		
	}public String m1(String str)
	{
		System.out.println(str);
		return str;
		
	}

	public static void main(String[] args) 
	{
		MethodOverloading qw=new MethodOverloading();
		qw.m1(100);
		qw.m1(1000.32F);
		qw.m1("Good");
		
		

	}

}
