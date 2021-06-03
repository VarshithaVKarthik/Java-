package com.hdfc.loans.carloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		Hdfc i=new Hdfc();
		i.withdrawel();
		i.deposit();
		

	}

	@Override
	public void withdrawel() {
		System.out.println("I am overriden withdrawel from hdfc....");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden deposit from hdfc....");
		
	}

}
