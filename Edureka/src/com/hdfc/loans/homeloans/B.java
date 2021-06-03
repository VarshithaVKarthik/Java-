package com.hdfc.loans.homeloans;

public class B extends A
{
	 public void m1()
	 {
		 System.out.println("I am overrridden M1 from class C");
	 }
 void m2()
 {
	 System.out.println("Hi I am from class B");
 }
	 //*public void m5()
	  {
		  System.out.println("Iam m5 static method overrriden from class A");
	  }//*
	
 
	public static void main(String[] args) {
		A a=new A();
		//a.m5();
		System.out.println(a.x);
		a.m1();
		B b=new B();
		b.m2();
		b.m1();
		//a.m5();
		m5();
		System.out.println(b.x);

	}

}
