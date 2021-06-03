package com.hdfc.loans.carloans;



import java.util.Date;

import com.hdfc.loans.homeloans.A;


public class C extends A
{
	 public final void m1()
	 {
		 System.out.println("I am overrridden ");
	 }
	 public void m3()
	{
		System.out.println("HI I am from class C");
	}
	//* public  void m5()
	  {
		  System.out.println("Iam m5 static method overriden from class A");
	  }//*
	
	 static
	 {
		 Date dt=new Date();
		 System.out.println(dt);
		 
	 }
	 
	 static 
	 {
		 System.out.println("Hi I am second static block");
	 }

	public static void main(String[] args) {
		A a=new A();
		A.m5();
		a.m1();
		C c=new C();
		c.m3();
		c.m1();
		A.m5();
		//A.m5();
		System.out.println(c.x);
	}

}
