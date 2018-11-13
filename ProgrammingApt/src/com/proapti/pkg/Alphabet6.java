package com.proapti.pkg;

public class Alphabet6 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c== 0 
						|| r == 0  

						|| r == n/2) 
				{
					System.out.print("F ");
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
