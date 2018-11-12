package com.practice.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Time {
	
	public static void date() {
		System.out.println(new Date());
	}
	
	public static void calendar() {
		System.out.println(new SimpleDateFormat("EEEEEE").format(Calendar.getInstance().getTime()));
	}
	
	public static void convert() {
	 try {
         String now = new SimpleDateFormat("hh:mm aa").format(new java.util.Date().getTime());
         System.out.println("Time in 12 hour format : " + now);
         SimpleDateFormat in = new SimpleDateFormat("hh:mm aa");
         SimpleDateFormat out = new SimpleDateFormat("HH:mm");
         String time24 = out.format(in.parse(now));
         System.out.println("Time in 24 hour format : " + time24);
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
}
	
	public static void main(String[] args) {
		    date();
		    System.out.println("------------------------------");
		    calendar();
		    System.out.println("------------------------------");
		    convert();
		}

	}

