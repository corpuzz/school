/*
 * SELECTION EXERCISE 9:
 * Samantha and Vikas are looking to buy a house in a new development. After looking at
 * various models the three models they like are colonial, split-entry, and single-story. The
 * builder gave them the base price and the finished area in square feet of the three models.
 * They want to know the price per square foot of the three models and the model with the
 * least price per square foot. Write a program that accepts as input the base price and the
 * finished area in square feet of the three models. The program outputs the price per square
 * foot of the three models and the model with the least price per square foot.
 */
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        // Prompt for the base price
        System.out.println("Enter base price per square foot");
        int base_price_per_sqft = prompt.nextInt();

        // Prompt for the finished area of models in square feet
        System.out.println("Please enter the finished area of the colonial model in square feet: ");
        int area_of_colonial_in_sqft = prompt.nextInt();
        System.out.println("Please enter the finished area of the split-entry model in square feet: ");
        int area_of_split_entry_in_sqft = prompt.nextInt();
        System.out.println("Please enter the finished area of the single-story model in square feet: ");
        int area_of_single_story_in_sqft = prompt.nextInt();

        // Print model prices
        System.out.println("Price of a colonial model: $" + (base_price_per_sqft * area_of_colonial_in_sqft));
        System.out.println("Price of a split-entry model: $" + (base_price_per_sqft * area_of_split_entry_in_sqft));
        System.out.println("Price of a single-story model: $" + (base_price_per_sqft * area_of_single_story_in_sqft));

        // determine the lowest priced model
        if(area_of_colonial_in_sqft < area_of_split_entry_in_sqft && area_of_colonial_in_sqft < area_of_split_entry_in_sqft) {
            System.out.println("Lowest price is the colonial model at $" + area_of_colonial_in_sqft);
        }
        else if(area_of_split_entry_in_sqft < area_of_colonial_in_sqft && area_of_split_entry_in_sqft < area_of_single_story_in_sqft) {
            System.out.println("Lowest price is the split-entry model at $" + area_of_split_entry_in_sqft);
        } else {
            System.out.println("Lowest price is the single-story model at $" + area_of_single_story_in_sqft);
        }
        
        prompt.close();
    }
}
