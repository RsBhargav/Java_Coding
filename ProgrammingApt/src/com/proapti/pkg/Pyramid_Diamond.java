package com.proapti.pkg;

public class Pyramid_Diamond {

	public static void main(String[] args) {
		int n=3;
		for (int row=0;row<n-1 ;row++ )
		{
			for (int space=0;space<n-1-row;space++ )
			{
				System.out.print("  ");
			}
			for (int stars=0;(2*row>=stars);stars++ )
			{
				if (stars==0||stars==2*row)
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
			for (int space=0;space<row;space++ )
			{
				System.out.print("  ");
			}
			for (int stars=0;(stars<2*(n-row)-1);stars++ )
			{
				if (stars==0||stars==2*(n-row)-2)
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
