/*
 * Write a program that reads in a line consisting of a student’s name, Social Security
 * number, user id, and password (separated by one space). The program outputs the
 * string in which all the digits of the Social Security number and all the characters in the
 * password are replaced by x. (The Social Security number is in the form 000-00-0000.
 * The student name does not contain any digits, and the user id and the password do not
 * contain any spaces.) 
 */
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Fill in the fields:\nName:_________ SSS No.:__________ User ID:___________ Password:___________");
        String student_info = prompt.nextLine();        
        
    }
}