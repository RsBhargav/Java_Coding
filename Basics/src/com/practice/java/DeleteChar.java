package com.practice.java;

import java.util.Scanner;

class Rc_Logic {
	public static void remove(String a,String s1, char s) {
		
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)!=s)
				a=a+s1.charAt(i);
		}
		System.out.print("The modified string : "+a);
		
		
	}
}
public class DeleteChar
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.print("Enter the character not to be shown in the given string : ");
		char s=sc.next().charAt(0);
		Rc_Logic.remove("",s1,s);
		sc.close();
	}

}