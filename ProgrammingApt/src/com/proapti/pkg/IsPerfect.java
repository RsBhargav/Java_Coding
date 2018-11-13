package com.proapti.pkg;

import java.util.Scanner;

public class IsPerfect {
	public static boolean Perfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}return sum == num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean res = Perfect(num);
       System.out.println(res?"Perfect Number":"Not a Perfect Number");
       sc.close();
	}

}
