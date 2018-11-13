package com.proapti.pkg;

import java.util.Scanner;

public class ArrayNMax_Sort 
{
	public static int[] Sort(int ar[])
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = i+1; j < ar.length; j++) // i+1 is used to compare the elements with immediate next element of the Array//
			{
				if (ar[i] < ar[j]) 
				{
					int temp = ar[i];  //Swapping technique is used so temporary(temp) variable is taken//
					ar[i] = ar[j];
					ar[j] = temp;
					
					/* a = a^b;  //XOR operator   //other than using temporary variable...
					 * b = a^b;
					 * a = a^b;
					 */
					
					/* a = a+b;
					 * b = a-b;
					 * a = a-b;
					 */
					
					/* a = a*b;
					 * b = a/b;
					 * a = a/b;
					 */
				}
			}
		}
		return ar;
	}
	public static int Max(int[] ar,int n)
	{
		if (n <= 0 || n > ar.length) {
			System.out.println("invalid position");
			return 0;
		} else 
			return ar[n-1];
		
	}
	public static int Min(int[] ar,int n)
	{
		if (n <= 0 || n > ar.length) {
			System.out.println("invalid position");
			return 0;
		} else 
		return ar[ar.length-n];
		
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
		
		int [] ar1 = Sort(ar);
		System.out.println("Enter the which Maximum Value : ");
		int n = sc.nextInt();
		int m = Max(ar1,n);
		System.out.println("the "+n+"th maximum is "+m);
		sc.close();
	}
}
