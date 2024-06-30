import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        System.out.println("\nGuess the Number \n");
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
            
        Scanner scan = new Scanner(System.in);
        
        //See Learn the Part for detailed instructions.
        int userGuess = 0;
        int secret = (int)(Math.random() * 5 + 1);

        userGuess = scan.nextInt();

        while (userGuess != secret) {
                System.out.print("Guess again: ");
                userGuess = scan.nextInt();
        }

        System.out.println("You got it! It is " + secret);
        System.out.println();
        scan.close();
    }

}
