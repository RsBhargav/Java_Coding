package com.proapti.pkg;

public class Pyramid_MixAlphabet {

	public static void main(String[] args)
	{

		int n=3;
		for (int row = 0; row < n; row++)
		{
			char a=65;
			for (int space = 0; space < n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int star = 0; star <=2*row; star++) 
			{
				System.out.print(a+++" ");
			}
			System.out.println();
		}
		
		for (int row = n-2; row >=0; row--)
		{
			char a=97;
			for (int space = 0; space < n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int star = 0; star <=2*row; star++) 
			{
				System.out.print(a+++" ");
			}
			System.out.println();
		}
		
		

	}

}
