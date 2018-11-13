package com.proapti.pkg;

public class Alphabet24 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				if ( r == c 
						|| r + c == n-1 ) {
				System.out.print("X ");}
				else
				System.out.print("  ");
			}
			System.out.println();
	}
	}

}
