/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application;

/**
 * @author richard
 *
 */
public class Application {

 /**
  * @param args
  */
 public static void main(String[] args) {

  /**
   * if statement
   * 
   * The Java if statement tests the condition. It executes the if block if condition is true.
   * 
   */

  /**
   * defining an 'age' variable 
   */
  int age = 20;

  /**
   * checking the age
   */
  if (age > 18) {
   System.err.println("If statement: Age is greater than 18");
  }

  /**
   * if-else statement
   * 
   * The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.
   * 
   */
  /**
   * defining a variable
   */
  int number = 13;

  /**
   * Check if the number is divisible by 2 or not
   */
  if (number % 2 == 0) {
   System.err.println("If Else statement: even number");
  } else {
   System.err.println("If Else statement: odd number");
  }

  /**
   * Using Ternary Operator
   * 
   * We can also use ternary operator (? :) to perform the task of if...else statement.
   * It is a shorthand way to check the condition. 
   * If the condition is true, the result of ? is returned. 
   * But, if the condition is false, the result of : is returned.
   * 
   */
  /**
   * defining a variable
   */
  int number_2 = 13;

  /**
   * Using ternary operator
   */
  String output = (number_2 % 2 == 0) ? "Using Ternary Operator: even number" : "Using Ternary Operator: odd number";
  System.err.println(output);

  /**
   * Java if-else-if ladder Statement
   * 
   * The if-else-if ladder statement executes one condition from multiple statements.
   * 
   */

  /**
   * defining a variable
   */
  int marks = 65;

  /**
   * if-else-if ladder Statement
   */
  if (marks < 50) {
   System.err.println("if-else-if ladder Statement: fail");
  } else if (marks >= 50 && marks < 60) {
   System.err.println("if-else-if ladder Statement: D grade");
  } else if (marks >= 60 && marks < 70) {
   System.err.println("if-else-if ladder Statement: C grade");
  } else if (marks >= 70 && marks < 80) {
   System.err.println("if-else-if ladder Statement: B grade");
  } else if (marks >= 80 && marks < 90) {
   System.err.println("if-else-if ladder Statement: A grade");
  } else if (marks >= 90 && marks < 100) {
   System.err.println("if-else-if ladder Statement: A+ grade");
  } else {
   System.err.println("if-else-if ladder Statement: Invalid!");
  }

  /**
   * Java Nested if statement
   * 
   * The nested if statement represents the if block within another if block.
   * Here, the inner if block condition executes only when outer if block condition is true.
   * 
   */

  /**
   * Creating two variables for age and weight
   */
  int age_2 = 20;

  int weight = 80;

  /**
   * applying condition on age and weight
   */
  if (age_2 >= 18) {
   if (weight > 50) {
    System.err.println("Java Nested if statement: You are eligible to donate blood");
   }
  }

 }

}
