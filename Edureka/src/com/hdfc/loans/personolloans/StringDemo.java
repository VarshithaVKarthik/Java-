package com.hdfc.loans.personolloans;

public class StringDemo {

	public static void main(String[] args) {
		String s1="varshithakarthik";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.startsWith("Var"));
		System.out.println(s1.endsWith("thik"));
		System.out.println(s1.contains("Karthik"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.substring(1, 7));
		
		String s3=new String("VARSHITHAlovesKARTHIK");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.trim().equals(s3));
		System.out.println(s1.trim().equalsIgnoreCase(s3));
		System.out.println(s1.toUpperCase().equals(s3));
		System.out.println(s3.toLowerCase().equals(s1));
	    String[] s4=s3.split("A");
	    System.out.println(s4[0]);
	    System.out.println(s4[1]);
	    System.out.println(s4[2]);
	    System.out.println(s4[0].isEmpty());
	    System.out.println(s1.concat(s3));
	    System.out.println(s1.replace("varshitha","VARSHITHA"));
	    System.out.println(s1.concat(s3));
	    
	    StringBuilder str=new StringBuilder("Varshitha");
	    System.out.println(str);
	    System.out.println(str.hashCode());
	     
	    StringBuffer str1=new StringBuffer("Karthik");
	    System.out.println(str1);
	    System.out.println(str1.hashCode());
	     str=str.append(str1);
	     System.out.println(str);
	     System.out.println(str.hashCode());
	     
	}

}
