import javax.swing.*;

public class InventoryManagementSystem {

    private static String[] products = new String[100];
    private static int[] quantities = new int[100];
    private static Double[] prices = new Double[100];
    private static int numProducts = 0; // we'll use this to index through our product list

    public static void main(String[] args) {
        while (true) {
            // Show selection Menu
            int selection = showMainMenu();

            if (selection == 0) {
                addProduct();
            }
            else if (selection == 1) {
                viewInventory();
            }
            else if (selection == 2) {
                removeProduct();
            }
            // Exit the program
            else if (selection == 3) {
                break;
            }
        }

    }

    private static int showMainMenu() {
        String[] options = {"Add a new product", "View inventory", "Remove a product", "Exit"};

        int selection = JOptionPane.showOptionDialog(
                null,
                "Please select an option:",
                "INVENTORY MANAGEMENT SYSTEM",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        return selection;
    }

    private static void addProduct() {
        // Get product name, quantity and price
        String name = JOptionPane.showInputDialog(null, "Please enter the product name:");
        String quantityString = JOptionPane.showInputDialog(null, "Please enter the product quantity:");
        String priceString = JOptionPane.showInputDialog(null, "Please enter the product price:");

        try {
            // Parse the quantity and price 
            int quantity = Integer.parseInt(quantityString);
            Double price = Double.parseDouble(priceString);

            // Add the product to the inventory
            products[numProducts] = name.toUpperCase();
            quantities[numProducts] = quantity;
            prices[numProducts] = price;
            numProducts++;

            JOptionPane.showMessageDialog(null, "Product added successfully!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid quantity or price. Please try again.");
        }
    }

    private static void viewInventory() {
        // Add a label for the inventory
        String table = "";
        if(products[0] == null) {
         table = String.format("%-20s %-10s %-10s%n", "Product Name", "Quantity", "Price");
         table += String.format("%nNo items found.");
        } else {
         table = String.format("%-20s %-10s %-10s%n", "Product Name", "Quantity", "Price");
        }

        // Add each product to the invetory
        for (int i = 0; i < numProducts; i++) {
            String name = products[i];
            int quantity = quantities[i];
            Double price = prices[i];
            table += String.format("%-20s %-10d %-10.2f%n", name, quantity, price);
        }
        // Display the inventory
        JOptionPane.showMessageDialog(null, table);
    }
    private static void removeProduct() {
        // Check if there are products to remove
        if(products[0] == null) {
            JOptionPane.showMessageDialog(null, "Inventory is empty.");
            return;
        }
        // Get the product name from the user
        String name = JOptionPane.showInputDialog(null, "Please enter the product name:");

        // Search for the product in the inventory
        int index = -1;
        for (int i = 0; i < numProducts; i++) {
            if (products[i].equals(name.toUpperCase())) {
                index = i;
                break;
            }
        }

        // If the product was found, remove it from the inventory
        // pop product at index i and rearrange indexes
        if (index != -1) {
            for (int i = index; i < numProducts - 1; i++) {
                products[i] = products[i + 1];
                quantities[i] = quantities[i + 1];
                prices[i] = prices[i + 1];
            }
            numProducts--;
            JOptionPane.showMessageDialog(null, "Product removed successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Product not found. Please try again.");
        }
    }
}