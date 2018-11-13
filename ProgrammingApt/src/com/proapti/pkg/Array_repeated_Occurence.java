package com.proapti.pkg;

import java.util.Scanner;
/*I have an integer array crr_array and I want to count elements,
 *  which occur repeatedly. First, I read the size of the array and initialize it with numbers read from the console. 
 *  In the array new_array, I store the elements that are repeated. The array times stores the number of consecutive occurrences of an element. 
 *  Then, I try to search for the repeating sequences and print them in a specific format. However, it does not work.*/
public class Array_repeated_Occurence 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = input.nextInt();

		int[] crr_array = new int[size];
		int[] new_array= new int[size];
		int[] times = new int[size];

		// Read integers from the console
		System.out.println("Enter array elements: ");
		for (int i = 0; i < crr_array.length; i++) 
		{
		    crr_array[i] = input.nextInt();
		    times[i] = 1;
		}

		// Search for repeated elements
		for (int j = 0; j < crr_array.length; j++)
		{
		    for (int i = j; i < crr_array.length; i++) 
		    {
		        if (crr_array[j] == crr_array[i] && j != i) 
		        {
		            new_array[i] = crr_array[i];
		            times[i]++;
		        }
		    }
		}

		//Printing output
		for (int i = 0; i <  new_array.length; i++) 
		{
		    System.out.println("\t" + crr_array[i] + "\t" +  new_array[i] + "\t" + times[i]);
		}
		input.close();
	}

}
