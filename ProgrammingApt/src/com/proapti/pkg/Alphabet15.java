package com.proapti.pkg;

public class Alphabet15 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if (c==0 && r !=0 && r!= n-1
						|| r == 0 &&  c !=0 && c!= n-1
						|| r == n-1 && c !=0 && c!= n-1
						|| c == n-1 && r !=0 && r!= n-1 ) 
				System.out.print("0 ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}

}
