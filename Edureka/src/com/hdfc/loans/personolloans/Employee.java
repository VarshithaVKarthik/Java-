package com.hdfc.loans.personolloans;

public class Employee {
	int eid;
	String ename;
	float sal;
  
	
	  public Employee() {
	  
	  System.out.println("I am default No-argument Constructor...");
	  System.out.println(this.eid); System.out.println(this.ename);
	  System.out.println(this.sal);
	  
	  }
	 
	public Employee(int eid) 
	{
		this();
		this.eid=eid;
		 System.out.println(this.eid);
		 System.out.println(this.ename);
		 System.out.println(this.sal);
	}

	public Employee(int eid, String ename) 
	{
		this(500);
		this.eid=eid;
		this.ename=ename;
		 System.out.println(this.eid);
		 System.out.println(this.ename);
		 System.out.println(this.sal);
	}

	

	public Employee(int eid, String ename, float sal)
	{
		this(40,"Pallavi");
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
		 System.out.println(this.eid);
		 System.out.println(this.ename);
		 System.out.println(this.sal);
	}

	public static void main(String[] args) {
		 
		 Employee e4=new Employee(60,"sanvi",50000f);

	}

}