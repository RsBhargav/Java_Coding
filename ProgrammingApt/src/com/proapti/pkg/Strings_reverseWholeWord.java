package com.proapti.pkg;

import java.util.Scanner;

public class Strings_reverseWholeWord 
{
		public static String reverse(String s1)
		{
			 String s2 = "";
			char ch[] = s1.toCharArray();
			for (int i = 0; i < ch.length; i++) 
			{
				String res = "";
				while (i < ch.length && ch[i] != ' ') 
				{
					res = res+ch[i];
					i++;
				}
				s2 =res+" "+s2;
			}
			return s2;
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