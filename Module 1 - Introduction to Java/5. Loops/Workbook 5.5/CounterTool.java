import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nI hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.
       System.out.print("1. Pick a number to count by: ");
       int firstNumber = scan.nextInt();

       System.out.print("2. Pick a number to start counting from: ");
       int secondNumber = scan.nextInt();

       System.out.print("3. Pick a number to count to: ");
       int thirdNumber = scan.nextInt();
       System.out.println();

       for (int i = secondNumber; i <= thirdNumber; i += firstNumber) {
        System.out.print(i + " ");
       }

       System.out.println("\n");
        scan.close();
    }
}
