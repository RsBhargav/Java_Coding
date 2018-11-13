
package com.proapti.pkg;

public class Removedup 
{
	public static String remove(String str)
	{
		char[] ch=str.toCharArray();
		String res="";
	
		for(int i=0;i<=ch.length-1;i++)
		{
			boolean b=false;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					b=true;
					break;
				}
			}
			if(b==false)
			{
				res=res+ch[i];
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
	System.out.println(remove("fydrhjydtgg"));

	}

}
