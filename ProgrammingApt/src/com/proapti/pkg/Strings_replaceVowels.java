/* Program to replace vowels in a given string */
package com.proapti.pkg;

import java.util.Scanner;

public class Strings_replaceVowels 
{
	public static String toLowerCase(String s1)   
	{
		String res = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] >= 65 && ch[i] <= 90)   
			{
				ch[i] = (char)(ch[i]+32);
			}
			res = res + ch[i];
		}
		return res;
	}
	
	public static String replace(String s1)
	{
		 String res = "";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			switch (ch[i]) 
			{
			case 'a':res = res + '$';
				break;
			case 'e':res = res + '@';
				break;
			case 'i':res = res + '%';
				break;
			case 'o':res = res + '!';
				break;
			case 'u':res = res + '^';
				break;
			default: res = res + ch[i];
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  String : ");
		String s1 = sc.nextLine();
		String s2 = toLowerCase(s1);
		System.out.println("RESULT :-  "+replace(s2));
		sc.close();
	}
}