/*
 * SELECTION EXERCISE 7:
  A box of cookies can hold 24 cookies and a container can hold 75 boxes of cookies. Write a
  program that prompts the user to enter the total number of cookies. The program then
  outputs the number of boxes and the number of containers to ship the cookies. Note that
  each box must contain the specified number of cookies and each container must contain the
  specified number of boxes. If the last box of cookies contains less than the number of
  specified cookies, you can discard it, and output the number of leftover cookies. Similarly, if
  the last container contains less than the number of specified boxes, you can discard it, and
  output the number of leftover boxes.
 */
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final int cookies_per_box = 24;
        final int boxes_per_container = 75;

        System.out.println("Enter the total number of cookies: ");
        int cookies = prompt.nextInt();

        // determine number of boxes and containers 
        int num_of_boxes = cookies / cookies_per_box;
        int num_of_containers = num_of_boxes / boxes_per_container;
        // determine leftovers
        int leftover_cookies = cookies % cookies_per_box;
        int leftover_boxes = num_of_boxes % num_of_containers;

        // Print out the results
        System.out.println("Number of boxes: " + num_of_boxes);
        System.out.println("Number of containers: " + num_of_containers);
        System.out.println("Number of leftover cookies: " + leftover_cookies);
        System.out.println("Number of leftover boxes: " + leftover_boxes);

        prompt.close();
    }
}
