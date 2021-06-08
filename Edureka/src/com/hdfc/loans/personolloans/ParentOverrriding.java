package com.hdfc.loans.personolloans;

public  class ParentOverrriding {
	public  strictfp int care()
	{
		System.out.println("Parent=Go to college Early");
		return 0;
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
