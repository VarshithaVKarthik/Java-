package com.hdfc.loans.personolloans;

public class EmployeeChild extends Employee
{
	String location;
	public EmployeeChild(String location) {
		super(200, "Queen", 50000);
		this.location=location;
		System.out.println(this.location);
	}
	 public void m1()
	 {
		 
	 }
	public static void main(String[] args) {
		EmployeeChild ec=new EmployeeChild("Bangalore");
		

	}

}
