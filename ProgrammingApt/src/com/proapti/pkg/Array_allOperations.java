package com.proapti.pkg;

import java.util.Scanner;

public class Array_allOperations
{
	
	public static int[] insertElement(int[] ar , int ele , int index)
	{
		int nar[] = new int[ar.length+1];
		nar[index] = ele;
		for (int i = 0; i < nar.length; i++)
		{
			/*if(index>= ar.length ||index < 0)
			{
				System.out.println("cannot found in the array");
				return ar;
			}*/
			if(i < index)
			{
				nar[i] = ar[i]; 
			}
			else if(i > index)
			{
				nar[i] = ar[i-1]; 
			}
			
		}
		return nar;	
	}
	
	public static int[] deleteElement(int[] ar , int index)
	{
		int nar[] = new int[ar.length-1];
		
		for (int i = 0; i < nar.length; i++)
		{
			if(i < index)
			{
				nar[i] = ar[i]; 
			}
			else 
				nar[i] = ar[i+1];
			/*else if(i >= index)
			{
				nar[i] = ar[i+1];
			}*/
		}
		return nar;	
	}
	public static int[] replaceElement(int[] ar , int ele , int index)
	{
		ar[index] = ele;
		return ar;
		
	}
	
	public static int[] createArray(int size)
	{
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		return ar;
		
	}
	
	public static void displayArray(int [] ar)
	{
		System.out.println("Array Elements are");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"] - "+ar[i]);
		}
	}
	public static void main(String[] args) 
	{
		int ar[] = null;  //to re-intialize the array everytime ..so we should not write it inside a while loop...//
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Enter 1 to create an Array");
		System.out.println("Enter 2 to insert an Array");
		System.out.println("Enter 3 to delete an Array");
		System.out.println("Enter 4 to replace an Array");
		System.out.println("Enter 5 to display an Array");
		
		int choice = sc.nextInt();
		
		switch (choice) 
		{
		case 1:
			System.out.println("Enter the size of an Array : ");
			int size = sc.nextInt();
			ar = createArray(size);
			break;
		case 2:
			System.out.println("Enter Element : ");
			int ele = sc.nextInt();
			System.out.println("Enter the INDEX : ");
			int index = sc.nextInt();
			ar = insertElement(ar,ele,index);
			break;
		case 3:
			System.out.println("Enter the INDEX : ");
			int index1 = sc.nextInt();
			ar = deleteElement(ar,index1);
			break;
		case 4:
			System.out.println("Enter Element : ");
			int ele2 = sc.nextInt();
			System.out.println("Enter the INDEX : ");
			int index2 = sc.nextInt();
			ar = replaceElement(ar,ele2,index2);
			break;
		case 5:
			 displayArray(ar);
			break;
			default : 
				System.out.println("Enter the valid Number!!!");
				break;
		}
		System.out.println("Do you wish to continue ?");
		String s1 = sc.next();
			if(s1.equalsIgnoreCase("no")) // equalsIgnoreCase only present in String class ... 
			{
				break;
				//return;
			}
		}
		sc.close();
	}
}


