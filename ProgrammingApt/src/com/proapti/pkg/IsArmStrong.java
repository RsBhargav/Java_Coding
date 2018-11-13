package com.proapti.pkg;

import java.util.Scanner;

public class IsArmStrong {

	public static void main(String args[]){
		int num,out = 0,rem,temp;
			System.out.println("enter the n value : ");
			Scanner sc = new Scanner(System.in); 
			num=sc.nextInt();
			temp=num;
		while(num != 0) 
		{
			rem=num%10;
			out=out+(rem*rem*rem);
			num=num/10;
			}
		
		if(out==temp)
		System.out.println("the given number is the Armstrong number");
		else
		System.out.println("the given number is not the Armstrong number");
		sc.close();
	}

}

/* An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
	eg:- 371
		3^3 + 7^3 + 1^3 = 27 + 343 + 1	=	371 */