package com.proapti.pkg;

import java.util.Scanner;

public class ArrayMissingAscending {
	public static void Missing(int ar[]){
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = ar[i]+1; j < ar[i+1]; j++) {
			System.out.println(j);
		}
	  }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		int [] ar = new int[size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i] = sc.nextInt();
		}
		Missing(ar);
		sc.close();
	}
}
