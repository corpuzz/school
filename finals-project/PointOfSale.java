/* Requirements = Create a Point of Sale system that:
 * - Customer selects an item/choice and goes to the casier. (Create a function to display items and get user input) 
 * - The casier then "scans" the product/choice seleted by the customer (Display payment methods for customer, figure out the balance) 

 * - Create a separate function for inventory 
 *   Use an array for inventory, 
 * - Create a separate function for payment methods, artificially generate a random balance for the customer 
 *   Methods: Cash, Credit Card, Gcash
 *  
 * - Don't forget to provide an invoice/reciept
 * */

// Buy Menu - product lists
// Added To Cart Menu/Checkout - list of products selected
// Payment Menu - payment methods, customer balance

import javax.swing.*;
import java.lang.Integer;

public class PointOfSale {
  // Global Variables
  static String products = "What are we buying today?\n" + 
                           "(Enter 1 to select Ham, 12 to select Ham and Hotdog\n" +
                           "1. Ham\tP55.00\n" +
                           "2. Hotdog\tP50.0\n" +
                           "3. Egg\tP9.00";
  static String selectedItems = "";
  // Item Price
  static final double HAM_PRICE = 55.0;
  static final double HOTDOG_PRICE = 50.0;
  static final double EGG_PRICE = 9.0;

  // Total price of each selected item
  static double hamTotalPrice = 0.0;
  static double hotdogTotalPrice = 0.0;
  static double eggTotalPrice = 0.0;

  // Selected items quantity
  static int hamQuantity = 0;
  static int hotdogQuantity = 0;
  static int eggQuantity = 0;


  public static void main(String[] args) {
    BuyMenu();
    CheckoutMenu();
    PaymentMenu();
  }

  public static void BuyMenu() {
    UIManager.put("OptionPane.okButtonText", "Add To Cart"); // Change showInputDialog button text
    String choice = JOptionPane.showInputDialog(
                      null,
                      products,
                      "TINDAHAN STORE",
                      JOptionPane.PLAIN_MESSAGE
    );
    AddToCart(choice);
    hamQuantity = GetQuantity("ham");
    hotdogQuantity = GetQuantity("hotdog");
    eggQuantity = GetQuantity("egg");
  }

  public static void CheckoutMenu() {
    int i = 0;
  }

  public static void PaymentMenu() {
    int i = 0;
  }
  // Supplementary functions
  public static void AddToCart(String choice) {
    // Parse choice
    for(int i = 0; i < choice.length(); ++i) {
      int item = Integer.parseInt(choice.substring(i));
      switch(item) {
        case 1:
          // Add item to selectedItems
          selectedItems += "Ham\n";
          hamQuantity += 1;
          hamTotalPrice = HAM_PRICE * hamQuantity; // let's actually do the price calculation after the Quantity input
          break;
        case 2:
          // Add item to selectedItems
          selectedItems += "Hotdog\n";
          hotdogQuantity += 1;
          hotdogTotalPrice = HOTDOG_PRICE * hotdogQuantity;
          break;
        case 3:
          // Add item to selectedItems
          selectedItems += "Egg\n";
          eggQuantity += 1;
          eggTotalPrice = EGG_PRICE * eggQuantity;
          break;
      }
    }
    // this.selectedItems = choice;
  }
  public static int GetQuantity(String s) {
    String quantity =  JOptionPane.showInputDialog(null, String.format("Enter quantity for %s:", s), null);
    return Integer.parseInt(quantity);
  }
  
/* 
  public static ArrayList<String> fillInventory()  {
    products.addAll(Arrays.asList("ham, hotdog, burger"));
    return products;
  }
*/
}