import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("\nWelcome. Thank you for taking the survey.\n");

        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        counter++;

        System.out.print("\nHow much money do you spend on coffee? ");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.print("\nHow much money do you spend on fast food? ");
        double foodPrice = scanner.nextDouble();
        counter++;


        System.out.print("\nHow many times a week do you buy coffee? ");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.print("\nHow many times a week do you buy fast food? ");
        int foodAmount = scanner.nextInt();
        counter++;

        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("\nWeekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food.\n");

    }
}
