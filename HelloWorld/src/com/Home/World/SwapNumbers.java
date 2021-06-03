package com.Home.World;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=2,b=4;
		System.out.println("Before swap");
		System.out.println("value of A is" +a);
		System.out.println("value of B is " +b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After swap");
		System.out.println("value of A is " +a);
		System.out.println("value of B is "+b);
		

	}

}
