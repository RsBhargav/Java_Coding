package com.proapti.pkg;

import java.util.Scanner;

public class IsArmStrongClass {
	public static int power(int num , int pwr){
		int res = 1;
        for (int i = 1; i <= pwr; i++) {
        	res = res * num;
		}
        return res;
	}
	public static int countOfDigits(int num) {
		int c = 0;
		while (num > 0){
			num = num/10;
			c++;
		}
	return c;
	}
	public static boolean ArmStrong(int num,int count) {
		int out = 0;
		int temp = num;
		while(num > 0) 
		{
			int rem=num % 10;
			out = out + power(rem,count);
			num=num/10;
		}
		return (out == temp);
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			int cn = countOfDigits(num);
			boolean res = ArmStrong(num , cn);
			System.out.println(res?"Armstrong Number":"Not Armstrong Number");
			sc.close();
		}
}

