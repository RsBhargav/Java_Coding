package com.proapti.pkg;

public class ArrayMissingJumbled {
		public static void Missing(int ar[]){
			for (int i = 0; i < ar.length-1; i++) {
				for (int j = ar[i]+1; j < ar[i+1]; j++) {
				System.out.println(j);
			}
		  }
		}
		public static void main(String[] args) {
			int [] ar = {12,17,19,25};
			Missing(ar);
		}
	}