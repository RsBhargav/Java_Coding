package com.proapti.pkg;

public class PyramidUp
{
	public static void main(String[] args)
	{
		int n = 3;
		for (int rows = 0; rows < n; rows++) 
		{
			for (int spaces = 0; spaces < n-1-rows; spaces++) 
			{
				System.out.print("  ");
			}
			for (int star = 0; 2*rows >= star; star++) 
			{
					System.out.print("* "); 
			}
			System.out.println();
		}
	}
}
