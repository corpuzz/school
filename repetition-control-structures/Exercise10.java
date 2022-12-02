/*
 * Build a simple Rock-Paper-Scissor game using the class Math (int) (Math.random * 2) to
 * generate 3 random result to be compared with the user entry and determine who won
 * the round. After one match the program must ask the user if they want to play again
 * another round or not.
 */ 

import java.util.Scanner;
import java.lang.Math;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final String rock = "rock";
        final String paper = "paper";
        final String scissors = "scissors";

        System.out.println("Let's play Rock Paper Scissors!\nBato bato pick: ");
        String player_choice = prompt.next();;
        String ai_choice = " ";
        int random_num = (int)(Math.random()*3);

        // If user enter wrong invalid choice
        while(true) {
            if(!player_choice.equals(rock)) {
                if(!player_choice.equals(paper)) {
                    if(!player_choice.equals(scissors)) {
                        player_choice = prompt.next();
                    }
                }
            }
            break;
        }
        // Rock-paper-scissor AI
        // 0 for rock
        // 1 for paper
        // 2 for scissors
        switch(random_num) {
            case 0:
                ai_choice = rock;
                break;
            case 1:
                ai_choice = paper;
                break;
            case 2:
                ai_choice = scissors;
                break;
        }

        // Check if it's a tie
        if(player_choice.equals(rock ) && ai_choice.equals(rock) || player_choice.equals(paper) && ai_choice.equals(paper) || player_choice.equals(scissors) && ai_choice.equals( scissors)) {
            System.out.println(String.format("Player: %s \nAI: %s\nOoh, it's a tie!", player_choice, ai_choice));
        // rock beats scissors
        } else if((player_choice.equals(rock) && ai_choice.equals(scissors))) {
            System.out.println(String.format("Player: %s \nAI: %s\nPlayer wins!", player_choice, ai_choice));
        // paper beats rock
        } else if(player_choice.equals(paper ) && ai_choice.equals(rock)) {
            System.out.println(String.format("Player: %s \nAI: %s\nPlayer wins!", player_choice, ai_choice));
        // scissors beats paper
        } else if(player_choice.equals(scissors) && ai_choice.equals(rock)) {
            System.out.println(String.format("Player: %s \nAI: %s\nPlayer wins!", player_choice, ai_choice));
        } else {
            System.out.println(String.format("Player: %s \nAI: %s\nAI wins!", player_choice, ai_choice));
        }


        prompt.close();
    }
}

// Takes aways and lesson: 
// Java == operator compares String objects by reference, not by value. 
// Use .equals() method when comparing strings
// Use the nagation operator and .equals() when doing != 
// I could've just used integers for in place for rock, paper, and scissors for less troublesome comparison