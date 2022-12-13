/* Requirements = Create a Point of Sale system that:
 * - Customer selects an item/s and goes to the casier. (Create a function to display items and get user input) 
 * - The casier then "scans" the product/s seleted by the customer (Display payment methods for customer, figure out the balance) 

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
import java.util.ArrayList;
import java.util.Arrays;

public class PointOfSale {
  // Global Variables
  static ArrayList<String> products = new ArrayList();
  static String items = "";

  public static void main(String[] args) {
    BuyMenu();
    CartMenu();
    PaymentMenu();
  }

  public static void BuyMenu() {
    // ArrayList<String> product = fillInventory();
    // Object[] options = {"Add To Cart", "Cancel"};
    // int choice =  JOptionPane.showInputDialog(null, product, "Buy Fruits", JOptionPane.OK_CANCEL_OPTION, options);
Object[] possibilities = {"ham", "spam", "yam"};
String s = (String)JOptionPane.showInputDialog(
                    null,
                    "What are we buying today?",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    possibilities.);
  }

  public static void CartMenu() {
    int i = 0;
  }

  public static void PaymentMenu() {
    int i = 0;
  }

  // Supplementary functions
  public static void AddToCart(String item) {
    items = " " + item;
  }
  
  public static ArrayList<String> fillInventory()  {
    products.addAll(Arrays.asList("ham, hotdog, burger"));
    return products;
  }

}