package com.proapti.pkg;

import java.util.Scanner;

public class Strings_SplitMethod
{
	
	public static String[] split(String s1 , String s2)
	{
		String ar[] = new String[5];
		int c = 0;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			String res = "";
			while(i < ch.length && ch[i] != s2.charAt(0))
			{
				res = res + ch[i];
				i++;
			}
			ar[c++] = res;
		}
		return ar;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main String : ");
		String s1 = sc.nextLine(); 
		
		System.out.println("in-built method");
		String ar[] = s1.split(" ");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		
		System.out.println("user defined");
		String ar1[] = split(s1," ");
		
		for (int i = 0; i < ar1.length; i++) 
		{
			System.out.println("ar1["+i+"] = "+ar1[i]);
		}
		
		sc.close();
	}

}
