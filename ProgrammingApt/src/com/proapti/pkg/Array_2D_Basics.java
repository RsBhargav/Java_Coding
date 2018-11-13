package com.proapti.pkg;

public class Array_2D_Basics 
{
	public static void main(String[] args)
	{
		int [][]ar = new int[3][2];   /* Array in an array ... it shouldn't called as rows and columns*/
		ar[0][1] = 100;
		ar[1][1] = 45;
		/* ar[2][2] = 40;  // arrayIndexoutof exception because the index used is not present... */
		System.out.println("ar[0][1] = "+ar[0][1]);
		System.out.println("ar[1][1] = "+ar[1][1]);
		System.out.println("rows = "+ar.length); /* length variable here it returns outer Array length (i.e;row)  */
		System.out.println("0 th row = "+ar[0].length); /* to get how many columns present in a row it should be done like this (i.e;ar[index].length) */
		System.out.println("1 th row = "+ar[1].length);
		System.out.println("2 th row = "+ar[2].length);
	}
}
