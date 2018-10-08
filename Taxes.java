/* Connor Matheny
 * CSE 174, program 5
 * Taxes
 * 09/30/2018
 * Viji
 * Description: Program computes tax due based on user inputs of marital status and income
 * 
 * Test Cases: (Status, taxable income)       Expected outcome
 * (single, 0)                                0.00
 * (single, 8000)                             800.00
 * (married, 0)                               0.00
 * (married, 16000)                           16000.00
 * (SinGle, 54000)                            9900.00
 * (marryed, 45000)                           Invalid input message
 * (maRRIEd, 80000)                           12800.00
 * (singles, 120000)                          Invalid input message
 * (sinGLE, 100000)                           21400.00
 */

import java.util.Scanner;

public class Taxes{
   public static void main(String[] args){
      //variables
      Scanner in = new Scanner(System.in);
      String status;
      int income;
      double tax, computedTax;
      
      //gather input
      System.out.print("Enter the status [Single or Married]: ");
      status = in.next();
      
      
      //compute and print
      if(status.equalsIgnoreCase("single") || status.equalsIgnoreCase("married")){
         
         System.out.print("Enter the taxable income: ");
         income = in.nextInt();
         
         if(status.equalsIgnoreCase("single") && income >= 0 && income <= 8000){
            tax = .10;
            computedTax = income * tax;
            System.out.printf("The computed tax is %.2f", computedTax);
         }
         else if(status.equalsIgnoreCase("single") && income > 8000 && income <= 32000){
            tax = .15;
            income -= 8000;
            computedTax = (income * tax) + 800;
            System.out.printf("The computed tax is %.2f", computedTax);
         }
         else if(status.equalsIgnoreCase("single") && income > 32000){
            tax = .25;
            income -= 32000;
            computedTax = (income * tax) + 4400;
            System.out.printf("The computed tax is %.2f", computedTax);
         }
         else if(status.equalsIgnoreCase("married") && income >= 0 && income <= 16000){
            tax = .10;
            computedTax = income * tax;
            System.out.printf("The computed tax is %.2f", computedTax);
         }
         else if(status.equalsIgnoreCase("married") && income > 16000 && income <= 64000){
            tax = .15;
            income -= 16000;
            computedTax = (income * tax) + 1600;
            System.out.printf("The computed tax is %.2f", computedTax);
         }
         else if(status.equalsIgnoreCase("married") && income > 64000){
            tax = .25;
            income -= 64000;
            computedTax = (income * tax) + 8800;
            System.out.printf("The computed tax is %.2f", computedTax);
         }
      }
      else{
         System.out.print("Please enter a valid marital stautus(single or married).");
      }
      
      
   } //end main
} //end public