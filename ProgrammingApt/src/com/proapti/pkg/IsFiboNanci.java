package com.proapti.pkg;

import java.util.Scanner;

public class IsFiboNanci {
	public static void Fibo(int c){
	int n1 = 0;
	int n2 = 1;
	while(c > 0)
	{
		int n3 = n1+n2;
		System.out.println(n1);
		n1 = n2;
		n2 = n3;
		c--;
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int c = sc.nextInt();
		Fibo(c);
		sc.close();
	}
}
