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

  
  /**
   * @parameter someone is the person who is going to be greeted
   * @return is the greeting made
   *    
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
