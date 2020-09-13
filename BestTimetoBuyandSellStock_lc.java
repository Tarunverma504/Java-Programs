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
import java.util.*;

/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.


*/
public class BestTimetoBuyandSellStock_lc {
    public static int maxProfit(int[] prices) {
        int profit=0;
        if(prices.length<1){
            return 0;
        }
        else
        {
            int min=prices[0];
            for(int i=1;i<prices.length;i++)
            {
                if(prices[i]<min)
                {
                    min=prices[i];
                }
                if(prices[i]-min>profit)
                {
                    profit=prices[i]-min;
                }
            }
        
        }
        return profit;
        
    }
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Range:-");
        int n=scan.nextInt();
        System.out.print("Enter Elements:-");
        int[] prices=new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i]=scan.nextInt();
        }
        System.out.println("Profit:-"+maxProfit(prices));
    }
    
}
