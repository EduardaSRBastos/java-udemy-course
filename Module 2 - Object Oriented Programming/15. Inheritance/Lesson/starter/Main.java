import product.Shirt;
import static product.Shirt.Size.*;

import product.Pants;
import product.Product;

public class Main {

    public static void main(String[] args) {
        Shirt shirt = new Shirt(SMALL, 49.99, "BLUE", "NIKE");
        System.out.println(shirt);
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(32, 32, 79.99, "BLACK", "LEVI'S");
        System.out.println(pants);
        pants.fold();
        productStore(pants);
        System.out.println();
        
    }

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName() + ". Your total comes to $" + product.getPrice());
        product.wear();
    }

}
