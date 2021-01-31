/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Mind_Coder
 */

/*

Q1. Gondola Drive in Reeky Creeks
Reeky Creeks Fun world is an entertainment complex. The owner of Reeky Creeks wants to implement a gondola lift
system that would connect some of its theme parks and hotels. Gondola lift is a seating compartment in a ski lift like
cable cars. The maximum permissible mass of each Gondola with occupants is 1000 kg.
Implement a software system to check the total weight in Gondola and throw an exception in case the total weight is
greater than permissible limit.
Weight of Gondola without occupants is 300 kg.
Implement the following methods:
HashMap<Integer,Double> ticketForGondola()

which will store ticket number(of Integer type) & weight (of Double type) of each occupant in a HashMap and return
accordingly.
void weightCheck(HashMap<Integer,Double> h)
which will check the total weight in Gondola and throw an exception according to the constraint given.
Input Format
First line of input shows number of occupants 'n'
next two line shows the ticket number and weight of rst occupant respectively.
next two line shows the ticket number and weight of second occupant respectively.
.
.
.
so on for n occupants
Output Format
If weight is with in permissible limit then display "Get ready for drive" else throw an exception with message "Gondola overloaded".
Sample Input Sample Output
Get ready for drive
Sample Input Sample Output
Caught the exception
Gondola overloaded
Time Limit: - ms Memory Limit: - kb Code Size: - kb


*/
class OverloadedException extends Exception
    {
     public OverloadedException(String s)
     {
         super(s);
     }
    }

class  Gondola
{
    void weightCheck(HashMap<Integer,Double> h) throws OverloadedException
    {
        Double weight=new Double(0);
        for(Double d:h.values())
        {
            weight=weight+d;
            if(weight<=700)
            {
                System.out.println("Get ready for drive");
            }
            else
            {
                throw new OverloadedException("Gondola Overloaded");
            }
        }
    }
    HashMap<Integer,Double> ticketForGondola()
    {
        HashMap <Integer, Double> hp= new HashMap<Integer,Double>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            Integer k=scan.nextInt();
            Double d=scan.nextDouble();
            hp.put(k,d);
        }
        return hp;
    }
    
}
public class GondolaDriveInReekyCreeks {
    

    public static void main(String[] arg)
    {
        HashMap <Integer, Double> hp= new HashMap<Integer,Double>();
        Gondola obj=new Gondola();
        hp=obj.ticketForGondola();
        try
        {
            obj.weightCheck(hp);
        }
        catch (OverloadedException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

    }
    
}
