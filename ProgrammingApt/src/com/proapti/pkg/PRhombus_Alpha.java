package com.proapti.pkg;

public class PRhombus_Alpha {

	public static void main(String[] args) {
		int n = 9;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (r == n/2 && c == 0 
						|| r == n/4 && c==n/4 
						|| r == 3*n/4 && c == n/4 
						|| c == n/2 && r == 0 
						|| c == n/2 && r == n-1 
						|| c == 3*n/4 && r== n/4 
						|| c == 3*n/4 && r == 3*n/4 
						|| r == n/2 && c == n-1 ) 
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
