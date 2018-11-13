package com.proapti.pkg;

public class Alphabet9 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (r == 0  
						|| r == n-1
						|| c == n/2) 
				{
					System.out.print("I ");
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
