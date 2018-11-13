package com.proapti.pkg;

public class Alphabet1 {

	public static void main(String[] args) {
		int n = 5;
		//this loop decides number of rows
		for (int r = 0; r < n; r++)
		{
			//this loop decides no of col
			for (int c = 0; c < n; c++)
			{
				if (c == 0 && r != 0
						||c == n-1 && r !=0
						||r == 0 && c != 0 && c != n-1
						||r == n/2) {
				System.out.print("A ");}
				else{
				System.out.print("  ");}
			}	//end of innerloop		
			System.out.println();
		}//end of outerloop
	}
}
