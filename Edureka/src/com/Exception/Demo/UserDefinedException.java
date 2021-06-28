package com.Exception.Demo;

import java.util.Scanner;

public class UserDefinedException extends Exception
{
	public UserDefinedException(String string) {
		super(string);
	}

	public static void main(String[] args) throws UserDefinedException 
	{
		String str;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			str = sc.nextLine();
			try {
				if (str.length() != 10)
					throw new UserDefinedException("Enter the string length of ten");
				else
					System.out.println(str);
				break;
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			finally {
				System.out.println("I am last");
			}
		}
	}

}
