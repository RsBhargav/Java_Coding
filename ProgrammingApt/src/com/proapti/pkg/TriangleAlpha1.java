package com.proapti.pkg;

public class TriangleAlpha1 {

	public static void main(String[] args) {
		int n=4;
		int count=65;
		for (int row=0;row<n;row++)
		{
		
				for (int space=0;row+space<n-1 ;space++ )

				{
					System.out.print("  ");
				} 
				
				for (int c=0;c<=row ;c++ )
				{
					char c1=(char)count;
					System.out.print(c1+" ");
					count--;
					
				}
					count=count+2*row+n-1;
					System.out.println();
		}

	}

}
