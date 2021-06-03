package com.hdfc.loans.carloans;

public interface Rbi {
	public void withdrawel();
	public void deposit();
	
	public static void main(String[] args) {
		Rbi i;
		i=new Hdfc();
		i.deposit();
		i.withdrawel();
		i=new Icici();
		i.deposit();
		i.withdrawel();
		
	}

}
