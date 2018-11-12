package com.practice.java;

import java.util.Scanner;

public class Strings_CharCount_Occurence {
	public static void countLogic(String st) {
		char ch[]=st.toCharArray();
		int len = ch.length;
        for (int i=0;i<len ;i++ )
        {
            int count=1;
            for (int j=i+1;j<len ;j++ )
            {
                if (ch[i]==ch[j])
                {
                    count=count+1;
                    for (int k=j;k<len-1 ;k++ )
                    {
                        ch[k]=ch[k+1];
                    }
                    j--;
                    len--;
                }
            }
            System.out.println(ch[i]+"  :  "+count);
        }
	}
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the string : ");
	        String st=sc.nextLine().toLowerCase();
	        countLogic(st);
	        sc.close();}
	}
	
	
	
	/*
	    public static void characterCount(String str)
	    {
	    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	    	
	    	char[] ch = str.toCharArray();
	    	
	    	for (char c : ch)
	        {
	            if(hm.containsKey(c))
	            	hm.put(c, hm.get(c)+1);
	            else
	                 hm.put(c, 1);
	        }
	 
	        	System.out.println(hm);
	    }
	 
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter the String : ");
	    	String str = sc.nextLine();
	        characterCount(str);
	        sc.close();
	    }
	
}
*/

	
	/*public static void countLogic(String s) {
		
				
			
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		System.out.println(countLogic(s));
		
		String s = "SaiBHargav";
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == 'a' ) {
		        counter++;
		    } 
		}	
		sc.close();
	}
}
*/