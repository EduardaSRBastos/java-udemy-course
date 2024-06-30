package src.main;

import src.main.models.Cart;
import src.main.models.Item;
import src.main.models.Store;

public class Main {


    public static void main(String[] args) {
        // Create instances of Cart, Item, and Store
        Cart cart = new Cart();
        Store store = new Store();

        // Add items to the store
        store.setItem(0, 0, new Item("Soda", 1.99));
        store.setItem(0, 1, new Item("Water", 0.99));
        store.setItem(0, 2, new Item("Juice", 2.49));
        store.setItem(1, 0, new Item("Chocolate Puff Rice", 3.99));
        store.setItem(1, 1, new Item("Chocapic", 2.99));
        store.setItem(1, 2, new Item("Nestum", 2.29));
        store.setItem(2, 0, new Item("Milk", 1.99));

        // Add items to the cart
        cart.add(new Item("Soda", 1.99));
        cart.add(new Item("Water", 0.99));

        System.out.println();
        // Print the contents of the cart
        System.out.println("Cart Contents:");
        System.out.println(cart);
        
        // Print the contents of the store
        System.out.println("Store Inventory:");
        System.out.println(store);

    }
 
}
