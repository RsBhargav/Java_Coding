package com.proapti.pkg;

import java.util.Scanner;

public class ConvertDecimal2Any {
	public static String D2Any(int num , int ns){
	String s1 = "0123456789ABCDEF"; 
	String res = " ";
	while(num > 0){
	int rem = num%ns;
	res = s1.charAt(rem)+res;
	num = num/ns;
   	}
	return res;
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = sc.nextInt();
		System.out.println("Enter the Number Series = ");
		int ns = sc.nextInt();
		String res = D2Any(num,ns);
		System.out.println("the "+ns+" equivalent of "+num+" = "+res);
		sc.close();
	}
}
