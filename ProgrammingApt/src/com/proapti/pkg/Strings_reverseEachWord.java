package com.proapti.pkg;

import java.util.Scanner;

public class Strings_reverseEachWord
{
	public static String reverse(String s1)
	{
		 String s2 = "";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			String res = "";
			while (i < ch.length&& ch[i] != ' ' ) 
			{
				res = ch[i]+res;
				i++;
			}
			s2 =s2+res+" ";
		}
		return s2;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		
		String s2 = reverse(s1);
		System.out.println(s2);
		sc.close();
	}
}
