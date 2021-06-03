package com.Home.World;

import java.util.Scanner;

public class Rectangle {
	static Rectangle rt;
	public void m1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the width:");
	int width=sc.nextInt();
	System.out.println("Enter the length");
	int length=sc.nextInt();
	int area=width*length;
	System.out.println("Area of rectangle is "+ area);
	sc.close();
	}
	
	public static void main(String[] args) {
		 rt=new Rectangle();
		rt.m1();
		
	}

}
