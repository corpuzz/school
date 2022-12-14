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
import java.util.ArrayList;
import java.util.Arrays;

public class PointOfSale {
  // Global Variables
  static ArrayList<String> products = new ArrayList<String>();
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
  Object[] products = {"8GB Ram, 8 Core GPU", "8GB Ram, 10 Core GPU"};
  String choice = (String) JOptionPane.showInputDialog(
                    null,
                    "Buy the new Apple MaBook Air M2 Series\nSelect a variant:",
                    "TINDAHAN STORE",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    products,
                    products[0]
                    );
  System.out.println(choice);
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