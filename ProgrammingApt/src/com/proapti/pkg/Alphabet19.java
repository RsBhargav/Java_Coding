package com.proapti.pkg;

public class Alphabet19 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c == 0  && r < n/2 && r != 0 && r != n/2 
						||r == 0 && c !=0
						|| r == n/2 && c != 0 && c != n-1
						|| r == n-1 && c != n-1
						|| c == n-1 && r > n/2 && r != n/2 && r != n-1) {
				System.out.print("S ");}
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
