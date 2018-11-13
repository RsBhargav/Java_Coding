package com.proapti.pkg;

public class Alphabet17 {

	public static void main(String[] args) {
		int n = 10;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (r == 0 && c < 3*n/4 && c != 3*n/4 && c!=0
						|| c == 0 && r < 3*n/4 && r != 0 && r != 3*n/4
						|| r == 3*n/4 && c < 3*n/4 && c!= 0
						|| c == 3*n/4&& r < 3*n/4 && r!=0 
						|| r == c && r>= n/2)
				System.out.print("Q ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
