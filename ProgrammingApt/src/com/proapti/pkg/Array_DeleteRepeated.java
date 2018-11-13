package com.proapti.pkg;

import java.util.Scanner;

public class Array_DeleteRepeated 
{
	public static int[] Delete(int []ar) //Method Declaration with return type integer array and variable array integer...//
	{
		int size = ar.length;
		for (int i = 0; i < size-1; i++) //outer for loop...// // i = 0 indexes the element of the first element...//
		{
			for (int j = i+1; j < size; j++) //inner for loop...// // i+1 is used to compare the elements with immediate next element of the Array//
			{
				if (ar[i] == ar[j]) // condition to check whether the first and second element same or not ...if same execute while loop// 
				{
					int temp = j; // not to modify the J value after performing iteration so temporary variable is taken to store the variable...//
					while (temp < size-1) //the length is user specified so it will check up to the last element..//
					{
						ar[temp] = ar[temp+1];
						temp++; 
					}
					j--; // comparison will happen with the next element...//
					size--; // to decrease the length of an array after performing the iteration ...//
				}
			}
		}
		int nar[] = new int[size];
		for (int i = 0; i < size; i++) 
		{
			nar[i] = ar[i];
		}
		return nar; // returning integer array...//
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
		System.out.println("Array elements Before Deleting : ");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"]="+ar[i]);
		} 
		int nar[] = Delete(ar);
		System.out.println("Array elements After Deleting : ");
		for (int i = 0; i < nar.length; i++) 
		{
			System.out.println("nar["+i+"]="+nar[i]);
		} 
		sc.close();
	}
}
