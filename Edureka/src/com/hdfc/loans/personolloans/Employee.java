package com.hdfc.loans.personolloans;

public class Employee {
	int eid;
	String ename;
  
	public Employee() {
		super();
		System.out.println("I am default No-argument Constructor...");
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		 Employee e2=new Employee();
		 System.out.println(e2.eid);
		 System.out.println(e2.ename);

	}

}