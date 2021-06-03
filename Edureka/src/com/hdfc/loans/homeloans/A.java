package com.hdfc.loans.homeloans;

import java.util.Date;

public    class A 
{
	  public int x=100;
	  int x1=100;
	  String vname="Baby";
	 
	  public  void m1() {
	  }
	  
	   public static void m5()
	  {
		  System.out.println("Iam m5 static method");
	  }
	
	 static
	 {
		 Date dt=new Date();
		 System.out.println(dt);
		
	 }
	 
	 

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		A.m5();
		a.x=200;
		
		System.out.println(a.x);
		System.out.println(a.vname);
		
	}
}
