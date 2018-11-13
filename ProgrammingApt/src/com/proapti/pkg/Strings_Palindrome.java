package com.proapti.pkg;

import java.util.Scanner;

public class Strings_Palindrome 
{
	public static boolean isPalindrome(String s1)
	{
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length/2; i++) 
		{
			if (ch[i] != ch[ch.length-1-i])
			{
				return false;
			}
		}
		return true;
	}
		

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.next();
		boolean res = isPalindrome(s1);
		if(res)
		System.out.println("The given String is palindrome");
		else
			System.out.println("The given String is not a palindrome");
		sc.close();
	}

}
