package com.proapti.pkg;

public class Alphabet18 
{
	public static void main(String[] args)
	{
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c == 0 && r !=0
						||c==n-1 && r !=0 && r < n/2 && r != n/2
						||r == 0 && c != 0 && c != n-1
						||r == n/2 && c != n-1
						|| r-c == n/4) {
				System.out.print("R ");}
				else
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
