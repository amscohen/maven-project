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

  public String greet(String someone) {
    return greet(someone, 0);
  }

  //TODO: Add javadoc comment
  public String greet(String someone, int iterations) {
    for (inti=0;i<iterations;i++){
        int sleepMS = i*i;
        System.out.println("Iteration " + i + ". Sleeping for " + sleepMS + " MS.");
    }
    return String.format("Hello, %s!", someone);
  }
}
