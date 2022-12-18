/*
 * Write a program that reads in a line consisting of a student’s name, Social Security
 * number, user id, and password (separated by one space). The program outputs the
 * string in which all the digits of the Social Security number and all the characters in the
 * password are replaced by x. (The Social Security number is in the form 000-00-0000.
 * The student name does not contain any digits, and the user id and the password do not
 * contain any spaces.) 
 */
import java.util.Scanner;
import java.lang.Integer;

public class Exercise9 {
    public static void main(String[] args) {
        while(true) {
            Scanner prompt = new Scanner(System.in);
            System.out.println("Fill in the fields:\nName:_________ SSS No.:__________ User ID:___________ Password:___________");
            String input = prompt.nextLine();        
            
            // We have some string parsing to do
            String name = "";
            String ssn = ""; 
            String id = "";
            String password = "";
            int lastIndexOfName;
            int i = 0;
            for(; i < input.length(); ++i) {
                char c = input.charAt(i);
                if(!Character.isDigit(c)) {
                    name += c;
                } else {
                    // continue parsing for ssn
                    lastIndexOfName = i;
                    ssn += c;
                }
            }

            // move on from name and ssn
            // parse the id now. ID should be 9 digit numbers
            for(; i < input.length(); ++i) {
                char c = input.charAt(i);
                if(c != ' ') {
                    id += c;
                } else continue;
            }

            for(; i < input.length(); ++i) {
                char c = input.charAt(i);
                if(c != ' ') {
                    password += c;
                } else continue;
            }

            System.out.println(String.format("Name: %s SSN: %s ID: %s Password: %s", name, ssn, id, password));
            prompt.close();
            break;
        }
    }
}

// nakakatamad mag manual parse ng strings! 
// 