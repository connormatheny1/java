/* Connor Matheny
 * CSE 174
 * Program 5, #2
 * Game
 * 10/01/2018
 * Viji
 * Description: Program takes users input of either rock, paper or scissors and plays 
 *              against a randomly generated choice from the computer and then displays
 *              the computer's choice and the winner of the game.
 */

import java.util.Scanner;

public class Game {
   public static void main(String[] args){
      //variables
      Scanner in = new Scanner(System.in);
      int randomNum = 0 + (int)(Math.random() * 3);
      String userChoice, computerChoice, result, str;
      
      //computer choice declaration
      if(randomNum == 0){
         computerChoice = "rock";
      }
      else if(randomNum == 1){
         computerChoice = "paper";
      }
      else{
         computerChoice = "scissors";
      }
      
      //user input and print comp choice
      System.out.print("Human, choose your weapon: ");
      userChoice = in.next();
      userChoice = userChoice.toLowerCase();
      
      //validate input is at least four letters
      if(userChoice.length() < 4){
         System.out.print("Please reset and enter a valid weapon choice.");
      }
      else{
         if(userChoice.equals("rock") || userChoice.equals("scissors") || userChoice.equals("paper")){
            //display computer choice and convert case to be safe
            System.out.println("Computer chooses: " + computerChoice);
            System.out.print(result(userChoice, computerChoice));
         }
         else{
            System.out.print("Please reset and enter a valid weapon choice.");
         }
      }
   }// end main
   
   public static String result(String human, String computer){
      String winner = "";
      if(human.equalsIgnoreCase(computer)){
         winner = "Tie!";
         return winner;
      }
      else if(human.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("scissors")){
         winner = "Human wins!";
         return winner;
      }
      else if(human.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper")){
         winner = "Human wins!";
         return winner;
      }
      else if(human.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock")){
         winner = "Human wins!";
         return winner;
      }
      else{
         winner = "Computer wins!";
         return winner;
      }
   }// end result()
}// end public