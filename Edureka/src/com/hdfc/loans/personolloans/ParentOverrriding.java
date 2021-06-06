package com.hdfc.loans.personolloans;

public class ParentOverrriding {
	 void care()
	{
		System.out.println("Parent=Go to college Early");
	}
	public void trust()
	{
		System.out.println("Parent=Be Safe and study well");
	}
	public static void main(String[] args) {
		ParentOverrriding obj=new ParentOverrriding();
		obj.care();
		obj.trust();

	}

}
