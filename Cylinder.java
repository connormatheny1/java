/* Connor Matheny
 * CSE 174
 * Program 5, #3
 * Cylinder
 * 10/01/2018
 * Viji
 * Description: Program calculates area of a circle, surface area of a cylinder, or the volume of
 *              a cylinder based on the user's choice of calculation and then inputted measurements
 */

import java.util.Scanner;

public class Cylinder{
   
   public static void main(String[] args){
      // variables
      Scanner input = new Scanner(System.in);
      double radius, height, diameter, area, volume, surface;
      String choiceA = "a", choiceB = "b", choiceC = "c", choice;
      // print menu
      System.out.println("--Menu--");
      System.out.println(choiceA + ") Area of a circle");
      System.out.println(choiceB + ") Area of the surface of a cylinder");
      System.out.println(choiceC + ") Volume of a cylinder");
      System.out.print("Enter your choice: ");
      choice = input.next();
      
      // validate
      if(choice.equalsIgnoreCase(choiceA) || choice.equalsIgnoreCase(choiceB) || 
         choice.equalsIgnoreCase(choiceC) && choice.length() == 1){
         // option choice and execution
         if(choice.equalsIgnoreCase("a")){
            System.out.print("Enter the radius");
            radius = input.nextDouble();
            area = circleArea(radius);
            System.out.printf("The area of the circle is %.3f", area);
         } // end choice a if
         
         if(choice.equalsIgnoreCase("b")){
            System.out.print("Enter the radius");
            radius = input.nextDouble();
            System.out.print("Enter the height");
            height = input.nextDouble();
            diameter = radius * 2;
            surface = surfaceArea(radius, height);
            System.out.printf("The area of the surface of the cylinder is %.3f", surface);
         } // end choice b if
         
         if(choice.equalsIgnoreCase("c")){
            System.out.print("Enter the radius");
            radius = input.nextDouble();
            System.out.print("Enter the height");
            height = input.nextDouble();
            volume = getVolume(radius, height);
            System.out.printf("The volume of the cylinder is %.3f", volume);
         }
      } 
      // error Ð program termination
      else{
         System.out.print("The selection is not correct. Program terminated.");
      } // end validation if
   } // end main method
   
   // Additional methods
   public static double circleArea(double radius){
      double area = ((Math.pow(radius, 2) * Math.PI));
      return area;
   } // end area of circle method
   
   public static double surfaceArea(double radius, double height){
      double diameter = radius * 2;
      double surfaceArea = ((2 * circleArea(radius)) + (diameter * Math.PI * height));
      return surfaceArea;
   } // end surface area method
   
   public static double getVolume(double radius, double height){
      double volume = (height * circleArea(radius));
      return volume;
   } // end volume method
} // end public class