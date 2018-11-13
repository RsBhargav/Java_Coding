package com.proapti.pkg;

public class Alphabet2 {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; r++)
		{
			//this loop decides no of col
			for (int c = 0; c < n; c++)
			{
				if (r == 0 && c != n-1|| r == n/2 && c !=n-1 || r == n-1 && c != n-1|| c==0 || c==n-1 && r!=0&& r!=n-1&& r!=n/2) {
				System.out.print("* ");}
				else{
				System.out.print("  ");}
			}	//end of innerloop		
			System.out.println();
		}//end of outerloop
			}
}
		
