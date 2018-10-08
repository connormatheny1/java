/* Name: Connor Matheny
 * CSE174 Program 4 #3, PhoneParser
 * 09/23/2018
 * Viji
 * Description: Program receives a ten digit phone number as a string as an input and then
 *              parses the entry into a more readable format like (xxx) xxx-xxx.
 */

import java.util.Scanner;

public class PhoneParser {
   public static void main(String[] args){
    
      //variables
      String str, areaCode, nextThree, lastFour;
      Scanner keyBoard = new Scanner(System.in);
      
      //input
      System.out.print("Please input your 10 digit phone number: ");
      str = keyBoard.next();
      
      if(str.length() > 10){
         System.out.print("Too many digits, please re-enter a 10-digit phone number: ");
         str = keyBoard.next();
      }
      
      //format number
      areaCode = str.substring(0, 3);
      nextThree = str.substring(3, 6);
      lastFour = str.substring(6, 10);
      
      //print
      System.out.print("(" + areaCode + ")" + " " + nextThree + "-" + lastFour);
   }
   
}