package com.proapti.pkg;

import java.util.Scanner;

public class Strings_CountWord 
{
	public static int count(String s1) 
	{
		int c;
		char ch[] = s1.toCharArray();
		if(ch[0] != ' ')
			c = 1;
		else
			c = 0;
		
		for (int i = 0; i < ch.length-1; i++) 
		{
			if (ch[i] == ' ' && ch[i+1] != ' ')
			{
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		int c1 = count(s1);
		System.out.println("The number of words in "+s1+" = "+c1);
		
		sc.close();
	}

}
