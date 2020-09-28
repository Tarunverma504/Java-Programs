/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author TARUN VERMA
 */
public class QuickSort {
    public static void main(String []arg)
    {
        int[] arr={15,9,7,13,12,16,4,18,11};
        int leng=arr.length;
        QuickSort qsm=new QuickSort();
        qsm.QuickSortRecursion(arr,0,leng-1);
        qsm.PrintArray(arr);
    }
    int Partition (int[] arr,int low,int high)
    {
      int pivot=arr[(low+high)/2];
      while(low<=high)
      {
          while(arr[low]<pivot)
          {
              low++;
          }
          while(arr[high]>pivot)
          {
              high--;
          }
          if(low<=high)
          {
              int temp=arr[low];
              arr[low]=arr[high];
              arr[high]=temp;
              low++;
              high--;
          }
      }
      return low;
    }
    void QuickSortRecursion(int[] arr,int low,int high)
    {
        int pi = Partition(arr,low,high);
        if(low< pi-1)
        {
            QuickSortRecursion(arr,low,pi-1);
        }
        if(pi<high)
        {
            QuickSortRecursion(arr,pi,high);
        }
    }
    void PrintArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
    }
    
}
