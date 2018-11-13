package com.proapti.pkg;

import java.util.Scanner;

public class IsPowerOfNumber {
	public static int power(int num , int pwr){
		int res = 1;
        for (int i = 1; i <= pwr; i++) {
        	res = res * num;
		}
        return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = sc.nextInt();
		System.out.println("enter the power = ");
		int pwr = sc.nextInt();
		
		int result = power(num,pwr);
		System.out.println("the "+num+" power of "+pwr+" = "+result);
		sc.close();
	}
}
