package com.proapti.pkg;

import java.util.Scanner;

public class ConvertBinary2Decimal
{
	public static int power(int num ,int pwr)
	{
		int res = 1;
        for (int i = 1; i <= pwr; i++) 
        {
        	res = res * num;
		}
        return res;
	}
	public static int B2D(int num)
	{
		int count = 0;
		int output = 0;
		while (num > 0)
		{
			int rem = num % 10;
			output = output+rem*power(2,count++);
			num = num / 10;
		}
		return output;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number = ");
		int num = sc.nextInt();
		int res = B2D(num);
		System.out.println("the decimal equivalent of "+num+" = "+res);
		sc.close();
	}

}
