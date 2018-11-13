package com.proapti.pkg;

import java.util.Scanner;

public class Array_Insert 
{
	public static int[] insertElement(int[] ar , int ele , int index)
	{
		int nar[] = new int[ar.length+1];
		nar[index] = ele;
		for (int i = 0; i < nar.length; i++)
		{
			if(i < index)
			{
			nar[i] = ar[i]; // to copy the elements into the new array as it is...
			}
			else if(i > index)
			{
				nar[i] = ar[i-1]; //to copy the old array elements into the new array along with modified array...
			}
		}
		return nar;	
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
			System.out.println("enter the element to insert : ");
			int ele = sc.nextInt();
			System.out.println("enter the index : ");
			int index = sc.nextInt();
			System.out.println("Array Elements Before modifying");
			for (int i = 0; i < ar.length; i++) 
			{
			System.out.println("ar["+i+"] - "+ar[i]);
			}
			int nar[] = insertElement(ar,ele,index);
			System.out.println("Elements after Modifying");
			for (int i = 0; i < nar.length; i++) 
			{
				System.out.println("ar["+i+"] - "+nar[i]);
			}
			sc.close();
	}
}
