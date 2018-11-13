package com.proapti.pkg;

import java.util.Scanner;

public class IslcmWhile {

		public static int Lcm(int n1 , int n2){
			int max = n1 > n2?n1:n2;
			int c = max;
		while(true){
			if (max%n1 == 0 && max%n2 == 0) 
				return max;
			max = max+c;
		}
		
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
