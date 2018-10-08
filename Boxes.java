/* Connor Matheny
 * CSE 174
 * Program 5, #1
 * Boxes
 * 10/01/2018
 * Viji
 * Description: Program displays three 5x5 boxes of characters selected by the user
 */

import java.util.Scanner;

public class Boxes{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      char a, b, c;
      String box1, box2, box3, str, output;
      
      System.out.print("Enter the characters to be displayed in the boxes: ");
      str = in.nextLine();
      
      str = str.replaceAll("\\s+","");
      a = str.charAt(0);
      b = str.charAt(1);
      c = str.charAt(2);
      output = "";
      
      System.out.print(printBoxes(a));
      System.out.print(printBoxes(b));
      System.out.print(printBoxes(c));   
   } //end main method
   
   public static String printBoxes(char a){
      String output = (a + " " + a + " " + a + " " + a + " " + a + "\n"
                          + a + "       " + a + "\n"
                          + a + "       " + a + "\n"
                          + a + "       " + a + "\n"
                          + a + " " + a + " " + a + " " + a + " " + a + "\n" + "\n" + "\n");
      return output;
   }
} //end public class