import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 – 4).\n");
        int index = scan.nextInt();

        // sell car here... 
        dealership.sell(index);

        scan.close();

        // ------------------------------------  EXERCISES -------------------------------------
        // Car nissan = new Car("Nissan", 10_000, 2020, "Green", new String[] {"Tires", "Keys"});
        // // nissan.make = "Nissan";
        // // nissan.price = 10_000;
        // // nissan.year = 2020;
        // // nissan.color = "Green";
        
        // Car dodge = new Car("Dodge", 11_000, 2019, "Blue", new String[] {"Tires", "Keys"});
        
        // Car nissan2 = new Car(nissan);
        // nissan2.setColor("Fuchsia");

        // nissan.setColor("Jet Black");
        // dodge.setColor("Yellow");

        // nissan.setPrice(nissan.getPrice() / 2);
        // dodge.setPrice(dodge.getPrice() / 2);


        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        // ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        // System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + 
        // ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        // ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        // nissan.drive();
        // nissan2.drive();
        // dodge.drive();

        // System.out.println(nissan.toString());
        // System.out.println(nissan2);
        // System.out.println(dodge.toString());

        // Car[] cars = new Car[] {
        //     new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
        //     new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
        //     new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
        //     new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
        //     new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        // };

        // Dealership dealership = new Dealership(cars);

        // cars[3].setColor("Blue");
    }
}