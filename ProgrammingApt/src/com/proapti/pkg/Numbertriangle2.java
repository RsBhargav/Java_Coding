package com.proapti.pkg;

public class Numbertriangle2 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			int count = i+1;
			for (int j = 0; j <= i; j++) {
				System.out.print(count+" ");
				count = n-1-j+count;
		}
		System.out.println();
		 
		
	 }
   }
}
