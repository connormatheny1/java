/* Name: Connor Matheny
 * CSE174 Program 4 #4, ChangeCalculator
 * 09/23/2018
 * Viji
 * Description: Program receives two inputs. One is the cost of a purchase, and the other
 *              is the amount paid to cover the cost. The program then computes the total change
 *              due back and then how to correctly give change back by each type of coin.
 */

import java.util.Scanner;

public class ChangeCalculator {
   
   public static void main(String[] args){
      
      //variables
      int cost, paid, change, totalChange, penniesBack, nickelsBack, dimesBack, quartersBack,
         dollarsBack, penny = 1, nickel = 5, dime = 10, quarter = 25, dollar = 100;
      Scanner keyBoard = new Scanner(System.in);
      
      //get input
      System.out.print("Enter the total cost in pennies: ");
      cost = keyBoard.nextInt();
      System.out.print("Enter the amount received in pennies: ");
      paid = keyBoard.nextInt();
      
      //check if amount given is enough
      if(paid < cost){
         System.out.print("You have not paid enough, please re-enter a valid payment");
         paid = keyBoard.nextInt();
      } // end if block
      
      //computations
      totalChange = paid - cost;
      change = totalChange;
      
      dollarsBack = change / dollar;
      change %= dollar;
      
      quartersBack = change / quarter;
      change %= quarter;
      
      dimesBack = change / dime;
      change %= dime;
      
      nickelsBack = change / nickel;
      change %= nickel;
      
      penniesBack = change / penny;
      change %= penny;
      
      //print output
      System.out.printf
         ("Total change: %5d\nDollars: %10d\nQuarters: %9d\nDimes: %12d\nNickels: %10d\nPennies: %10d", 
          totalChange, dollarsBack, quartersBack, dimesBack, nickelsBack, penniesBack);
      
   } // end main
   
} // end public