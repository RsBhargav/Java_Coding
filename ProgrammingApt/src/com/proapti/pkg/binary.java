package com.proapti.pkg;

public class binary
{
   public static void main(String args[])
   {         int[] a = {3, 7, 10, 15, 91, 110, 150};
         int target = 1; // the element to be searched
         int left = 0;
         int middle;
         int right = a.length - 1;
         while (left <= right)
        {
              middle = (left + right) / 2;
              if (a[middle] == target)
            {
                 System.out.println("Element found at index " + middle);
                 break;
             }
              
             else if (a[middle] < target)
            {
                 left = middle + 1;
             }
             else if (a[middle] > target)
            {
                right = middle - 1;
             }
             
        }
        
  }
} 