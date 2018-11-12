package com.practice.java;

import java.util.Scanner;

public class Strings_Palindrome_1 {

	public static String isPal(String s1) {
		
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			if(ch[i] != ch[ch.length-1-i]) {
				return s1+" is not a palindrome";
			}
		}
		return s1+" is a palindrome";
	}
	
	public static void isPaln(String s) {
		int i,start  = 0, end    = s.length() - 1,middle = (start + end)/2;
	    for (i = start; i <= middle; i++) {
	      if (s.charAt(start) == s.charAt(end)) {
	    	  start++;
	    	  end--;
      }
      else {
        break;
      }
    }
    if (i == middle + 1) {
      System.out.println(s+" is a Palindrome");
    }
    else {
      System.out.println(s+" is not a palindrome");
    }  
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		//System.out.println(isPal(s));
		isPaln(s);
		sc.close();
	}

}
