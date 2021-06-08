package com.hdfc.loans.personolloans;

public class ChildOverriding extends ParentOverrriding
{	
	public strictfp int care()
	{
		System.out.println("Child=Hi I am good");
		return 0;
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
