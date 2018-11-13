package com.proapti.pkg;

import java.util.Scanner;

public class Array_2D_ClockWise 
{
	public static int[][] cyclic(int ar[][])
	{
		int count = 1;
		for (int start = 0 , end = ar.length-1 ; start < end ; start++ , end--)
		{
			for (int i = start; i < end; i++) 
			{
				ar[start][i] = count++;
			}
		
			for (int i = start; i < end; i++) 
			{
				ar[i][end] = count++;
			}
		
			for (int i = end; i > start; i--) 
			{
				ar[end][i] = count++;
			}
		
			for (int i = end; i > start; i--) 
			{
				ar[i][start] = count++;
			}
		}
		if (ar.length%2 != 0) 
		{
			ar[ar.length/2][ar.length/2] = count;	
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
		
	/*	int ar[][] = new int[5][5]; */
		
		int nar[][] = cyclic(ar);
		
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print(nar[i][j]+"  ");
			}
			System.out.println();
		}
		sc.close();
	}
		
}
