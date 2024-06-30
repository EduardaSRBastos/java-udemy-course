public class MathOperations {
    public static void main(String[] args) {

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; //250 billion
        long starsInAndromeda = 1_000_000_000_000L; // 1 trillion

        double testScore = 6.7;

        System.out.println("\nFred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets.");
        System.out.println("\nThere are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");

        System.out.println("\nFred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George.");
        System.out.println("\nThe Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way.");

        System.out.println("\nSnape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.25) + "/10.");
        System.out.println("\nSnape caught the error. Furious, he divided Ron's score to: " + (testScore / 2));
        
        System.out.println("\n10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("\n5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("\nCounter: " + counter);
        counter--;
        counter--;
        counter--;
        System.out.println("\nCounter: " + counter);
        System.out.println();

    }
}