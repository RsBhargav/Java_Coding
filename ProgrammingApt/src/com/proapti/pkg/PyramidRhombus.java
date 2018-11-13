package com.proapti.pkg;

public class PyramidRhombus {

	public static void main(String[] args) {
		int n = 5;
		for (int rows = 0; rows < n-2; rows++) {
			for (int col = 0;  col < n; col++) {
				if (2*rows + col >= n-1) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		for (int rows = 1; rows < n; rows++) {
			for (int col = 0; col < n; col++) {
				if (2*rows <= col) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
