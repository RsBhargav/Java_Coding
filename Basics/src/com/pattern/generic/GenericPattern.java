package com.pattern.generic;

public class GenericPattern
{
	private static final String STAR = "* ";
	private static final String SPACE = "  ";
	
	public static void main(String[] args) 
	{
		
		int[][] pattern = {
				            {1,1,1,0},
				            {1,0,0,1},
				            {1,1,1,0},
				            {1,0,0,1},
				            {1,1,1,0}
						  };
		for (int[] b : pattern) 
		{
			for (int c : b) 
			{
				System.out.print((c==1)?STAR:SPACE);
			}
			System.out.println();
		}		
	}
}