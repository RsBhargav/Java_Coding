package com.proapti.pkg;

import java.util.Scanner;

public class Strings_firstUpperCase
{
	public static void upper(String s1) 
	{
		char[] ch = s1.toCharArray();
		
		// all ways make first char a cap
		ch[0] = Character.toUpperCase(ch[0]);
		
		// then capitalize if space on left.
		for(int i = 1; i < ch.length; i++) 
		{
			if(ch[i-1] == ' '){
				ch[i] = Character.toUpperCase(ch[i]);
			} 
		}
		
		String s2 = new String(ch);
		System.out.println(s2);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String s1 = sc.nextLine();
		upper(s1);
		sc.close();
	}
}
