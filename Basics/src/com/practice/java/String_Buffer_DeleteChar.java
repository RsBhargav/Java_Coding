package com.practice.java;

import java.util.Scanner;

public class String_Buffer_DeleteChar {

	public static StringBuffer remove(String s) {
	return new StringBuffer(s).deleteCharAt(0);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		System.out.print("The modified String is : "+remove(s));
		sc.close();
	}

}
