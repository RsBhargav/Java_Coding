package com.proapti.pkg;

import java.util.Scanner;

public class Array_CountRepeated 
{
	public static void CountRepeated(int[] ar) 
	{
		int size = ar.length;
		for (int i = 0; i < size; i++)
		{
			int count = 0;
			for (int j = i+1; j < size; j++) 
			{
				if (ar[i] == ar[j])
				{
					count++;
					int temp = j;
					while (temp < size-1) 
					{
						ar[temp] = ar[temp+1];
						temp++;
					}
					j--;
					size--;
				}
			}
			System.out.println("the"+ar[i]+" repeated "+count+" "+"times");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		int [] ar = new int[size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i] = sc.nextInt();
		} 
		System.out.println("Array elements Before Deleting : ");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"]="+ar[i]);
		} 
		CountRepeated(ar);
		sc.close();
	}
}
