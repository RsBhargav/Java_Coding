package com.proapti.pkg;

public class TriangleDownRight {

	public static void main(String[] args) {
		int n=5;
		for(int row=0;row<n;row++)
		{
			for (int col=0; col<n;col++ )
			{
				if (row<=col)
				
				{
							System.out.print("* ");

				}
				else 
				{
					System.out.print("  ");
				}
				
			}
					System.out.println();

		}
	}
}
