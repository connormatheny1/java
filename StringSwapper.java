/* Name: Connor Matheny
 * CSE174 Program 4 #2, StringSwapper
 * 09/23/2018
 * Viji
 * Description: Program takes three inputs: a string and two indexes (i and j) of the string 
 *              then switches the two characters at i and j and prints the new word and the 
 *              number of characters between the two switched letters
 * Test Cases: 
 * Test Case           Expected     Worked?
 * dog, 0, 2           god          Yes
 * television, 1, 5    tilevesion   Yes
 * university, 2, 4    unevirsity   Yes 
 * tomato, 2, 5        tooatm       Yes     
 */

import java.util.Scanner;

public class StringSwapper {
   
   public static void main(String[] args) {
      // declare variables
      String str, first, middle, last;
      int i, j;
      Scanner keyBoard = new Scanner(System.in);
      
      // get input
      System.out.print("Please enter a word: ");
      str = keyBoard.next();
      System.out.print("Please enter position i: ");
      i = keyBoard.nextInt();
      System.out.print("Please enter position j: ");
      j = keyBoard.nextInt();
      
      //split word
      first = str.substring(0, i);
      middle = str.substring(i+1, j);
      last = str.substring(j+1);
      
      //display 
      System.out.println(first + str.substring(j, j+1) + middle + str.substring(i,i+1) + last);
      System.out.print("Number of characters between two positions: " + ((j-1)-i));
      
      
      
   } //end main method
   
} //end public class