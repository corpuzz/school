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
        Scanner scanner = new Scanner(System.in);

    // Prompt the user for the paper size in inches
    System.out.print("Enter the length of the paper in inches: ");
    double length = scanner.nextDouble();
    System.out.print("Enter the width of the paper in inches: ");
    double width = scanner.nextDouble();

    // Prompt the user for the margins in inches
    System.out.print("Enter the top margin in inches: ");
    double topMargin = scanner.nextDouble();
    System.out.print("Enter the bottom margin in inches: ");
    double bottomMargin = scanner.nextDouble();
    System.out.print("Enter the left margin in inches: ");
    double leftMargin = scanner.nextDouble();
    System.out.print("Enter the right margin in inches: ");
    double rightMargin = scanner.nextDouble();

    // Calculate the usable area of the paper
    double usableLength = length - topMargin - bottomMargin;
    double usableWidth = width - leftMargin - rightMargin;

    // Prompt the user for the point size of a line
    System.out.print("Enter the point size of a line: ");
    double pointSize = scanner.nextDouble();

    // Prompt the user for the line spacing
    System.out.print("Enter 1 for single-spaced lines or 2 for double-spaced lines: ");
    int lineSpacing = scanner.nextInt();

    // Calculate the maximum number of characters per line
    double charactersPerInch = 72 / pointSize;
    int maxCharactersPerLine = (int) (usableWidth * charactersPerInch);

    // Calculate the maximum number of lines that can be printed
    double linesPerInch = 72 / (pointSize * lineSpacing);
    int maxLines = (int) (usableLength * linesPerInch);

    // Print the results
    System.out.println("The maximum number of characters per line is " + maxCharactersPerLine);
    System.out.println("The maximum number of lines is " + maxLines);

    scanner.close();
    }
}
