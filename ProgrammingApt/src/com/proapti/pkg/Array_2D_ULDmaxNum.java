package com.proapti.pkg;

import java.util.Scanner;

public class Array_2D_ULDmaxNum 
{
	static Scanner sc = new Scanner(System.in);
	public static int[][] createArray(int a, int b)
	{
		int [][] a1 = new int[a][b];
		
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				System.out.println("Enter the a["+i+"]["+j+"] = ");
				a1[i][j] = sc.nextInt();
			}
		}
		return a1;
	}
	
	public static void BiggestNum(int ar[][]) 
	{
		int pdmax = ar[0][0]; 
		int lmax = ar[1][0] ; 
		int umax = ar[0][1];
	for (int i = 0; i < ar.length; i++) 
	{ 
		for (int j = 1; j < ar[i].length; j++) 
		{
			if (i == j) 
			{
				if (pdmax < ar[i][j])
				{
					pdmax = ar[i][j];
					System.out.println("The maximum value at "+i+" row is : "+pdmax);
				}
			}
			else if (i > j) 
			{
				if (lmax < ar[i][j])
				{	
				lmax = ar[i][j];
				System.out.println("The maximum value at "+i+" row is : "+lmax);
				}
			}
			else if (i < j)
			{
				if (umax < ar[i][j])
				{
					umax = ar[i][j];
					System.out.println("The maximum value at "+i+" row is : "+umax);
				}
			}
		}
	}
}	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Outer Array size : ");
		int a = sc.nextInt();
		System.out.println("Enter the Inner Array size : ");
		int b = sc.nextInt();
		int[][] a1 = createArray(a, b);
		BiggestNum(a1);
		
		sc.close();
	}

}
