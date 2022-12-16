
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class InventoryManagementSystem {
        private static ArrayList<String> Products = new ArrayList<String>();
        private static ArrayList<Double> Prices = new ArrayList<Double>();
        private static ArrayList<Integer> Quantities = new ArrayList<Integer>();
    public static void main(String[] args) {
        DisplayInventory();
    }

    public static void DisplayInventory() {
        if(Products.isEmpty()) {
            AddToInventory();
        } 
        getInventory();
    }

    // Getting the products has the responsibility of displaying the 
    public static void getInventory() {
        JList<String> JProducts = new JList<String>(convertToJlist(Products));
        JOptionPane.showMessageDialog(null, JProducts, "INVENTORY", JOptionPane.PLAIN_MESSAGE);
    }

    // Adding to products is responsible for asking for the product, price and quantity
    public static void AddToInventory() {
        String product = JOptionPane.showInputDialog(
            null, 
            "There are no items found.\nAdd a product", 
             "PRODUCT",
            JOptionPane.OK_CANCEL_OPTION
        );

        double price = Double.parseDouble(JOptionPane.showInputDialog(
            null, 
            "Enter the unit price:", 
             "PRICE",
            JOptionPane.OK_CANCEL_OPTION
        ));

        int quantity = Integer.parseInt(JOptionPane.showInputDialog(
            null, 
            "Enter quantity:", 
             "QUANTITY",
            JOptionPane.OK_CANCEL_OPTION
        ));
        Products.add(product);
        Prices.add(price);
        Quantities.add(quantity);
    }

    public static String[] convertToJlist(ArrayList<String> s) {
        String[] something = {"ham", "egg"};
        return something;
    }
}
