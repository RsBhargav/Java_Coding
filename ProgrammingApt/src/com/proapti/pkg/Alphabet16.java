package com.proapti.pkg;

public class Alphabet16 {

	public static void main(String[] args) {
		int n = 5;
		//this loop decides number of rows
		for (int rows = 0; rows < n; rows++)
		{
			//this loop decides no of col
			for (int col = 0; col < n; col++)
			{
				if (col==0
						||rows==0&&col<=n/2&&col != n/2
						||rows==n/2&&col<=n/2&&col != n/2
						||col==n/2&&rows!=0&&rows!=n/2&&rows<=n/2 ) {
				System.out.print("P ");}
				else{
				System.out.print("  ");}
			}	//end of innerloop		
			System.out.println();
		}//end of outerloop
	}
}
