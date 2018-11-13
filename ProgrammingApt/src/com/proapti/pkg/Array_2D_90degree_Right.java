package com.proapti.pkg;

import java.util.Scanner;

public class Array_2D_90degree_Right
{

	public static int[][] transpose(int[][] ar)
	{
		int row = ar.length;
		int col = ar[0].length;
		int nar[][] = new int[col][row];
		for (int i = 0; i < nar.length; i++) 
		{
			for (int j = 0; j < nar[i].length; j++)
			{
				
				nar[i][j] = ar[i][j];
			}
		}
		return nar;
	}
	
	public static int[][] swaprows(int[][] ar)
	{
		for (int i = 0; i < ar.length/2; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				int temp = ar[i][j];   
				ar[i][j] = ar[ar.length-1-i][j];
				ar[ar.length-1-i][j] = temp;
			}
		}
		return ar;
	}
	
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
		int rows = sc.nextInt();
		System.out.println("Enter the Inner Array size : ");
		int col = sc.nextInt();
		
		int ar[][] = new int[rows][col];
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
		
		//rotate 90 Degree right
				int nar[][] = transpose(ar);
				int nar1[][] = swapcolumn(nar);
		
		System.out.println("The array elements after 90 degree right :-");
		for (int i = 0; i < nar1.length; i++) 
		{
			for (int j = 0; j < nar1[i].length; j++) 
			{
				System.out.print(nar1[i][j]+"  ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
