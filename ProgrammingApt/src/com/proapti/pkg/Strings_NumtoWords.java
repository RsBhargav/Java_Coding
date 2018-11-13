package com.proapti.pkg;

import java.util.Scanner;

public class Strings_NumtoWords 
{
	static String [] s1 = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	
	static String [] s2 = {"","one","two","three","four","five","six","seven","eight","nine","ten",
							"eleven","twleve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
	
	public static void concat(int num ,  String str)
	{
		
		if(num > 19)	
			System.out.print(s1[num/10]+" "+s2[num%10]);
		else
			System.out.print(s2[num]);
		if(num>0)
		System.out.print(str);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int n = sc.nextInt();
		concat(n/10000000 , " crore ");
		concat((n/100000)%100 , " lakh ");
		concat((n/1000)%100 , " thousand ");
		concat((n/100)%10 , " hundred ");
		concat((n)%100 , " ");
		sc.close();
	}

}
