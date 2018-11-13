package com.proapti.pkg;

import java.util.Scanner;

public class IsFactorial {
	public static int Fact(int n){
		int out = 1;
	for (int i = n; i > 0; i--) {
		out = out * i;
	} 
		return out;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int out = Fact(n);
		System.out.println("The Factorial of " + n + " is : "+out);
		sc.close();
	}

}
