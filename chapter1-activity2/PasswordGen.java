import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class PasswordGen {
    public static void main(String[] args) {
        while(true) {
            // Setup variables
            Scanner in = new Scanner(System.in);
            int pass_length = 0;
            System.out.println("Please enter password length(8-16): ");
            try {
                pass_length = in.nextInt(); // Read input from user
                if(pass_length < 8) { // Minimum password length 
                    System.out.println("Password too short.");
                    continue; // Restart the procedure
                }
            } catch (InputMismatchException e) {
                // If user types an invalid input, print it out. 
                System.out.println("Invalid input: " + in.next());
                continue; // Restart the procedure
            }
            // Output the generated password to console
            System.out.println(generate_password(pass_length));
            in.close(); // Close the input buffer
            break; // Exit out of the procedure
        }

        System.out.println("Horayt");
    }

    public static String generate_password(int pass_length) {
        String letters = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String password = "";
        int rand_num = 0; // use for indexing later

        Random rand = new Random(); 
        rand.setSeed(System.currentTimeMillis()); // generate random number using current time in milliseconds       

        while(pass_length != 0) {
            rand_num = Math.abs(rand.nextInt()) % letters.length(); // take the remainder as index
            password = password + letters.charAt(rand_num); // push index value into password 
            pass_length--;
        }
        return password;
    }
}
