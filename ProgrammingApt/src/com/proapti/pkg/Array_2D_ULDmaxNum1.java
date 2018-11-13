package com.proapti.pkg;

public class Array_2D_ULDmaxNum1 
{
	public static void max(int ar[][])
	{
		int pdmax = ar[0][0]; 
		int lmax = ar[1][0] ; 
		int umax = ar[0][1];
		
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				if (i == j) 
				{
					if (pdmax < ar[i][j])
					{
						pdmax = ar[i][j];
					}
				}
				else if (i > j) 
				{
					if (lmax < ar[i][j])
					{	
					lmax = ar[i][j];
					
					}
				}
				else if (i < j)
				{
					if (umax < ar[i][j])
					{
						umax = ar[i][j];
						
					}
				}
			}
			
		}
		System.out.println("Upper Maximum value : "+umax);
		System.out.println("Lower Maximum value : "+lmax);
		System.out.println("Principle Diagonal Maximum value : "+pdmax);
	}

	public static void main(String[] args) 
	{
		int ar[][] = {{12,15,6},{8,10,7},{3,4,11}};
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		max(ar);
	}
}
