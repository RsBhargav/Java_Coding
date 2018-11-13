package com.proapti.pkg;

import java.util.Scanner;

public class ConvertDecimal2Binary {
	public static String D2B(int num){
		//*The given input divide by 2 
		//*extract the remainder
		//*divide quotient by 2
		//*again extract the remainder
		//*perform 3and 4 upto quotient is lessthan factor
			String remainder = " ";
		  while (num > 0)
		  { //extract the remainder
			 remainder =num%2+remainder;
			 num = num/2;
		  }
		  return remainder;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = sc.nextInt();
		String res = D2B(num);
		System.out.println("the binary equivalent of "+num+" = "+res);
		sc.close();
	}

}
