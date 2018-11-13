package com.proapti.pkg;

import java.util.Scanner;

public class Strings_reverse_Rec_both {
	public static String reverse(String s1) 
	{
	char[] ch = s1.toCharArray();
	String res = " ";
	for (int i = ch.length-1; i >= 0; i--) 
	{
		res = res+ch[i];
	}
	return res;
	}
    static String res = " ";
	
	public static String reverse(String s1 , int len)    //Recursion
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
		System.out.println("The reverse of a given String  :"+reverse(s1));
		System.out.println("The reverse of a given String Under recursion : "+reverse(s1,s1.length()-1));
		sc.close();
	}

}