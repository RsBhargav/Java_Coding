package com.practice.java;

import java.util.Scanner;

public class Array_CountOccurence 
{
 public static void CountOccurence(int[] ar) 
 {
 int size = ar.length;
 for (int i = 0; i < size; i++)
 {
 int count = 1;
 for (int j = i+1; j < size; j++) 
 {
 if (ar[i] == ar[j])
 {
 count++;
 int temp = j;
 while (temp < size-1) 
 {
 ar[temp] = ar[temp+1];
 temp++;
 }
 j--;
 size--;
 }
 }
 System.out.println("the "+ar[i]+" Occurred "+count+" "+"times");
 }
 }
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the size : ");
 int size = sc.nextInt();
 int [] ar = new int[size];
 for (int i = 0; i < ar.length; i++) 
 {
 System.out.println("Enter the value at "+i+" value");
 ar[i] = sc.nextInt();
 } 
 System.out.println("Array elements Before Deleting : ");
 for (int i = 0; i < ar.length; i++) 
 {
 System.out.println("ar["+i+"]="+ar[i]);
 } 
 CountOccurence(ar); 
 sc.close();
 }
}