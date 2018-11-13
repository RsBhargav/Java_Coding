package com.proapti.pkg;

public class TriangleAlpha2 {

	public static void main(String[] args) {
		int n=4;
		int count=65;
		for (int row=0;row<n;row++)
		{
			count=count+row;
			for (int c=0;c<=row ;c++ )
				{
					char c1=(char)count;
					System.out.print(c1+" ");
					count=count+n-1-c;
					
				}
					count=65;
					System.out.println();
		}
		

	}

}
