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
        while(true) {
            String name = "";
            String ssn = ""; 
            String id = "";
            String password = "";
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name, SSN number, ID, and your password: (separated by one space)");
            String input = scanner.nextLine();        
            // Assume name is always a word followed by a space followed by another word: "John Doe"
            // Choose

            int spaceCounter = 0;
            int i = 0;
            while (i < input.length()) {
                char c = input.charAt(i);
                if (c == ' ') spaceCounter++;
                // Insert to name
                if (spaceCounter < 2) {
                    name += c;
                    i++;
                    continue;
                }
                // Insert to ssn
                if (spaceCounter < 3) {
                    if(c == ' ') { // do not include whitespace
                        i++;
                        continue;
                    }
                    ssn += c;
                    i++;
                    continue;
                }
                // Insert to id. Format: KCP ID, no dash
                if (spaceCounter < 4) {
                    if(c == ' ') { // do not include whitespace
                        i++;
                        continue;
                    }
                    id += c;
                    i++;
                    continue;
                }
                // Insert to password
                if (spaceCounter < 5) {
                    if(c == ' ') { // do not include whitespace
                        i++;
                        continue;
                    }
                    password += c;
                    i++;
                    continue;
                }
            }

            // Format and mask ssn
            String maskedSsn = "";
            int j = 1;
            while(j <= ssn.length()) {
                if(j == 3 || j == 5) {
                    maskedSsn += "x-";
                    j++;
                } else {
                maskedSsn += "x";
                j++;
                }
            }
            
            // Mask password
            String maskPassword = "";
            for(int k = 1; k <= password.length(); k++) {
                maskPassword += "x";
            }

            // Handle invalid input for SSN and ID. Invalid name and password are not handled though
            if(ssn.length() != 9) {
                System.out.println("Invalid SSN: (Must be a 9 digit number)");
                continue;
            } else if(id.length() != 10) {
                System.out.println("Invalid ID: (Must be a 10 digit number)");
                continue;
            } else {
                System.out.println(String.format("STUDENT INFORMATION\nName: %s \nSSN: %s \nID: %s \nPassword: %s", name.toUpperCase(), maskedSsn, id, maskPassword));
            }
            scanner.close();
            break;
        }
    }
}
