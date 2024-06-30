import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll;
        int score = 0;

        System.out.println("\nLet's play Rolling Java.\nType anything to start.");
        scan.nextLine();
        System.out.println("\nGreat, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.");
        System.out.println("- If you roll a 4, nothing happens.");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");      

        while (true) {
            scan.nextLine();
            diceRoll = rollDice();

            System.out.print("You rolled a " + diceRoll + ". ");

            if (diceRoll == 6) {
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                System.out.println("One point. Keep rolling."); 
                score++;   
            }
        }

        System.out.println("\nYour score is: " + score);

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :( ");
        }
        
        System.out.println();
        scan.close();
    }
  
    public static int rollDice() {
        int randomNumber = (int)(Math.random() * 6 + 1);

        return randomNumber;
    }
  
}
