package com.proapti.pkg;

import java.util.Scanner;

public class Array_2D_SumOfAll
{
	static Scanner sc = new Scanner(System.in);
	public static int[][] createArray(int a, int b)
	{
		int [][] a1 = new int[a][b];
		
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.print("Enter the a["+i+"]["+j+"] = ");
				a1[i][j] = sc.nextInt();
			}
		}
		return a1;
	}
	
	public static int adding(int a[][])
	{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
			count = count + a[i][j];
			}
		}
		return count;
	}	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Outer Array size : ");
		int a = sc.nextInt();
		System.out.println("Enter the Inner Array size : ");
		int b = sc.nextInt();
		int[][] a1 = createArray(a, b);
		int res = adding(a1);
		System.out.println("Sum of an Array of all Elements = "+res);
		sc.close();
	}

}