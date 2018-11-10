package com.example;
import java.util.*; 
import java.lang.Math;

/**
 * This is a class. Adding some delays to have something to look at (even if it's just sleeps).
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  public String greet(String someone) {
    return greet(someone, 0);
  }

  //TODO: Add javadoc comment
  public String greet(String someone, int iterations) {
      ArrayList<Thread> threads = new ArrayList<Thread>();
      for (int i=0;i<4;i++){
          task t = new task(iterations);
          threads.add(t);
          t.start();
      }
      try{
         for(Thread t : threads){
           t.join();
         }
      }
      catch (Exception e){}
      return String.format("Hello, %s!", someone);
  }

  class task extends Thread {
    int iterations=0;
    task(int iter){
        iterations = iter;
    }
    
    public void run(){
      long threadId = Thread.currentThread().getId();
      for (int i=0;i<iterations;i++){
        int sleepMS = i*i;
        System.out.println(threadId + ": Iteration " + i + ". replacing text " + sleepMS + " times.");
        try{
            for (int ii=0;ii<sleepMS;ii++){
                if (threadId%2==0){
                  String s = "this XXX a test".replaceAll("XXX", " is ");
                }
                else{
                  primeFactors(sleepMS);
                }  
            }
        }
        catch(Exception e){}
      }
    }
  }
  // A function to print all prime factors of a given number n 
  void primeFactors(int n) 
  { 
      // Print the number of 2s that divide n 
      while (n%2 == 0) 
      { 
          //printf("%d ", 2); 
          n = n/2; 
      } 
  
      // n must be odd at this point.  So we can skip  
      // one element (Note i = i +2) 
      for (int i = 3; i <= java.lang.Math.sqrt(n); i = i+2) 
      { 
          // While i divides n, print i and divide n 
          while (n%i == 0) 
          { 
              //printf("%d ", i); 
              n = n/i; 
          } 
      } 
  
      // This condition is to handle the case when n  
      // is a prime number greater than 2 
      //if (n > 2)   
          //printf ("%d ", n); 
  }    
}
