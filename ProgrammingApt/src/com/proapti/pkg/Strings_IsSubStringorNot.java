package com.proapti.pkg;

import java.util.Scanner;

public class Strings_IsSubStringorNot 
{
	public static boolean subString(String s1 , String s2)
	{
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) 
		{	
			int j = 0;
			int k = i;
			while (j < c2.length && k < c1.length && c1[k] == c2[j]) 
			{
				j++;
				k++;
			}
			if (j == c2.length) 
			{
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main String : ");
		String s1 = sc.nextLine(); 
		System.out.println("Enter the sub String : ");
		String s2 = sc.nextLine(); 
		
		boolean res = subString(s1,s2);
		
		if (res) 
		{
			System.out.println("It's a SUB-STRING");
		} 
		else 
		{
			System.out.println("It's not a SUB-STRING");
		}
		sc.close();
	}
}
