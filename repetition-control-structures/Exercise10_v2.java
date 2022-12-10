
/*
 * Build a simple Rock-Paper-Scissor game using the class Math (int) (Math.random * 2) to
 * generate 3 random result to be compared with the user entry and determine who won
 * the round. After one match the program must ask the user if they want to play again
 * another round or not.
 */ 

import java.util.Scanner;
import java.lang.Math;

public class Exercise10_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean condition = true;

        do {
        char menu_selection = ' ';
        final int rock = 0;
        final int paper = 1;
        final int scissors = 2;

        System.out.println("Let's play Rock Paper Scissors!\nBato bato pick: (Enter rock, paper, or scissors)");
        String input = scan.nextLine();
        String str_p_choice = input.toLowerCase();
        int p_choice = 0; // Players choice as integer for easier comparison with == operator
        int ai_choice = (int)(Math.random()*3);
        String str_ai_choice = " "; // AI's choice as string for output

        // Validate the user input 
        while(true) {
            if(!str_p_choice.equals("rock")) {
                if(!str_p_choice.equals("paper")) {
                    if(!str_p_choice.equals("scissors")) {
                        System.out.println(String.format(
                            "Please enter a valid choice.\nYou can only pick rock, paper, or scissors.\nBato bato pick:", str_p_choice));
                        str_p_choice = scan.nextLine();
                    }
                }
            }
            break;
        }

        // Assign player's choice to it's integer representation
        switch(str_p_choice) {
            case "rock":
                p_choice = rock;
                break;
            case "paper":
                p_choice = paper;
                break;
            case "scissors":
                p_choice = scissors;
                break;
        }

        // Assign AI choice to string for output
        switch(ai_choice) {
            case 0:
                str_ai_choice = "rock";
                break;
            case 1:
                str_ai_choice = "paper";
                break;
            case 2:
                str_ai_choice = "scissors";
                break;
        }

        // Check for ties
        if(p_choice == rock && ai_choice == rock || p_choice == paper && ai_choice == paper || p_choice == scissors && ai_choice == scissors) {
            System.out.println(String.format("Player: %s \nAI: %s\nOoh, it's a tie!", str_p_choice, str_ai_choice));
        // Player wins
        } else if(p_choice == rock && ai_choice == scissors) {
            System.out.println(String.format("Player: %s \nAI: %s\nYou WIN!", str_p_choice, str_ai_choice));
        } else if(p_choice == paper && ai_choice == rock) {
            System.out.println(String.format("Player: %s \nAI: %s\nYou WIN!", str_p_choice, str_ai_choice));
        } else if(p_choice == scissors && ai_choice == rock) {
            System.out.println(String.format("Player: %s \nAI: %s\nYou WIN!", str_p_choice, str_ai_choice));
        // Player lose, computer wins
        } else {
            System.out.println(String.format("Player: %s \nAI: %s\nYou LOSE!", str_p_choice, str_ai_choice));
        }

        // Quit or Play again
        while(true) {
            if(menu_selection == 'q') {
                condition = false;
                break;
            } else if(menu_selection == 'r') {
                condition = true;
                break;
            } else {
                System.out.println("Press q and Enter to QUIT. Press r and Enter to PLAY AGAIN");
                menu_selection = scan.nextLine().charAt(0);
                continue;
            }
        }
        } while(condition);
        scan.close();
    }
}

// Takes aways and lesson: 
// Java == operator compares String objects by reference, not by value. 
// Use .equals() method when comparing strings
// Use the nagation operator and .equals() when doing != 

