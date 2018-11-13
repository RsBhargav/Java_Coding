package com.proapti.pkg;

import java.util.Scanner;

public class Strings_DuplicatesDelete 
{
	public static void remove(String str)
	{
	char[] ch = str.toCharArray();
	int l = ch.length;
	System.out.println("String with duplicates : " + str);
for (int i = 0; i < l; i++) {
        for (int j = i + 1; j < l; j++) {
            if (ch[i] == ch[j]) {
                int temp = j;//set duplicate element index

                //delete the duplicate element by shifting the elements to left
                for (int k = temp; k < l - 1; k++) {
                	ch[k] = ch[k + 1];
                }
                j--;
                l--;//reduce char array length

            }
        }
    }
String str1 = new String(ch);
str = str1.substring(0, l);
System.out.println("String after duplicates removed : " + str);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		remove(str);
		sc.close();
}

	}