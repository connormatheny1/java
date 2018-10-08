/*Name: Connor Matheny
 * CSE174 Lab 2
 * 09/06/2018
 * Viji
 * Description: Program will print a 1 or 2 randomly, then based on this
 *              will convert a user inputted temperature in Celsius to Fahrenheit
 *              or user inoutter temperature in Fahrenheit to Celsius then print
 *              which state of matter water would be at that temperature.boo
 */

import java.util.Scanner;

public class Lab4 {
   
   public static void main(String[] args){
      
      //Variables
      int randomNumber;
      // String cToF, fToC;
      double celsius, fahrenheit;
      Scanner keyBoard = new Scanner(System.in);
      
      //Random number print and input gathering
      randomNumber = (int) Math.ceil(Math.random() * 2);
      
      System.out.print("Random Number " + randomNumber + ": ");
      
      if(randomNumber == 1){
         System.out.println("Fahrenheit to Celsius Conversion:");
         System.out.print("Enter temperature in Fahrenheit: ");
         fahrenheit = keyBoard.nextDouble();
         celsius = ((fahrenheit - 32.0) * (5.0/9.0));
      }
      else { //random == 2
         System.out.println("Celsius to Fahrenheit Conversion:");
         System.out.print("Enter temperature in Celsius: ");
         celsius = keyBoard.nextDouble();
         fahrenheit = (celsius * 1.8 + 32.0);
      }
         System.out.printf("%.3f Celsius = %.3f Fahrenheit\n", celsius, fahrenheit) ;
         
         if(celsius >= 100){
            System.out.print("*** Water is Gas");
         }
         else if(celsius < 100 && celsius > 0){
            System.out.print("*** Water is Liquid");
         }
         else if(celsius <= 0){
            System.out.print("***Water is Solid");
         } 
      System.out.println("");
   } //end main
   
} //end public