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

       int longest = 0;
       int shorter = 0;
       // Calculate if it's a right triangle
       // Determine the longest
       if(side1 > side2 || side1 > side3) longest = side1;
       else if(side2 > side1 || side2 > side3) longest = side2;
       else longest = side3;
       // Determine the 2 lower value
       if(side1 < longest) shorter += side1;
       if(side2 < longest) shorter += side2;
       if(side3 < longest) shorter += side3;
       // Do comparison on hypotenuse(longest)^2 == (base(shorter side)^2 + height(other shorter side)^2)
       if(Math.pow(longest, 2) == Math.pow(shorter, 2)) {
            System.out.println("It is a right triangle");
       } else {
            System.out.println("Not a right triangle");
       }
       // If true:
       // It is a right triangle
   }
}


