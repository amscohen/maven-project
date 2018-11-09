package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  public String greet(String someone) throws Exception {
    return greet(someone, 0);
  }

  //TODO: Add javadoc comment
  public String greet(String someone, int iterations) throws Exception {
    for (int i=0;i<iterations;i++){
        int sleepMS = i*i;
        System.out.println("Iteration " + i + ". Sleeping for " + sleepMS + " MS.");
        Thread.sleep(sleepMS);
    }
    return String.format("Hello, %s!", someone);
  }
}
