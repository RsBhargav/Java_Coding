package com.proapti.pkg;

import java.util.Scanner;

public class Strings_WordAlongNumber 
{
	public static String reverse(String s1)
	{
		String res = "";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 0;
			while (i < ch.length && ch[i] != ' ') 
			{
				count++;
				res = res+ch[i];
				i++;
			}
			 res = res+count+" ";
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine(); 
		System.out.println(reverse(s1));
		sc.close();
	}
}