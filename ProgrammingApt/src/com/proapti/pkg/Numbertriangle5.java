package com.proapti.pkg;

public class Numbertriangle5 {
	public static void main(String[] args)
	{
		int n=4;
		int p=1;
		for (int i = 1; i <= n; i++)
		{
			if(i==1)
			{
				for (int j = 1; j <= i; j++) 
				{
					System.out.print(p++ +" ");
					
				}
			}
			else
			{
				for (int j = 1; j <= i; j++) 
				{
				
					System.out.print(p++ +" ");
					System.out.print(" ");
					
				}
			}
			
			
			System.out.println(" ");
			
			
		}


	}

}
