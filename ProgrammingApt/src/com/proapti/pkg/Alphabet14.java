package com.proapti.pkg;

public class Alphabet14 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c==0
						|| r == c 
						|| c == n-1  ) 
				System.out.print("N ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
