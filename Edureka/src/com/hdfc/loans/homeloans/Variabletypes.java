package com.hdfc.loans.homeloans;

public class Variabletypes {
	
	int x=100;
	static String cname="vmware";
	static Variabletypes obj;
	
	public void add()
	{
		add();
		System.out.println(x);
		System.out.println("I am instance method");
	}
	public static void sub()
	{
		obj=new Variabletypes();
		System.out.println(obj.x);
		obj.add();
		
		System.out.println("I am static method");
	}
	public static void main(String[] args) {
		
		Variabletypes obj=new Variabletypes();
		obj.add();
		System.out.println(obj.x);
		sub();
		System.out.println(Variabletypes.cname);

		
		
		
		
		
	}
}
