package com.Home.World;

import java.util.Scanner;

public class OuputByKeyboard {

	public static void main(String[] args) {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Before swap");
		System.out.println("value of A is");
		int a=sc.nextInt();
		System.out.println("value of B is ");
		int b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("After swap");
		System.out.println("value of A is " +a);
		System.out.println("value of B is "+b);
		sc.close();

	}

}
