package com.practice.java;

import java.util.Scanner;

public class Array_2DMultiplication {

	public static void main(String[] args) {
		
		int row, col, sum = 0, i, j, k;
		
		Scanner sc = new Scanner(System.in);
  	  System.out.println("----------------------------------------");
		System.out.print("Enter the number of rows    : ");
		row = sc.nextInt();
		System.out.print("Enter the number of columns : "); 
		col = sc.nextInt();
		 
		int first[][] = new int[row][col];
		System.out.println("----------------------------------------");
		System.out.println("Enter elements of first matrix");
		 
		for (i = 0; i < row; i++)
			for (j = 0; j < col; j++) {
				System.out.print("Enter a["+i+"]["+j+"] = ");
		            first[i][j] = sc.nextInt();}
		System.out.println("----------------------------------------");
		System.out.print("Enter the number of rows    : ");
		row = sc.nextInt();
		System.out.print("Enter the number of columns : "); 
		col = sc.nextInt();
		      
		      	if (col != row)
		      		
		      		System.out.println("The matrices can't be multiplied with each other.");
		      else
		      {
		    	  int second[][] = new int[row][col];
		    	  int multiply[][] = new int[row][col];
		    	  System.out.println("----------------------------------------");
		    	  System.out.println("Enter elements of second matrix");
		 
		    	  for (i = 0; i < row; i++)
		    		  for (j = 0; j < col; j++) {
		    			  System.out.print("Enter b["+i+"]["+j+"] = ");
		    			  second[i][j] = sc.nextInt();}
		    	  
		    	  
		    	  for (i = 0; i < row; i++)
		    	  {
		    		  for (j = 0; j < col; j++)
		    		  { 	 
		    			  for (k = 0; k < row; k++)
		    			  {
		    				  sum = sum + first[i][k]*second[k][j];
		    			  }
		 
		    			  multiply[i][j] = sum;
		    			  sum = 0;
		    		  }
		    	  }
		    	  System.out.println("----------------------------------------");
		    	  System.out.println("Product of the matrices:");
		 
		    	  for (i = 0; i < row; i++)
		    	  {
		    		  for (j = 0; j < col; j++)
		    			  System.out.print(multiply[i][j]+"\t");
		    		  
		    		  System.out.print("\n");
		    	  }	
		    	  System.out.println("----------------------------------------");
	 	}
		      	sc.close();
  	}
}