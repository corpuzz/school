/*
 * Write a complete program to generate the multiplication table ranging from 1 – 10
 */

public class Exercise8 {
    public static void main(String[] args) {
        for(int row = 1; row <= 10; row++) {
            for(int column = 1; column <= 10; column++) {
                int value = row * column;
                System.out.print(" " + value + "\t");
            }
            System.out.print("\n");
        }
    }
}