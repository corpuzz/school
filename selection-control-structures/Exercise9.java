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
        double colonial_price, split_entry_price, single_story_price;
        double colonial_area, split_entry_area, single_story_area;

        // Prompt the user for the base price and finished area for the colonial model
        System.out.print("Enter the base price for the colonial model: ");
        colonial_price = prompt.nextDouble();
        System.out.print("Enter the finished area (in square feet) for the colonial model: ");
        colonial_area = prompt.nextDouble();

        // Prompt the user for the base price and finished area for the split-entry model
        System.out.print("Enter the base price for the split-entry model: ");
        split_entry_price = prompt.nextDouble();
        System.out.print("Enter the finished area (in square feet) for the split-entry model: ");
        split_entry_area = prompt.nextDouble();

        // Prompt the user the base price and finished area for the single-story model
        System.out.print("Enter the base price for the single-story model: ");
        single_story_price = prompt.nextDouble();
        System.out.print("Enter the finished area (in square feet) for the single-story model: ");
        single_story_area = prompt.nextDouble();

        // Calculate the price per square foot for each model
        double colonial_price_per_sqft = colonial_price / colonial_area;
        double split_entry_price_per_sqft = split_entry_price / split_entry_area;
        double single_story_per_sqft = single_story_price / single_story_area;

        // Print the price per square foot for each model
        System.out.println("Price per square foot for colonial model: $" + colonial_price_per_sqft);
        System.out.println("Price per square foot for split-entry model: $" + split_entry_price_per_sqft);
        System.out.println("Price per square foot for single-story model: $" + single_story_per_sqft);

        // Determine the model with the lowest price per square foot
        // Assume Colonial has the lowest price per square foot (similar with the Pythagoreas theorem)
        String least_expensive_model = "colonial";
        double lowest_price_per_sqft = colonial_price_per_sqft;
        if (split_entry_price_per_sqft < lowest_price_per_sqft) {
            least_expensive_model = "split-entry";
            lowest_price_per_sqft = split_entry_price_per_sqft;
        }
        if (single_story_per_sqft < lowest_price_per_sqft) {
            least_expensive_model = "single story";
            lowest_price_per_sqft = single_story_per_sqft;
        }

        // Print the model with the lowest price per square foot
        System.out.println("The least expensive model is the " + least_expensive_model + " model");
        prompt.close();
    }
}
