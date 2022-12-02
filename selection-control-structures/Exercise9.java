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
        // colonial, slit-entry, single-story
        // input: base price, finished area in square feet
        // output: price per square foot of the three models, model with least price

        Scanner prompt = new Scanner(System.in);

        int colonial = 0;
        int split_entry = 0;
        int single_story = 0;

        int base_price_per_sqft = prompt.nextInt();
        int area_of_colonial_in_sqft = base_price_per_sqft * prompt.nextInt();
        int area_of_split_entry_in_sqft = base_price_per_sqft * prompt.nextInt();
        int area_of_single_story_in_sqft = base_price_per_sqft * prompt.nextInt();

        System.out.println("Price of a colonial model: $" + area_of_colonial_in_sqft);
        System.out.println("Price of a split-entry model: $" + area_of_split_entry_in_sqft);
        System.out.println("Price of a single-story model: $" + area_of_single_story_in_sqft);

        // determine the lowest
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
