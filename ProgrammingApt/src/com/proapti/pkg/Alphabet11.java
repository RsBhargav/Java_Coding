package com.proapti.pkg;

public class Alphabet11 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c==0
						|| r == n/2 && c == 0 
						|| r == n/4 && c==n/4 
						|| r == 3*n/4 && c == n/4 
						|| c == n/2 && r == 0 
						|| c == n/2 && r == n-1 ) 
				System.out.print("K ");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
