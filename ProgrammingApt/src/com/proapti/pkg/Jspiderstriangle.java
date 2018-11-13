package com.proapti.pkg;

import java.util.Scanner;

public class Jspiderstriangle {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String ");
		 String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; i >= j; j++) {
			System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
