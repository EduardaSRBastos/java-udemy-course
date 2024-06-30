public class Receipt {
    public static void main(String[] args) {

        // See instructions on Learn the Part (Workbook 6.8)
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        Double[] prices = {1.99, 1.49, 1.29};

        System.out.println("\nHere's your receipt:\n");

        for (int i = 0 ; i < apples.length; i++) {
            System.out.println("\t" + apples[i] + ": $" + prices[i]);
        }
        System.out.println();
    }
}
