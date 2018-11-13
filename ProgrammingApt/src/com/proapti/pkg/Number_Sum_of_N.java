package com.proapti.pkg;
import java.util.Scanner;

/* 
  Write a program to print the sum of all the elements of an 
 array of size N
where N can be any integer between 1 and 100. 
1≤N≤100
 */
public class Number_Sum_of_N
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Declare the size of array");
		int N = sc.nextInt(); 
		int arr [] = new int [N];
		System.out.println("Enter "+N+" vlaues of array");
		for (int i = 0; i < arr.length; i++) 
		{
			arr [i] = sc.nextInt();
		}
		int sum = 0;
		for (int j = 0; j < arr.length; j++)
		{
			sum = sum + arr[j];
			System.out.println("arr["+j+"] = "+sum);
		}
		System.out.println("sum = "+sum);
		sc.close();
	}
}
