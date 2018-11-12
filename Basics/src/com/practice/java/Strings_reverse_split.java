package com.practice.java;

import java.util.Scanner;

public class Strings_reverse_split {
	public static String reverse(String str) {
	 String s1[]=str.split(" ");  
	    String res="";  
	    for(String w:s1){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        res+=sb.toString()+" ";  
	    }  
	    return res.trim();  
	}  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println(reverse(s));
		sc.close();
	}

}
