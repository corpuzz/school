/*
 * SELECTION EXERCISE 8:
 * The number of lines that can be printed on a piece of paper depends on the paper size, the
 * point size of each character in a line, whether lines are double-spaced or single-spaced, the
 * top and bottom margin, and the left and right margins of the paper. Assume that all
 * characters are of the same point size, and all lines are either single-spaced or double-
 * spaced. Note that 1 inch ¼ 72 points. Moreover, assume that the lines are printed along the
 * width of the paper. For example, if the length of the paper is 11 inches and the width is 8.5
 * inches, then the maximum length of a line is 8.5 inches. Write a program that calculates the
 * number of characters in a line and the number of lines that can be printed on a paper based
 * on the following input from the user:

 * a. The length and width, in inches, of the paper.
 * b. The top, bottom, left, and right margins.
 * c. The point size of a line.
 * d. If the lines are double-spaced, then double the point size of each character. 
 */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        // Prompt the user for the paper size in inches
        System.out.print("Enter the length of the paper in inches: ");
        double length = prompt.nextDouble();
        System.out.print("Enter the width of the paper in inches: ");
        double width = prompt.nextDouble();

        // Prompt the user for the margins in inches
        System.out.print("Enter the top margin in inches: ");
        double top_margin = prompt.nextDouble();
        System.out.print("Enter the bottom margin in inches: ");
        double bottom_margin = prompt.nextDouble();
        System.out.print("Enter the left margin in inches: ");
        double left_margin = prompt.nextDouble();
        System.out.print("Enter the right margin in inches: ");
        double right_margin = prompt.nextDouble();

        // Calculate the usable area of the paper
        double usable_length = length - top_margin - bottom_margin;
        double usable_width = width - left_margin - right_margin;

        // Prompt the user for the point size of a line
        System.out.print("Enter the point size of a line: ");
        double point_size = prompt.nextDouble();

        // Prompt the user for the line spacing
        System.out.print("Enter 1 for single-spaced lines or 2 for double-spaced lines: ");
        int line_spacing = prompt.nextInt();

        // Calculate the number of characters per line
        double characters_per_inch = 72 / point_size;
        int characters_per_line = (int) (usable_width * characters_per_inch);

        // Calculate the number of lines that can be printed
        double lines_per_inch = 72 / (point_size * line_spacing);
        int num_of_lines = (int) (usable_length * lines_per_inch);

        // Print the results
        System.out.println("The number of characters per line is " + characters_per_line);
        System.out.println("The number of lines is " + num_of_lines);

        prompt.close();
    }
}
