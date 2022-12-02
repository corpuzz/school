/*
 * SELECTION EXERCISE 7:
 * A box of cookies can hold 24 cookies and a container can hold 75 boxes of cookies. Write a
 * program that prompts the user to enter the total number of cookies. The program then
 * outputs the number of boxes and the number of containers to ship the cookies. Note that
 * each box must contain the specified number of cookies and each container must contain the
 * specified number of boxes. If the last box of cookies contains less than the number of
 * specified cookies, you can discard it, and output the number of leftover cookies. Similarly, if
 * the last container contains less than the number of specified boxes, you can discard it, and
 * output the number of leftover boxes.
 */
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final int cookies_per_box = 24;
        final int boxes_per_container = 75;
        
        int num_of_boxes = 0;
        int num_of_containers = 0;
        int leftover_cookies = 0;
        int leftover_boxes = 0;

        int cookies_count = prompt.nextInt();

        // determine number of boxes and containers 
        num_of_boxes = cookies_count / cookies_per_box;
        num_of_containers = num_of_boxes / boxes_per_container;

        // determine leftovers
        leftover_cookies = cookies_count % cookies_per_box;
        leftover_boxes = boxes_per_container % num_of_boxes;
        
        System.out.println("Number of boxes: " + num_of_boxes);
        System.out.println("Number of containers: " + num_of_containers);

        System.out.println("Number of leftover cookies: " + leftover_cookies);
        System.out.println("Number of leftover boxes: " + leftover_boxes);

        prompt.close();
    }
}
