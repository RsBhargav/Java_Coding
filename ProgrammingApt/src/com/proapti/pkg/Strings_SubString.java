package com.proapti.pkg;

import java.util.Scanner;

public class Strings_SubString 
{
	public static String subString(String s , int start ,int end)
	{
		
		char[] ch = s.toCharArray();
		String res = "";
		for (int i = start; i < end; i++) 
		{
			res = res + ch[i];
		}
		return res;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String s1 = sc.nextLine();
		System.out.println("Enter the starting index :- ");
		int a = sc.nextInt();
		System.out.println("Enter the ending index :- ");
		int b = sc.nextInt();
		System.out.println(subString(s1,a,b));
		sc.close();

	}

}
