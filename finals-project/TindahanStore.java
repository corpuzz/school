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

public class TindahanStore {
  // Inventory. Vector/ArrayList 
  private static String products = "What are we buying today?\n" +
      "(Enter 1 to select Ham, 12 to select Ham and Hotdog\n" +
      "1. Ham\u0009P55.00\n" +
      "2. Hotdog\tP50.0\n" +
      "3. Egg\tP9.00";
  private static String selectedItems = "";
  // Item Price. HashMap would have been great :( 
  private static final double HAM_PRICE = 55.0;
  private static final double HOTDOG_PRICE = 50.0;
  private static final double EGG_PRICE = 9.0;

  // Total price of each selected item
  private static double hamTotalPrice = 0.0;
  private static double hotdogTotalPrice = 0.0;
  private static double eggTotalPrice = 0.0;

  // Selected items quantity
  private static int hamQuantity = 0;
  private static int hotdogQuantity = 0;
  private static int eggQuantity = 0;

  public static void main(String[] args) {
    BuyMenu();
    CheckoutMenu();
    PaymentMenu();
  }

  public static void BuyMenu() {
    UIManager.put("OptionPane.okButtonText", "Add To Cart"); // Replace showInputDialog button text
    String choice = JOptionPane.showInputDialog(
        null,
        products,
        "TINDAHAN STORE",
        JOptionPane.PLAIN_MESSAGE);
    AddToCart(choice);
  }

  public static void CheckoutMenu() {
    ToTalBill();
    int i = 0;
  }

  public static void PaymentMenu() {
  }

  // Supplementary functions
  public static void AddToCart(String choice) {
    // Parse choice
    for (int i = 0; i < choice.length(); i++) {
      int item = Integer.parseInt(String.valueOf(choice.charAt(i)));
      switch (item) {
        case 1:
          // Add item to selectedItems
          selectedItems += "Ham\n";
          hamQuantity = GetQuantity("ham");
          break;
        case 2:
          // Add item to selectedItems
          selectedItems += "Hotdog\n";
          hotdogQuantity = GetQuantity("hotdog");
          break;
        case 3:
          // Add item to selectedItems
          selectedItems += "Egg\n";
          eggQuantity = GetQuantity("egg");
          break;
      }
    }
    System.out.print(selectedItems);
    // this.selectedItems = choice;
  }

  public static int GetQuantity(String s) {
    UIManager.put("OptionPane.okButtonText", "Ok"); // Reset button text
    String quantity = "";
    do {
      quantity = JOptionPane.showInputDialog(null, String.format("Enter quantity for %s:", s), "TINDAHAN STORE", JOptionPane.QUESTION_MESSAGE);
    } while (quantity == "");
    return Integer.parseInt(quantity);
  }

  public static double ToTalBill() {
    hamTotalPrice = HAM_PRICE * hamQuantity; 
    eggTotalPrice = EGG_PRICE * eggQuantity;
    hotdogTotalPrice = HOTDOG_PRICE * hotdogQuantity;

    double total = hamTotalPrice + eggTotalPrice + hotdogTotalPrice;
    return total;
  }
  /*
   * public static ArrayList<String> fillInventory() {
   * products.addAll(Arrays.asList("ham, hotdog, burger"));
   * return products;
   * }
   */
}


// it seems like you don't have any products yet
