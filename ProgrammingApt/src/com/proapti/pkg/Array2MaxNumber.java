package com.proapti.pkg;

import java.util.Scanner;

public class Array2MaxNumber 
{
	public static String maxNumber(int ar[])
	{
		int max1 = ar[0];
		int index1 = 0;
		int max2 = ar[0];
		int index2 = 1;
		for (int i = 1; i < ar.length; i++)
		{
			if (max1 < ar[i]) 
			{
				max2 = max1;
				max1 = ar[i];
				index2 = index1;
				index1 = i;
			}
			else if(max2 < ar[i])
			{
	                max2 = ar[i];
					index2 =i;
			}
		}
		String s1 = "The 1st max element is = "+max1;
		String s2 = "The index of 1st max element is = "+index1;
		String s3 = "The 2nd max element is = "+max2;
		String s4 = "The index of 2nd max element is = "+index2;
		return s1+" ; "+s2+" ; "+s3+" ; "+s4;
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
		String res = maxNumber(ar);
		System.out.println(res);
		sc.close();
	}
}
