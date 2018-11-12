package com.practice.java;

import java.util.Scanner;

public class Array_2D_Max_Col {

	static Scanner sc = new Scanner(System.in);
	/*public static int[][] createArray(int r, int c)
	{
		int [][] ar = new int[r][c];
	 
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print("Enter a["+i+"]["+j+"] = ");
				ar[i][j] = sc.nextInt();
			}
		}
		return ar;
	}
	 
	public static void Num(int ar[][]) 
	{
	 
		for (int i = 0; i < ar.length; i++) 
		{
			int max = ar[0][i];
			for (int j = 1; j < ar[i].length; j++) 
			{
				if (ar[i][j] > max) 
				{
					max = ar[j][i];
				}
			}
			System.out.println("The max value at "+i+" Column is : "+max);
		}
	} 
	public static void main(String[] args) 
	{
		System.out.print("Enter Outer Array size : ");
		int a = sc.nextInt();
		System.out.print("Enter Inner Array size : ");
		int b = sc.nextInt();
		int[][] ar = createArray(a, b);
		Num(ar);
	 
		sc.close();
	}

}*/
	
	public static void main(String[] args) 
	{
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][] arr = new int[r][c];
		 
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print("Enter a["+i+"]["+j+"] = ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = arr[0][0];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				if (arr[j][i] > max) {
					max = arr[j][i];
				}
				System.out.println(max);
				max = 0;
			}	
		}
	}
	
	}
	