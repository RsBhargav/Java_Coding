package com.proapti.pkg;

public class Array_2D_Basics3 {

	public static void main(String[] args) {
	/*	int [][]ar = new int[4][];  // if we dont intialize the value in the second one RUN TIME EXCEPTION WILL BW THROWED ...No C.T.E   */
		
		int []ar[][] = new int[4][2][3];
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("----------------");
			for (int j = 0; j < ar[i].length; j++) 
			{
				
				for (int k = 0; k < ar[j].length; k++) 
				{
				System.out.println("ar["+i+"]["+j+"] = "+ar[i][j][k]);
				
				}
		
			}
			
		}	

	}

}
