package com.hdfc.loans.carloans;

public class SecondClass {
	int a=20,b=10,c;
	public void add()
	{
		c=a+b;
		System.out.println("addition of a and b: "+c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("substraction of a and b is: "+c);
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		SecondClass obj=new SecondClass();
		obj.add();
		obj.sub();
		System.out.println(obj.c);
	}

}
