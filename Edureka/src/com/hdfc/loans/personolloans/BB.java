package com.hdfc.loans.personolloans;

public class BB extends AA {
	public void m1()
	 {
		 System.out.println("I am overriidden from class AA");
	 }
	public void m2()
	 {
		 System.out.println("I am m2 from class BB");
	 }

	public static void main(String[] args) 
	{
		AA a=new AA();
		a.m1();
		BB b=new BB();
		b.m2();
		b.m1();
		 

	}

}
