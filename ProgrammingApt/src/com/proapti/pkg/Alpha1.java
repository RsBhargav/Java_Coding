package com.proapti.pkg;

import java.util.Scanner;

public class Alpha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
				int n = sc.nextInt();
		for (int r = 0; r < n; r++)
		{	
		for (int c = 0; c < n; c++)
			{
			if ( r== 0 
					|| r + c == n-1 
					|| r == n-1){
				System.out.print("* ");}
				else{
				System.out.print("  ");}
			}			
			System.out.println();
		}
		sc.close();
	}

}
