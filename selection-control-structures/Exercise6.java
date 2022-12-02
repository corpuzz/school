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

        /* =========== first solution ====================
          int longest = 0;
          int shorter = 0;

          // Determine the longest
          if(side1 > side2 && side1 > side3) longest = side1;
          else if(side2 > side1 && side2 > side3) longest = side2;
          else longest = side3;

          // Determine the 2 lower value, square each and add them together
          if(side1 < longest) shorter += Math.pow(side1, 2);
          if(side2 < longest) shorter += Math.pow(side2, 2);
          if(side3 < longest) shorter += Math.pow(side3, 2);

          // use the Pythagorean formula: a^2 + b^2 = c^2
          boolean result = Math.pow(longest, 2) == shorter; 
          if(result) {
          System.out.println("It is a right triangle");
          } else {
          System.out.println("Not a right triangle");
          }
         */

       // ============= second solution ==============

       // sort in ascending order (make it easier to plug into the the pythagorean formula)
       // With help from: https://stackoverflow.com/a/37145746
       int max = 0;
       int med = 0;
       int min = 0;
       if (side1 > side2) {
            if (side1 > side3) {
                 max = side1;
                 if (side2 > side3) {
                      med = side2;
                      min = side3;
                 } else {
                      med = side3;
                      min = side2;
                 }
            } else {
                 med = side1;
                 if (side2 > side3) {
                      max = side2;
                      min = side1;
                 } else {
                      max = side3;
                      min = side2;
                 }
            }
       } else {
            if (side2 > side3) {
                 max = side2;
                 if (side1 > side3) {
                      med = side1;
                      min = side3;
                 } else {
                      med = side3;
                      min = side1;
                 }
            } else {
                 med = side2;
                 max = side3;
                 min = side1;
            }
       }

       // use the pythagorean formula to determine if it is a right triangle
       // a^2 + b^2 = c^2
       boolean result = Math.pow(min, 2) + Math.pow(med, 2) == Math.pow(max, 2);

       if (result) {
            System.out.println("It is a right triangle");
       } else {
            System.out.println("Not a right triangle");
       }
       prompt.close();
  }
}


