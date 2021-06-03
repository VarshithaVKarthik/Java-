package com.hdfc.loans.carloans;

public class Icici implements Rbi {
	

	public static void main(String[] args) {
		Icici i=new Icici();
		i.withdrawel();
		i.deposit();

	}

	@Override
	public void withdrawel() {
		System.out.println("I am overriden withdrawel from Icici....");
		
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden deposit from Icici....");
		
		
	}

}
