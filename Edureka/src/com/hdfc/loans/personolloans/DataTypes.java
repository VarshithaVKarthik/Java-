package com.hdfc.loans.personolloans;

public class DataTypes {
	byte b;
	short s;
	int i;
	float f;
	double d;
	boolean bb;
	char ch;
	long l;
	String str;
	static DataTypes obj;
	
	public static void main(String[] args) {
		obj=new DataTypes();
		System.out.println("byte: " + obj.b);
		System.out.println("short: " + obj.s);
		System.out.println("int: " + obj.i);
		System.out.println("float: " + obj.f);
		System.out.println("double: " + obj.d);
		System.out.println("boolean: " + obj.bb);
		System.out.println("char: " + obj.ch);
		System.out.println("long: " + obj.l);
		System.out.println("string: " + obj.str);
		
		
	

	}

}
