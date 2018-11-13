package com.proapti.pkg;
import java.util.Scanner;

public class IslcmFor {
	public static int Lcm(int n1 , int n2){
		int i;
	for (i = n1; i < n1*n2; i++) {
		if (i % n1 == 0 && i % n2 == 0) {
			break;
		}
	}
	return i;
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1 = ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Number2 = ");
		int n2 = sc.nextInt();
		int res = Lcm(n1,n2);
		System.out.println("The Lcm of "+n1+" & "+n2+"= "+res);
		sc.close();
	}

}
