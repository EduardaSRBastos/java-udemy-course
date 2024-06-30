import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("\nHi Timmy! Choose a number to count to: ");
        int number = scan.nextInt();
        System.out.println();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        scan.close();
    }
}
