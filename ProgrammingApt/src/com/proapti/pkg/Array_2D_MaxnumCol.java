package com.proapti.pkg;

import java.util.Scanner;

public class Array_2D_MaxnumCol
{
	static Scanner sc = new Scanner(System.in);
	public static int[][] createArray(int a, int b)
	{
		int [][] ar = new int[a][b];

		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				System.out.println("Enter the a["+i+"]["+j+"] = ");
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
			System.out.println("The maximum value at "+i+" Column is : "+max);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the Outer Array size : ");
		int a = sc.nextInt();
		System.out.println("Enter the Inner Array size : ");
		int b = sc.nextInt();
		int[][] ar = createArray(a, b);
		Num(ar);

		sc.close();
	}

}