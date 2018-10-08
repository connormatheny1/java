/* Name: Connor Matheny
 * Instructor: Ramasamy
 * CSE174 Section A
 * Date: 09/11/2018
 * program3: TriangleMath
 * Description: Program obtains user inputs of a triangle name and 
 *              the coordinates of two of the triangle's vertices, 
 *              then computes side lengths, coordinates of the third
 *              vertex, and the inradius, perimeter and area of the triangle
 */

import java.util.Scanner;

public class TriangleMath {
   
   public static void main(String[] args) {
      
      //Declarations
      String vertices; 
      char charA, charB, charC;
      double x0, x1, x2, y0, y1, y2, sideA, sideB, sideC, inradius, perimeter, area;
      
      Scanner keyBoard = new Scanner (System.in);
      
      //Get name of triangle
      System.out.print("Enter the three letter name of the Triangle: ");
      vertices = keyBoard.next().toUpperCase();
      charA = vertices.charAt(0);
      charB = vertices.charAt(1);
      charC = vertices.charAt(2);
      
      //Get coordinates of a
      System.out.print("Enter the coordinates of " + charA + ": ");
      x0 = keyBoard.nextDouble();
      y0 = keyBoard.nextDouble();
      
      //Get coordinates of b
      System.out.print("Enter the coordinates of " + charB + ": ");
      x1 = keyBoard.nextDouble();
      y1 = keyBoard.nextDouble();
      
      System.out.println("----- Measures of Triangle " + vertices + " -----");
      //Print coordinates of A
      System.out.print("Coordinates of " + charA + ": " + "(");
      System.out.printf("%.1f %.1f", x0, y0);
      System.out.println(")");
      
      //Print coordinates of B
      System.out.print("Coordinates of " + charB + ": " + "(");
      System.out.printf("%.1f %.1f", x1, y1);
      System.out.println(")");
      
      //Print coordinates of C
      System.out.print("Coordinates of " + charC + ": " + "(");
      System.out.printf("%.1f %.1f", x1, y0);
      System.out.println(")");
      
      //Compute side lengths
      sideA = Math.abs(x0 - x1);
      sideB = Math.abs(y0 - y1);
      sideC = Math.abs(Math.sqrt(((Math.pow(sideA,2)) + (Math.pow(sideB,2)))));
      
      //Print side lengths
      System.out.println("** Side Lengths **");
      System.out.print("Side " + Character.toLowerCase(charA) + ": ");
      System.out.printf("%.3f \n", sideA);
      System.out.print("Side " + Character.toLowerCase(charB) + ": ");
      System.out.printf("%.3f \n", sideB);
      System.out.print("Side " + Character.toLowerCase(charC) + ": ");
      System.out.printf("%.3f \n", sideC);
      
      //Compute other measures
      inradius = ((sideA * sideB) / (sideA + sideB + sideC));
      perimeter = (sideA + sideB + sideC);
      area = .5 * (sideA * sideB);
      
      //Print other measures
      System.out.println("** Other measures **");
      System.out.print("Inradius: ");
      System.out.printf("%.3f \n", inradius);
      System.out.print("Perimeter: ");
      System.out.printf("%.3f\n", perimeter);
      System.out.print("Area: ");
      System.out.printf("%.3f \n", area);
      
   }// end main method
}// end public class