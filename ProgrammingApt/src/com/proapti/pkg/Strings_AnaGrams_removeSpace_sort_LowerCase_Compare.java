package com.proapti.pkg;

import java.util.Scanner;

public class Strings_AnaGrams_removeSpace_sort_LowerCase_Compare
{
	public static String removeSpace(String s1)
	{
		String res = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] != ' ')
			{
				res = res+ch[i];
			}
		}
		return res;
	}
	
/*	public static String toUpperCase(String s1)   
	{
		String res = "";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
	
			if (ch[i] >= 97 && ch[i] <= 122)  
			{
				ch[i] = (char)(ch[i]-32);
			}
			res = res + ch[i];
		}
		return res;
	}  */
	
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
	
	public static String Sort(String s1)
	{
		char[] ch = s1.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length-1; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if (ch[i] > ch[j]) 
				{
					
					char temp = ch[i];  
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
			res = res + ch[i];
		}
		return res;
	}
	
	public static boolean compare (String s1 , String s2)
	{
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c2.length; i++) 
		{
			if (c1[i] != c2[i])
			{
				return false;
			}
		}
		return true;
	}
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String :-");
		String s1 = sc.nextLine();
		System.out.println("Enter the Second String :-");
		String s2 = sc.nextLine();
		
		System.out.println("The given Strings are :- ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		s1 = removeSpace(s1);
		s2 = removeSpace(s2);
		
		System.out.println("The Strings after removing the spaces are :- ");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		if (s1.length() == s2.length())
		{
			s1 = toLowerCase(s1);
			s2 = toLowerCase(s2);
			//logic for Anagram
			System.out.println("The Strings after Converting :- ");
			System.out.println("s1 = "+s1);
			System.out.println("s2 = "+s2);
			
			s1 = Sort(s1);
			s2 = Sort(s2);
			
			System.out.println("The Strings after Sorting :- ");
			System.out.println("s1 = "+s1);
			System.out.println("s2 = "+s2);
			
			boolean res = compare(s1,s2);
			if(res)
			{
				System.out.println("Strings are ANAGRAM");
			}
			else System.out.println("Strings are not ANAGRAM");
		} 
		else 		
		{
			System.out.println("The given Strings are not ANAGRAM");
		}
		sc.close();
	}

}