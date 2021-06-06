package com.hdfc.loans.personolloans;

public class ChildOverriding extends ParentOverrriding
{	
	public void care()
	{
		System.out.println("Child=Hi I am good");
	}
	public void love()
	{
		System.out.println("Child=Love your friends");
	}
	public static void main(String[] args) {
		ChildOverriding obj=new ChildOverriding();
		obj.love();
		obj.care();
		
		
		
		ParentOverrriding ob=new ParentOverrriding();
		ob.care();
		ob.trust();
		
		
	}

}
