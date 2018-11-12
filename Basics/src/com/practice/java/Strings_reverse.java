package com.practice.java;
import java.util.Scanner;

public class Strings_reverse 
{
	public static String reverse(String s1) 
	{
	char[] ch = s1.toCharArray();
	String res = "";
	for (int i = ch.length-1; i >= 0; i--) 
	{
		res = res+ch[i];
	}
	System.out.println(res);
	return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		reverse(s1);
		sc.close();
	}

}