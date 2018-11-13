package com.proapti.pkg;

public class PyramidRight {

	public static void main(String[] args) {
		int n=5;
		for (int row=0;row<n-1 ;row++ )
		{
			for (int col=0;row>=col;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

		for (int row=0;row<n ;row++ )
		{
			for (int col=0;(row+col)<n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
