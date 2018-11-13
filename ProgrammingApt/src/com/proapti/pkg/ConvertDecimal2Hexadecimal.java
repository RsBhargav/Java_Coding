package com.proapti.pkg;

import java.util.Scanner;

public class ConvertDecimal2Hexadecimal {
	public static String D2O(int num) {
		//*extract the remainder %16
		//*store the variable in one variable
		//*repeat 1,2  with quotient as number
		//*repeat the process until num = 0
		String res = " ";
		  while (num > 0)
		  { 
			 //extract the remainder
			 int remainder =num%16;
			 //Switch case is written for the numbers >=10 because in hexa 10-15 --> A-F; 
			 switch (remainder) {
			case 10:res = 'A'+res;
					break;
			case 11:res = 'B'+res;
					break;
			case 12:res = 'C'+res;
					break;
			case 13:res = 'D'+res;
					break;
			case 14:res = 'E'+res;
					break;
			case 15:res = 'F'+res;
					break;
			// default case is for other than A-F(10-15)...
			default:res = remainder + res; 
					break;
			}
			 //perform next operation on quotient
			 num = num/16;
		  }
		  return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num = sc.nextInt();
		String res = D2O(num);
		System.out.println("the hexa equivalent of "+num+" = "+res);
		sc.close();
		}
}
