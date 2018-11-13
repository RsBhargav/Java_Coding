package com.proapti.pkg;

import java.util.Scanner;

public class Array_2D_Swapcolumn 
{
	public static int[][] swapcolumn(int[][] ar)
	{
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length/2; j++)
			{
				int temp = ar[i][j];  
				ar[i][j] = ar[i][ar.length-1-j];
				ar[ar.length-1-i][j] = temp;
			}
		}
		return ar;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Outer Array size : ");
		int a = sc.nextInt();
		System.out.println("Enter the Inner Array size : ");
		int b = sc.nextInt();
		
		int ar[][] = new int[a][b];
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print("enter the value ar "+i+"th row and"+j+"the column");
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("The array elements are :-");
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		int nar[][] = swapcolumn(ar);
		System.out.println("The array elements after SWAPPING :-");
		for (int i = 0; i < nar.length; i++) 
		{
			for (int j = 0; j < nar[i].length; j++) 
			{
				System.out.print(nar[i][j]+"  ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
