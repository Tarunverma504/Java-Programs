/*An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5 */

import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      int[] arr = new int[10];
      
      
      Scanner scn = new Scanner(System.in);
      for(int i=0;i<10;i++)
      arr[i] = scn.nextInt();
      
      int j =0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]<0){
              if(i!=j)
          {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
          j++;
          }
    
      }
      
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
     
    }
}
