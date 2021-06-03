package com.Home;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of base:");
		int base=sc.nextInt();
		System.out.println("Enter the height of triangle");
		int height=sc.nextInt();
		int area=(base*height)/2;
		System.out.println("The area of Triangle is: " +area);
		sc.close();
	}

}
