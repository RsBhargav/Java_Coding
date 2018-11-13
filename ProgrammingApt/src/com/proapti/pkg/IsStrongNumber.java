package com.proapti.pkg;

import java.util.Scanner;

public class IsStrongNumber 
{
	public static int Fact(int n)
	{
		int out = 1;
	for (int i = n; i > 0; i--)
	{
		out = out * i;
	} 
	System.out.println("The Factorial of " + n + " is : "+out);
		return out;
		}
	public static boolean Strong(int num)
	{
		
		int out = 0;
		int temp = num;
		while(num != 0)
		{
			int rem = num % 10;
			Fact(rem);
			out = out+Fact(rem);
			num = num/10;
		} 
		if (out == temp) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean out = Strong(n);
        System.out.println("The Given number " + n + " is Strong ? = "+out);
        	
        if (out)
        {
			System.out.println("Its STRONG NUMBER");
		}
        else
        {
        	System.out.println("Not a STRONG NUMBER");
        }
        sc.close();
	}
	
}
