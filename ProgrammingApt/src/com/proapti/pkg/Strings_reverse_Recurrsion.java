package com.proapti.pkg;

import java.util.Scanner;

public class Strings_reverse_Recurrsion 
{
	static String res = " ";
	
	public static String reverse(String s1 , int len) 
	{	
		if(len >= 0)                                                
		{
			char ch = s1.charAt(len--);
			res = res + ch;
			reverse(s1,len);
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.next();
		String res = reverse(s1,s1.length()-1);
		System.out.println("The reverse of a given String is : "+res);
		sc.close();
	}

}
