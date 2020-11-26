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
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable
{
     private int workerNumber;
      WorkerThread(int workerNumber) 
   {
      this.workerNumber = workerNumber;
   }
      @Override
      public void run()
      {
          for(int i=1;i<=5;i++)
          {
              System.out.printf("Worker %d: %d\n", workerNumber, i);
              try 
         {
            Thread.sleep((int)(Math.random() * 50));   // sleep for 0 to 0.05 second
         } 
              catch (InterruptedException e) {}
          }
      }
}
public class ThreadPool_Executor {
    public static void main(String [] arg)
    {
        
        int numWorkers = 5;			// Number of workers
        int threadPoolSize = 2;		// Thread pool size
        ExecutorService pool = Executors.newFixedThreadPool(threadPoolSize);
    WorkerThread[] workers = new WorkerThread[numWorkers];
         for (int i = 0; i < numWorkers; ++i) 
            {
              workers[i] = new WorkerThread(i+1);
              pool.execute(workers[i]);
            }
         pool.shutdown();
  }
    }
    

