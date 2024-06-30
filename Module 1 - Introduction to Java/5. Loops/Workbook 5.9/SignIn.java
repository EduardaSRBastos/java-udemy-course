import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below:\n");
        System.out.print("- Username: ");
        String userUsername = scan.nextLine();
        System.out.print("- Password: ");
        String userPassword = scan.nextLine();

        // see Learn the Part for the remaining instructions.
        
        while (!(username.equals(userUsername) && password.equals(userPassword))) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            userUsername = scan.nextLine();
            System.out.print("- Password: ");
            userPassword = scan.nextLine();
        }

        System.out.println("\nSign in successful.\nWelcome again, " + username + "!\n");
        scan.close();
        
    }
}
