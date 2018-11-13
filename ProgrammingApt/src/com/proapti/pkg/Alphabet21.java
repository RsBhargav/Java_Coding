package com.proapti.pkg;

public class Alphabet21 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c == 0 && r != n-1
						||c == n-1 && r != n-1
						||r == n-1 && c != 0 && c != n-1) {
				System.out.print("U ");}
				else
				System.out.print("  ");
			}
			System.out.println();
	}
	}

}
