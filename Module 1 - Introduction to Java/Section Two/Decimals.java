public class Decimals {
    public static void main(String[] args) {
        double percentage = 73.5;
        double wallet = 20;
        int people = 3;

        System.out.println();
        System.out.println(percentage + "% of percentages are made up.");
        System.out.println("Amount (" + wallet + "$) per person (" + 
        people + "): " + String.format("%.2f",(wallet/people)) + "$.");
        System.out.println();
    }
}
