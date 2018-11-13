package com.proapti.pkg;

import java.util.Scanner;

public class ConvertDecimal2Octal {
	public static String D2O(int num) {

	String remainder = " ";
	  while (num > 0)
	  { 
		  //extract the remainder
		 remainder =num%8+remainder;
		 //perform next operation on quotient
		 num = num/8;
	  }
	  return remainder;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number = ");
	int num = sc.nextInt();
	String res = D2O(num);
	System.out.println("the binary equivalent of "+num+" = "+res);
	sc.close();
	}
}
