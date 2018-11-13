package com.proapti.pkg;

import java.util.Random;
import java.util.Scanner;

public class IsRandomNum 
{
	
	static int RandomNumber(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public static void main(String[] args)
	{
		 /*for(int i =0; i<100; i++){
		      int randomInt = (int)(10.0 * Math.random());
		      System.out.println("random int between 1 and 100 : " + randomInt );
		}*/
		/*int[] a1= new int[100];
				for (int i = 0; i < 100; i++) 
				{
					int randomInt = (int)(10.0 * Math.random());
				      System.out.println("random int between 1 and 100 : " + randomInt );
				      a1[i]=i++;
				}*/
		/* Random random = new Random();
	      
		 for(int i = 0; i < 100; i++){
		      int randomInteger = random.nextInt();
		      System.out.println("Random Integer in Java: " + randomInteger);
		 }*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the minimum number: ");
		int min = sc.nextInt();
		System.out.println("Enter the maximum number: ");
		int max = sc.nextInt();
		
				for (int i = 0; i < num; i++) 
				{
					System.out.println(i+" = "+RandomNumber(min, max));
				}
sc.close();
			}

}