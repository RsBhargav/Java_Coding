package com.proapti.pkg;

public class TriangleUpLeft {

	public static void main(String[] args) {
		int n = 5;
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; rows >= col; col++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}
