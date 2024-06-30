public class Variables {
    public static void main(String[] args) {
        int passengers = 8;
        int busTickets = passengers;
        int maxValue = 2147483647;

        System.out.println("\nMaximum value of integer variable type: " + 
        maxValue);
        System.out.println("\nNumber of passengers: " + passengers);
        System.out.println("All passengers have bus tickets: " +
        (busTickets == passengers));
        System.out.println();
    }
}