import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

        Scanner scan = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int age = 0;
        String username = "";
        String city = "";
        String country = "";
        
        System.out.println("\n .--Welcome to JavaGram!--. \n\nLet's sign you up.");
        
        System.out.println("What is your first name?");
        firstName = scan.nextLine();
        
        System.out.println("What is your last name?");
        lastName = scan.nextLine();

        System.out.println("How old are you?");
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("Make a username");  
        username = scan.nextLine();
        
        System.out.println("What city do you live in?");
        city = scan.nextLine();

        System.out.println("What country is that?");
        country = scan.nextLine();
        
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println();
        scan.close();
        //close scanner. It's good practice :D ! 
    }
}
