package com.Exception.Demo;

import java.util.Scanner;

public class Exception1 {
			
	public static void main(String[] args) {
		
		int nr,dr,result;
		
		 while (true) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter numerator value");
				nr=sc.nextInt();
				System.out.println("enter denominator value");
				dr=sc.nextInt();
				result = nr / dr;
				System.out.println(result);
				break;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("denominator value should be greater than zero");
			} 
		}
		 
		 
		

}}
