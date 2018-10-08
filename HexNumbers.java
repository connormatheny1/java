/* Connor Matheny
 * CSE 174, program 5
 * HexNumbers
 * 09/30/2018
 * Viji
 * Description: Program takes three hexadecimal numbers as input and returns the maximum,
 *              median, and minimum of the three and capitalizes the letters. 
 * Test Cases: (inputs)           Expected outcome(max, med, min)
 * 14c3 dbdb fcF3                 FCF3 DBDB 14C3
 * AAAa 34d3 45e2                 AAAA 45E2 34D3
 * 1234 3324 3de4                 3DE4 3324 1234
 * 111a 111b 111c                 111C 111B 111A
 * 11a1 12b1 13c1                 13C1 12B1 11A1
 * ABCD abcc abdc                 ABDC ABCD ABCC
 * Abcd ABcd ABCd                 "All three inputs are equal"
 */

import java.util.Scanner;

public class HexNumbers{
   public static void main(String[] args){
      Scanner numbers = new Scanner(System.in);
      String str, input1, input2, input3;
      int hex1, hex2, hex3, maximum, median, minimum, test;
      
      //get input
      System.out.print("Enter three 4-digit hexadecimal numbers: ");
      str = numbers.nextLine();
      
      //remove all whitespace and capitalize the letters
      str = str.replaceAll("\\s+","");
      str = str.toUpperCase();
      
      // separte the each inputted number
      input1 = str.substring(0, 4);
      input2 = str.substring(4, 8);
      input3 = str.substring(8);
      
      // parse each inputted hexadecimal string into a value
      hex1 = Integer.parseInt(input1, 16);
      hex2 = Integer.parseInt(input2, 16);
      hex3 = Integer.parseInt(input3, 16);
      
      //find min, med, max
      maximum = Math.max(hex1, Math.max(hex2, hex3));
      minimum = Math.min(hex1, Math.min(hex2, hex3));
      median = (hex1 + hex2 + hex3) - maximum - minimum;
      
      // output
      if(maximum == minimum && minimum == median){
         System.out.print("All three inputs are equal");
      }
      else{
         //print
         System.out.println("Maximum: " + Integer.toHexString(maximum).toUpperCase());
         System.out.println("Median: " + Integer.toHexString(median).toUpperCase());
         System.out.println("Minimum: " + Integer.toHexString(minimum).toUpperCase());  
      }
   } //end main method
} //end public class