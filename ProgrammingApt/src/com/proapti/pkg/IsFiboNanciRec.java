package com.proapti.pkg;

import java.util.Scanner;

public class IsFiboNanciRec {
	public static void Fibo(int c , int n1 , int n2){
		if (c >= 0){
			int n3 = n1+n2;
			System.out.println(n1);
			Fibo(--c,n2,n3);}
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int c = sc.nextInt();
			Fibo(c,0,1);
			sc.close();}
}

