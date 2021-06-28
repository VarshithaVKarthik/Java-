package com.hdfc.loans.carloans;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int asize=sc.nextInt();
		int[] a=new int[asize];
		System.out.println("Enter the elements of array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
			sum=sum+a[i];
			//System.out.println("a[" + i +"]" + a[i]);
			
		}System.out.println("The sum of array " +sum);
		
	}
		
		
		 
	
	}


