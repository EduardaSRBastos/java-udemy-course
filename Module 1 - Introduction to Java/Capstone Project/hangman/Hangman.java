import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
        "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
        "wombat", "zebra"};

    public static String[] gallows = {
        "+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "/    |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choosenWord = randomWord(words);
        char[] placeholders = new char[choosenWord.length()];

        for (int i = 0; i < choosenWord.length(); i++) {
             placeholders[i] = '_';
        }

        System.out.println("\n\t.-- Welcome to the Hangman Game! -..\n");
        System.out.println("Theme: Animals.");
        System.out.println("Press anything to start...");
        scan.nextLine();
        System.out.println();

        int miss = 0;
        char[] missesChar = new char[7];
        char guess = ' ';
        while (miss < 6) {
            System.out.println(gallows[miss]);
            System.out.print("Word: ");
            printPlaceholders(placeholders);
            System.out.print("\n\nMisses:");
            printMissedGuesses(missesChar);
            System.out.print("\n\nGuess: ");
            guess = scan.next(".").charAt(0);
            System.out.println();

            if(checkGuess(choosenWord, guess)) {
                updatePlaceholders(choosenWord, placeholders, guess);
            } else {
                miss++;
                missesChar[miss] = guess;
            }

            if (Arrays.equals(placeholders, choosenWord.toCharArray())) {
                System.out.print(gallows[miss]);
                System.out.print("\nWord:   ");
                printPlaceholders(placeholders);
                System.out.println("\nGOOD WORK!\n");                
                break;
            }
        }

        if (miss == 6) {
            System.out.print(gallows[6]);
            System.out.println("\nRIP!");
            System.out.println("\nThe word was: '" + choosenWord + ".\n");
        }

        scan.close();
        
    }

    public static String randomWord(String[] words) {
        int t = (int)(Math.random() * words.length);
        String word = words[t];
        return word;
    }

    public static boolean checkGuess(String word, char guess) {
        char[] wordChars = word.toCharArray();

        for (char wordChar : wordChars) {
            if (guess == wordChar) {
                return true;
            }
        }
        return false;
    }

    public static void updatePlaceholders(String choosenWord, char[] placeholders, char guess) {
        char[] wordChars = choosenWord.toCharArray();

        for (int i = 0; i < placeholders.length; i++) {
            if(guess == wordChars[i]) {
                placeholders[i] = guess;
            }
        }

    }

    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(placeholders[i] + " ");
        }
    }

    public static void printMissedGuesses(char[] misses) {
        for (int i = 0; i < misses.length; i++) {
            System.out.print(misses[i] + " ");
        }
    }

}





