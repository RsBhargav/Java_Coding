package com.proapti.pkg;

public class Alphabet12 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c== 0|| r == n-1) 
				{
					System.out.print("L ");
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
