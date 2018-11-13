package com.proapti.pkg;

import java.util.Scanner;

public class ArrayMaxNumber {
	public static String maxNumber(int ar[]){
		int max = ar[0];
		int index = 0;
		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i]) 
			{
				max = ar[i];
				index = i;
			}
		}
		String s1 = "The maximum element is = "+max;
		String s2 = "The maximum element is present at = "+index;
		return s1+" "+s2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size : ");
		int size = sc.nextInt();
		int [] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter the value at "+i+" value");
			ar[i] = sc.nextInt();
		}
		String res = maxNumber(ar);
		System.out.println(res);
		sc.close();
	}

}
