package com.proapti.pkg;

public class NumberStar {

	public static void main(String[] args) {
		int n = 6;
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((count--)+" ");
				if (i>j) {
					System.out.print("* ");
				}
		}
		System.out.println();
		count = count+3+(2*i); 
		//count = count+n/2+(2*i);
	 }
   }
}
