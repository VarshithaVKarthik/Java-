package com.hdfc.loans.homeloans;

public class Calculations {
	int a,b,c;
	public Calculations(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		c=a+b;
		System.out.println("Addition of a and b is " +c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("Substraction of a and b is " +c);
	}
	public static void main(String[] args) {
		Calculations cal=new Calculations(100,200);
		cal.add();
		cal.sub();
		Calculations cal1=new Calculations(500,700);
		cal1.add();
		cal1.sub();

	}

}
