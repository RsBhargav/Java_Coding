package com.proapti.pkg;

import java.util.Scanner;

public class IsFactorialRecurrsion {
	public static int out = 1;
	public static int FactRec(int num){
		
		if (num > 1) {      
			//while(num > 1){
			out = out * num;
			num--;
			FactRec(num);   
			//FactRec(--num);
		}
		return out;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int out = FactRec(n);
		System.out.println("The Factorial of " + n + " is : "+out);
		sc.close();
	}

}
