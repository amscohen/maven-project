package com.example;

/**
 * This is a class. Adding some delays to have something to look at.
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
    for (int i=0;i<iterations;i++){
        int sleepMS = i*i;
        System.out.println("Iteration " + i + ". Sleeping for " + sleepMS + " MS.");
        try{
            Thread.sleep(sleepMS);
        } 
    }
    return String.format("Hello, %s!", someone);
  }
}
