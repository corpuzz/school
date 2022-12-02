/*
 * SELCTION EXERCISE 10:
 * Write a program that mimics a calculator. The program should take as input
 * a. two integers and an arithmetic operation (+, -, *, or /) to be performed. It
 * b. should then output the numbers, the operator, and the result. (For division,
 * c. if the denominator is zero, output an appropriate message.) Some sample
 * d. outputs follow:
 * 3 + 4 = 7
 * 13 * 5 = 65
 */

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int first_operand = prompt.nextInt();
        System.out.println("Enter another integer: ");
        int second_operand = prompt.nextInt();
        System.out.println("Choose an operator: (+,-,*,/)");
        char operator = prompt.next().charAt(0);
        int result = 0;

        // Make sure to input only allowed operators
        while(true) {
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid operator! You can use (+,-,*,/)");
                operator = prompt.next().charAt(0);
            } else break;
        }
        switch(operator) {
            case '+':
                result = first_operand + second_operand;
                System.out.println(String.format("%d %c %d = %d", first_operand, operator, second_operand, result));
                break;
            case '-':
                result = first_operand - second_operand;
                System.out.println(String.format("%d %c %d = %d", first_operand, operator, second_operand, result));
                break;
            case '*':
                result = first_operand * second_operand;
                System.out.println(String.format("%d %c %d = %d", first_operand, operator, second_operand, result));
                break;
            case '/':
                if(first_operand == 0 || second_operand == 0) {
                    System.out.println("Invalid operand! Dividing by zero is undefined.\nRerun the program and enter a valid integer.");
                    break;
                    // Run the program again 
                } else {
                    result = first_operand / second_operand;
                    System.out.println(String.format("%d %c %d = %d", first_operand, operator, second_operand, result));
                    break;
                }
        }
    
        prompt.close();
    }
}
