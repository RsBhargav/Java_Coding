package com.practice.java;

import java.util.Scanner;

public class Ascii_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		Logic.asChar(s);
		System.out.println("--------------------------------");
		System.out.println("Enter the Ascii number : ");
		int i = sc.nextInt();
		Logic.asAscii(i);
		
		sc.close();
	}
}
	
class Logic {
	public static void asChar(String s) {	
		char[] ch = s.toCharArray();	
		for (int i = 0; i <= ch.length-1; i++) {
		int num = (int)ch[i];
		System.out.println(ch[i]+" = "+num);
		}
	}

	public static void asAscii(int i) {
		System.out.println("--------------------------------");	
		System.out.println("The Ascii Value of '"+i+"' ---> "+Character.toString((char)i));
		System.out.println("--------------------------------");
	}
}	
