package com.proapti.pkg;

public class PyramidLeft {

	public static void main(String[] args) {
int n=3;
		
		for (int row=0;row<n-1 ;row++ )
		{
			for (int col=0;col<n;col++)
			{
				if (row+col>=n-1)
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
		for (int row=0;row<n ;row++ )
		{
			for (int col=0;col<n;col++)
			{
				if (col>=row)
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
