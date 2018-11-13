package com.proapti.pkg;

public class Pyramid123 {

	public static void main(String[] args) {

		int n=3;
		int count=1;
		for (int row=0;row<n-1 ;row++ )
		{
			for (int space=0;space<n-1-row;space++ )
			{
				System.out.print("  ");
			}
			for (int stars=0;(2*row>=stars);stars++ )
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			count=1;
		}
		

		for (int row=0;row<n ;row++ )
		{
			for (int space=0;space<row;space++ )
			{
				System.out.print("  ");
			}
			for (int stars=0;(stars<2*(n-row)-1);stars++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		
		
		}

	}

}
