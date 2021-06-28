package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class Ademo {
     int asize;
     int[] a;
	int sum,i;
     public int ademo()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the array size");
    	 asize=sc.nextInt();
    	 a=new int[asize];
    	 System.out.println("Enter the elements of array");
    	 for(i=0;i<a.length;i++)
    	 {
    		 a[i]=sc.nextInt();
    		 sum=sum+a[i];
    	 }System.out.println("sum of array is " +sum);
		return sum;
    	 
     }
	public static void main(String[] args) {
		Ademo ad=new Ademo();
		ad.ademo();
		Ademo ad1=new Ademo();
		ad1.ademo();

	}

}
