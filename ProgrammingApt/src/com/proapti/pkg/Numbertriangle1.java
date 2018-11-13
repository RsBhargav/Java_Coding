package com.proapti.pkg;

public class Numbertriangle1 {

	public static void main(String[] args) {
		int n = 6;
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((count--)+" ");		
		}
		System.out.println();
		count = count+3+(2*i); 
		//count = count+n/2+(2*i);
	 }
   }
}
