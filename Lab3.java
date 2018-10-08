/*Name: Connor Matheny
 * CSE 174
 * Lab 3
 * Ramasamy
 * 09/13/2018
 * Description: Program will prompt user to enter first and last name,
 *              and three test scores. Program then prints the first name,
 *              last inital, and the average score, minimum and maximum score,
 *              and the median score.
 */

import java.util.Scanner;

public class Lab3 {
   
   public static void main(String[] args){
      //Variables
      String first, last;
      char initial;
      double test1, test2, test3, average, minimum, maximum, median, total;
      Scanner keyBoard = new Scanner (System.in);
      
      //Gather input
      System.out.print("Please enter your first name, last name, and three test scores.");
      first = keyBoard.next();
      last = keyBoard.next();
      test1 = keyBoard.nextDouble();
      test2 = keyBoard.nextDouble();
      test3 = keyBoard.nextDouble();
      initial = last.charAt(0);
      
      //Computations
      average = ((test1 + test2 + test3) / 3);
      minimum = Math.min(Math.min(test1, test2), test3);
      maximum = Math.max(Math.max(test1, test2), test3);
      total = test1 + test2 + test3;
      median = total - maximum - minimum;
      
      //Print outputs
      System.out.println("Name: " + first.toUpperCase() + " " + Character.toUpperCase(initial) + ".");
      System.out.printf("Average is %.2f.%n", average);
      System.out.printf("Minimum score is %.2f.%n", minimum);
      System.out.printf("Maximum score is %.2f.%n", maximum);
      System.out.printf("Median score is %.2f.%n", median);
   } //End main method
} //End public class