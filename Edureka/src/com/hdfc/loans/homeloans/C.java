package com.hdfc.loans.homeloans;


import com.hdfc.loans.personolloans.BB;

public class C extends BB {
	public void m3()
	 {
		 System.out.println("I am m3 from class C");
	 }

	public static void main(String[] args) {
		BB b=new BB();
		b.m1();
		b.m2();
		 C c=new C();
		 c.m3();
		 c.m1();
		 c.m2();
		 

	}

}
