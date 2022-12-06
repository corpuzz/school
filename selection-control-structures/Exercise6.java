/*
 * SELECTION EXERCISE 6:
 * In a right triangle, the square of the length of the longest side is equal to the sum of the 
 * squares of the lengths of the other two sides. Write a program that prompts the user to enter
 * the lengths of three sides of a triangle and then outputs a message indicating whether the triangle 
 * is a right triangle. 
*/ 

import java.util.Scanner;
import java.lang.Math;

public class Exercise6 {
    public static void main(String[] args) {
          Scanner prompt = new Scanner(System.in);
          // Prompt user for length
          System.out.println("Enter length of side 1: ");
          int side1 = prompt.nextInt();
          System.out.println("Enter length of side 2: ");
          int side2 = prompt.nextInt();
          System.out.println("Enter length of side 3: ");
          int side3 = prompt.nextInt();

          // Sort in ascending order (make it easier to plug into the the pythagorean formula)
          int max = 0;
          int med = 0;
          int min = 0;
          if(side1 > side2 && side1 > side3) { 
               max = side1;
               med = side2 > side3 ? side2 : side3; 
               min = side2 > side3 ? side3 : side2;
          } else if(side2 > side1 && side2 > side3) {                
               max = side2;
               med = side1 > side3 ? side1 : side3;
               min = side1 > side3 ? side3 : side1;
          } else { 
               max = side3;
               med = side2 > side1 ? side2 : side1;
               min = side2 > side1 ? side1 : side2;
          }

          // Use the pythagorean formula to determine if it is a right triangle
          // a^2 + b^2 = c^2
          boolean result = Math.pow(min, 2) + Math.pow(med, 2) == Math.pow(max, 2);

          // Print the results
          if (result) {
               System.out.println("It is a right triangle");
          } else {
               System.out.println("Not a right triangle");
          }
          // Close the scanner resource
          prompt.close();
  }
}


