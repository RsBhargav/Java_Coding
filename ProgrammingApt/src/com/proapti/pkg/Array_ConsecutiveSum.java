package com.proapti.pkg;

import java.util.Scanner;

public class Array_ConsecutiveSum {
	public static int BigconsSum(int ar[])
	{
		int cmax = ar[0]+ar[1];
		for (int i = 1; i < ar.length-1; i++)
		{
			if (cmax < ar[i]+ar[i+1]) 
			{
				cmax = ar[i]+ar[i+1];
				
			}
		}
		return cmax;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		int [] ar = new int[size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i] = sc.nextInt();
		}
		int res = BigconsSum(ar);
		System.out.println("The Biggest Consecutive Sum is "+res);
		sc.close();
	}
}
