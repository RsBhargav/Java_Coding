package com.proapti.pkg;

public class Ternary_Operator {
	// WAP that given number is divisible by 5 and display the message using ternary operator
		public static void main(String[] args) 
		{
			int x1 = 13;
		
			String str=(x1%5==0)?"Given number is divisible by 5":"Given number is not divisible by 5";
			System.out.println(str);
		}

	}
