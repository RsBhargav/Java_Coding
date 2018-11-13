package com.proapti.pkg;

import java.util.Scanner;

public class Strings_IsSubString_Occurrences 
{
	public static int subString(String s1 , String s2)
	{
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int count = 0;
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
				System.out.println("the substring is present between "+i+" and "+(k-1));
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main String : ");
		String s1 = sc.nextLine(); 
		System.out.println("Enter the sub String : ");
		String s2 = sc.nextLine(); 
		
		int res = subString(s1,s2);
		
		if (res > 0) 
		{
			System.out.println("It's a SUB-STRING occuring "+res+" times");
		} 
		else 
		{
			System.out.println("It's not a SUB-STRING");
		}
		sc.close();
	}
}
