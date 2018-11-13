package com.proapti.pkg;

import java.util.Scanner;

public class IsStrong {
	public static void main(String args[]){
		int num,out=0,rem,temp;
			System.out.println("enter the n value : ");
			Scanner sc = new Scanner(System.in);
			num=sc.nextInt();
			temp=num;
		while(num != 0) 
		{
			rem=num%10;
			int f=1;
			
			for(int i=1;i<=rem;i++){
				f=f*i;
		}
			out=out+f;
			num=num/10;

		}
		if(out==temp)
		System.out.println("the given number is the strong number");
		else
		System.out.println("the given number is not the strong number");
		sc.close();
	}

}
