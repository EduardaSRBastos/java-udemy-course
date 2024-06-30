public class Meeting {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.4 to access the link).

        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 
        double capital = 0.0;

        System.out.println("\n--Store Capital-- \n");
        System.out.println("This month, we made $" + (int)sales + " in sales.");
        capital += sales;
        System.out.println("Factoring in costs, we made $" + (int)profit + " in profit.");
        capital += profit;
        System.out.println("The refunds are at a low $" + (int)refunds + ". This is a good sign!");
        capital -= refunds;
        System.out.println("Shipping costs were high. We paid $" + (int)shipping + " in shipping.");
        capital -= shipping;
        System.out.println("Store Total Capital: $" + (int)capital);
        System.out.println();

    }
}
