package com.proapti.pkg;

public class NumberStar1 {
	public static void main(String[] args) 
	{
		
		int n=5;
		for (int row = 0; row < n; row++) 
		{
			for (int space = 0; space <n-1-row; space++)
			{
				System.out.print("  ");
			}
			for (int star = 0; star <=2*row; star++) 
			{
				if(star%2!=0)
				System.out.print("* ");
				else
					System.out.print(star+1+" ");
			}
			System.out.println();
		}
		
		
		
	}
}