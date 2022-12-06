/*
 * Write a program that uses for loops to perform the following steps:
 * a. Prompt the user to input two integers: firstNum and secondNum. (firstNum * must be less than secondNum.)
 * b. Output all the odd numbers between firstNum and secondNum inclusive.
 * c. Output the sum of all the even numbers between firstNum and secondNum * inclusive.
 * d. Output all the numbers and their squares between 1 and 10.
 * e. Output the sum of the squares of all the odd numbers between firstNum and * secondNum inclusive.
 * f. Output all the uppercase letters.
 */
import java.util.Scanner;
import java.lang.Math;


public class Exercise6 {
    public static void main(String[] args) {
        // a. 
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter an integer: (must be lower than next integer)");
        int firstNum = prompt.nextInt();
        System.out.println("Enter another integer: ");
        int secondNum = prompt.nextInt();

        
        // Make sure firstNum is less than secondNum
        for(boolean result = true; result == true;) {
            if(firstNum > secondNum) {
                System.out.println("First number must be less than second number.");
                System.out.println("Enter an integer: (must be lower than next integer)");
                firstNum = prompt.nextInt();
                System.out.println("Enter another integer: ");
                secondNum = prompt.nextInt(); 
            } else result = false;
        }

        // b.
        int even = 0;
        int odd = 0;
        for(int i = firstNum; i <= secondNum; i++) {
            if(i % 2 == 0) {
                even += i;
            } else {
                System.out.println(i);
                odd += i;
            }
        }

        // c.
        System.out.println("c. Sum of all even: " + even);

        // d.
        for(int d_counter = 1; d_counter < 10; ++d_counter) {
            System.out.println("Numbers and their squares from 1-10: (non-inclusive)");
            System.out.println(Math.pow(d_counter, 2));
        }

        // e. 
        System.out.println("e. Sum of squared odd " + (int)(Math.pow(odd, 2)));
        prompt.close();

        // f.
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
    }
}