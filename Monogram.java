/* Name: Connor Matheny
 * CSE174 Program 4 #1, Monogram
 * 09/23/2018
 * Viji
 * Description: Program receives one input of a first, middle and last name, then returns 
 *              the monogram of the name consisting of the first letter of each of the names.
 * 
 * Pseudocode: 
 * We are given three strings: first, middle and last
 * Set firstInital to the first position of first 
 * Set middleInital to the first position of middle
 * Set lastInital to the first position of last
 * Concatenate firstInitial, middleInitial, and lastInitial
 * 
 * Test Case              Expected     Worked
 * Connor James Matheny   CJM          Yes
 * connor james matheny   CJM          Yes
 * Harold James Morgan    HJM          Yes
 * c s e                  CSE          Yes
 */

import java.util.Scanner;

public class Monogram {
   
   public static void main(String[] args) {
      // declare variables
      String first, middle, last, firstInitial, middleInitial, lastInitial;
      
      Scanner keyBoard = new Scanner(System.in);
      
      // get input
      System.out.print("Please enter a name: ");
      first = keyBoard.next();
      middle = keyBoard.next();
      last = keyBoard.next();
      
      //split word
      firstInitial = first.substring(0, 1);
      middleInitial = middle.substring(0, 1);
      lastInitial = last.substring(0, 1);
      
      //display 
      System.out.print(firstInitial.toUpperCase() + middleInitial.toUpperCase() + lastInitial.toUpperCase());
      
      
      
   }// end main method
   
}//end public class