package com.proapti.pkg;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String args[]){
		int a , reminder , reverse=0 , n ;
		System.out.print("enter the a value: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		n = a;
		while(a != 0)
		{
			reminder = a%10;
			reverse = reverse*10+reminder;
			a = a/10;
		}
		if(n==reverse)
			System.out.println("the given number is a palindrome");
		else
			System.out.println("the given number is not a palindrome");
		sc.close();
	}
}
