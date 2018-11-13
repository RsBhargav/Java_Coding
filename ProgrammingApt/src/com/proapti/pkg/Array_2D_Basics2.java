package com.proapti.pkg;

public class Array_2D_Basics2
{

	public static void main(String[] args)
	{
		int [][]ar = {{1,2},{4},{5,6,7}};
		
		System.out.println("rows = "+ar.length); 
		
		System.out.println("----------------");
		
		System.out.println("0 th row = "+ar[0].length); 
		System.out.println("1 th row = "+ar[1].length);
		System.out.println("2 th row = "+ar[2].length);
		
		System.out.println("----------------");
		
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.println("ar["+i+"]["+j+"] = "+ar[i][j]);
			}
			System.out.println("----------------");
		}	
	}
}
