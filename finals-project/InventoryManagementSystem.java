import javax.swing.*;

public class InventoryManagementSystem {
    // Inventory with capacity of 100 products
    private static String[] products = new String[100];
    private static int[] quantities = new int[100];
    private static Double[] prices = new Double[100];
    private static int numProducts = 0; // Index to map product to it's quantity and and  

    public static void main(String[] args) {
        while(true) {
            // Show selection Menu
            int selection = showMainMenu();

            switch(selection) {
                case 0:
                    addProduct();
                    break;
                case 1:
                    viewInventory();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    // Exit program
                    break;
                default:
                    // Handle invalid input
                    break;
            }
            if(selection == 3)
                break;
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
        String name = JOptionPane.showInputDialog(
            null, 
            "Please enter the product name:", 
            null, 
            JOptionPane.INFORMATION_MESSAGE);

        String quantityString = JOptionPane.showInputDialog(null, 
            "Please enter the product quantity:", 
            null, 
            JOptionPane.QUESTION_MESSAGE);

        String priceString = JOptionPane.showInputDialog(
            null, 
            "Please enter the product price:", 
            null, 
            JOptionPane.QUESTION_MESSAGE);

        try {
            int quantity = Integer.parseInt(quantityString);
            Double price = Double.parseDouble(priceString);

            // Add the product to the inventory
            products[numProducts] = name.toUpperCase();
            quantities[numProducts] = quantity;
            prices[numProducts] = price;
            numProducts++;

            JOptionPane.showMessageDialog(
                null, 
                "Product added successfully!", 
                null, 
                JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null, 
                "Invalid quantity or price. Please try again.",
                
                null, 
                JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void viewInventory() {
        // Add a label for the inventory
        String inventory = "";
        if(products[0] == null) {
         inventory = String.format("%-20s %-20s %-20s%n", "Products", "Quantity", "Price");
         inventory += String.format("%nNo items found.");
        } else {
         inventory = String.format("%-20s %-20s %-20s%n", "Products", "Quantity", "Price");
        }
        // Add each product to the invetory
        for (int i = 0; i < numProducts; i++) {
            String name = products[i];
            int quantity = quantities[i];
            Double price = prices[i];
            inventory += String.format("%-20s %-20d ₱%-20.2f%n", name, quantity, price);
        }
        // Display the inventory
        JOptionPane.showMessageDialog(null, inventory, "INVENTORY", JOptionPane.PLAIN_MESSAGE);
    }

    private static void removeProduct() {
        // Check if there are products to remove
        if(products[0] == null) {
            JOptionPane.showMessageDialog(
                null, 
                "No products found",
                "INVENTORY",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Get the product name from the user
        String name = JOptionPane.showInputDialog(
            null, 
            "Please enter the product name:", 
            null, 
            JOptionPane.QUESTION_MESSAGE);

        // Search for the product 
        int index = -1; // holds the index for the product to be removed
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(name.toUpperCase())) {
                index = i;
                break;
            }
        }

        // Remove product from the inventory
        // (reassigning values of array)
        if (index != -1) {
            for (int i = index; i < products.length; i++) {
                products[i] = products[i + 1];
                quantities[i] = quantities[i + 1];
                prices[i] = prices[i + 1];
            }
            numProducts--; // Decrement total number of products
            JOptionPane.showMessageDialog(
                null, 
                "Product removed successfully!", 
                null, 
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "Product not found. Please try again.",
                null,
                JOptionPane.WARNING_MESSAGE);
        }
    }
}