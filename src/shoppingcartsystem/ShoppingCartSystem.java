/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcartsystem;
import java.util.*;

/**
 *
 * @author bless
 */
public class ShoppingCartSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // List: Stores available products
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Keyboard");

        // Set: Stores unique products
        Set<String> categories = new HashSet<>();
        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Electronics");

        // Map: Stores product prices
        Map<String, Double> prices = new HashMap<>();
        prices.put("Laptop", 50000.0);
        prices.put("Mobile", 20000.0);
        prices.put("Headphones", 1500.0);
        prices.put("Keyboard", 1000.0);

        // Queue: Processes customer orders
        Queue<String> orders = new LinkedList<>();
        orders.add("Order101");
        orders.add("Order102");
        orders.add("Order103");

        // Display available products
        System.out.println("Available Products:");
        for (String product : products) {
            System.out.println(product + " - Rs." 
                               + prices.get(product));
        }

        // Display unique categories
        System.out.println("\nProduct Categories:");
        System.out.println(categories);

        // Shopping cart
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Headphones");

        double total = 0;
        System.out.println("\nShopping Cart:");

        for (String item : cart) {
            System.out.println(item + " - Rs." 
                               + prices.get(item));
            total += prices.get(item);
        }

        System.out.println("Total Amount: Rs." + total);

        // Process customer orders
        System.out.println("\nProcessing Orders:");
        while (!orders.isEmpty()) {
            System.out.println("Processing: " + orders.poll());
        }
    }
}
        // TODO code application logic here
    
    

