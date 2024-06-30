public class Bus {
    public static void main(String[] args) throws InterruptedException {
        int passengers = 0;

        System.out.println("\nBus is leaving.");
        System.out.println("Number of passengers: " + passengers);
        Thread.sleep(2000);
        System.out.println("\nNext stop: Parliament");
        passengers += 9;
        System.out.println("Number of passengers: " + passengers);
        Thread.sleep(2000);
        System.out.println("\nNext stop: Lidder River");
        passengers -= 5;
        passengers += 3;
        System.out.println("Number of passengers: " + passengers);
        Thread.sleep(2000);
        System.out.println("\nNext stop: Skating Rink");
        passengers -= 4;
        passengers += 2;
        System.out.println("Number of passengers: " + passengers);
        Thread.sleep(2000);
        System.out.println("\nLast stop: Terminal");
        passengers -= 5;
        System.out.println("Number of passengers: " + passengers);
        System.out.print("\n");
    }
}
