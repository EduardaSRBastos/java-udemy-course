import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Java Casino!\n");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        System.out.println("If you want to see the rules, type 'rules'.");
        
        //Task 3 – Wait for the user to press enter.
        String userResponse = scan.nextLine();

        if(userResponse.equals("rules")) {
            System.out.println("\n\t------------------------Rules------------------------\n" +
                    "First, it's the player's turn. The player can decide to hit or stay.\n" + //
                    "hit: draw another card.\n" + //
                    "stay: do nothing.\n" + //
                    "\n" + //
                    "If the player decides to hit, and their hand value exceeds 21, they go bust (lose).\n" + //
                    "Once the player decides to stay, the dealer reveals the hidden card.\n" + //
                    "Then, the dealer must hit until their total gets to 17. At 17 points or higher, the dealer's turn ends.\n" + //
                    "You win if your hand value is higher than the dealer's hand.\n" + //
                    "You win if the dealer goes bust (exceeds 21).\n" + //
                    "You lose if the dealer's hand value is higher than yours.\n");
            System.out.println("..Ready? Press anything to begin!");
            scan.nextLine();
        }

        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int userCard1 = drawRandomCard();
        int userCard2 = drawRandomCard();

        System.out.println("\n You get a: \n" + cardString(userCard1) + "\n and a: \n" + cardString(userCard2));
        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        int userTotal = Math.min(userCard1, 10) + Math.min(userCard2, 10);
        System.out.println("Your total is: " + userTotal);
        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();

        System.out.println("\nThe dealer shows: \n" + cardString(dealerCard1) + "\nand has a card facing down: \n" + faceDown());
        
        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("\nThe dealer's total is: hidden.");

        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        while (true) {
            String option = hitOrStay();

            if (option.equals("hit")) {
                int newCard = drawRandomCard();
                userTotal += Math.min(newCard, 10);
                System.out.println("\nYou get a: \n" + cardString(newCard));
                System.out.println("Your total is: " + userTotal);

                if (userTotal > 21) {
                    System.out.println("Bust! Player loses...");
                    System.exit(0);
                }
            }
            if (option.equals("stay")) {
                break;
            }
        }
        
        //For tasks 9 to 13, see the article: Blackjack Part II.
        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are: \n" + cardString(dealerCard1) + "\n and a: \n" + cardString(dealerCard2));
        System.out.println("Dealer's total is: " + dealerTotal);

        while (dealerTotal < 17) {
            int newCard = drawRandomCard();

            dealerTotal += Math.min(newCard, 10);
            System.out.println("\n Dealer gets a: \n" + cardString(newCard));
            System.out.println("Dealer's total is: " + dealerTotal);
        }
        
        if (dealerTotal > 21) {
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
        }

        if (userTotal > dealerTotal) {
            System.out.println("\nPlayer wins!");
        } else {
            System.out.println("\nDealer wins!");
        }

        System.out.println();
        scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

    public static int drawRandomCard() {
        int randomNumber = (int)(Math.random() * 13 + 1);
        return randomNumber;
    }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String cardString(int cardNumber) {
        switch(cardNumber) {
            case 1:   
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
            return"   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";

             default: return "not possible";
         }
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay() {
        String response = "";
        while (!(response.equals("hit") || response.equals("stay"))) {
            System.out.println("\nWould you like to hit or stay? \nPlease write 'hit' or 'stay'");
            response = scan.nextLine();
            response = response.toLowerCase();
        }
        return response;    
    }
}

