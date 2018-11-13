package com.proapti.pkg;

import java.util.Scanner;

public class Strings_parseInt 
{
	public static int parseInt(String s1)
	{
		int out = 0;
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] >= 48 && ch[i] <= 57) 
			{
				out = out*10+(ch[i]-48);
			}
			else return -1;
		}
		return out;
	
	}

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :- ");
	String s1 = sc.next();
	System.out.println("Output :- "+parseInt(s1));
	sc.close();
	}

}
