package com.practice.java;

import java.util.Scanner;

public class Strings_numOfVowels 
{
	public static void count(String str)
	{ 
		 int count = 0;
		
		 for (int i = 0; i < str.length(); i++) 
		 {
			 char ch = str.charAt(i);
		
			 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			 {
				 count++;
			 }
		 }
		
		 System.out.println("Number of vowels : " + count);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String s1 = sc.nextLine().toLowerCase();
		count(s1);
		sc.close();
	}

}