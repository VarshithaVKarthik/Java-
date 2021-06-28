package com.hdfc.loans.carloans;

import java.util.Scanner;

public class If {
      public void Percentage()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter your percentage in PUC:");
    	  int i=sc.nextInt();
		if(i>90)
    	  {
    		  System.out.println("Your Grade is A");
    	  }else if(i>75)
    	  {
    		  System.out.println("Your Grade is B");
    	  }else if(i>65)
    	  {
    		  System.out.println("Your grade is C");
    	  }
    	  else
    	  {
    		  System.out.println("Your are Failed");
    	  }
		sc.close();
      }
	public static void main(String[] args) {
			If it=new If();
			it.Percentage();

	}

}
