package com.vnr.devipriya.compoundInterest;
import java.util.*;

public class Si {
	public static void main(String args[])
	{
		double p,r,t,sim;
		Scanner scan=new Scanner(System.in);
		try
		{
		
		System.out.println("Enter the amount");
		//read the input values from keyboard
		p=scan.nextInt();
		System.out.println("Enter the rate of interest ");
		//read the rate of interest
		r=scan.nextInt();
		System.out.println("Enter the no. of years");
		//read the no.years from keyboard
		t=scan.nextInt();
		sim=(p * t * r)/100;
		CI obj=new CI();
		obj.CompIntrst(p,r,t);

		}
		catch(Exception e)
		{
			System.out.println("enter only numbers");
		}
		
		
	}

}

