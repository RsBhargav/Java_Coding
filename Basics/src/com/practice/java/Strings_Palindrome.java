package com.practice.java;

import java.util.Scanner;

public class Strings_Palindrome {
	
	 public static boolean isPal(String s)
	    {
	        if(s.length() == 0 || s.length() == 1)
	            return true; 
	        if(s.charAt(0) == s.charAt(s.length()-1))
	            return isPal(s.substring(1, s.length()-1));
	        return false;
	    }
	    public static void main(String[]args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("type a word to check if its a palindrome or not");
	        String x = sc.nextLine();
	        if(isPal(x))
	            System.out.println(x + " is a palindrome");
	        else
	            System.out.println(x + " is not a palindrome");
	        sc.close();
	    }
}
/*
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

	}*/