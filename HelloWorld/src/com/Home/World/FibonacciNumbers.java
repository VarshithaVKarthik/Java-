package com.Home.World;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n=10,ft=0,st=1;
		System.out.println("Fibonacci numbers upto" + n + "terms");
		for(int i=1;i<=n;i++)
		{
			System.out.println(ft + ",");
			int nt=ft+st;
			ft=st;
			st=nt;
		}

	}

}
