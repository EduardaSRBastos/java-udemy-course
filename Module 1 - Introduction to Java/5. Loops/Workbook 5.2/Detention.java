import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nHi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        String answer = scan.nextLine();
        System.out.println();
        
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + ". " + answer);
        }
        
        System.out.println();
        scan.close();
    }
}
