public class LogicalOperators {
    public static void main(String[] args) {

        /**********************AND OPERATOR**********************/

        boolean hasDrivingLicense = true;
        boolean hasInsurance = true;

        System.out.println("\nINFO: \n- hasDrivingLicense: " + hasDrivingLicense + "\n- hasInsurance: " + hasInsurance);
        System.out.println("Can I drive?");

        // has License and Insurance: System.out.println("You can legally drive.");
        // otherwise: System.out.println("You cannot legally drive.");
        if (hasDrivingLicense && hasInsurance) {
            System.out.println("You can legally drive.");
        } else {
            System.out.println("You cannot legally drive.");
        }


        int age = 25;
        double income = 45000;

        System.out.println("\nINFO: \n- age: " + age + "\n- income: " + income);
        System.out.println("Am I eligible for a loan?");

        // is at least 21 and has an income of at least 40000 : System.out.println("You are eligible for a loan.");
        // otherwise: System.out.println("You are not eligible for a loan.");
        if (age >= 21 && income >= 40000) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }


        String inputUsername = "JohnDoe";
        String inputPassword = "password123";

        String correctUsername = "JohnDoe";
        String correctPassword = "password123";

        System.out.println("\nINFO: \n- inputUsername: " + inputUsername + "\n- inputPassword: " + inputPassword);
        System.out.println("Did I enter the username and password correctly?");

        // the inputted username and password are correct: System.out.println("Access granted!");
        // otherwise: System.out.println("Invalid username or password");
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Invalid username or password");
        }

        /**********************OR OPERATOR**********************/

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;

        System.out.println("\nINFO: \n- hasGoodPerformance: " + hasGoodPerformance + "\n- isLongTermEmployee: " + isLongTermEmployee);
        System.out.println("Am I eligible for the promotion?");

        // good performance or is a long term employee: System.out.println("The user is eligible for a promotion.");
        // otherwise: System.out.println("The user is not eligible for a promotion.");
        if (hasGoodPerformance || isLongTermEmployee) {
            System.out.println("The user is eligible for a promotion.");
        } else {
            System.out.println("The user is not eligible for a promotion.");
        }


        int userAge = 17;
        boolean isParentPresent = true;

        System.out.println("\nINFO: \n- userAge: " + userAge + "\n- isParentPresent: " + isParentPresent);
        System.out.println("Can I enter the venue?");

        // at least 18 or if parent is present: System.out.println("You can enter the venue.");
        // otherwise: System.out.println("You cannot enter the venue.");
        if (userAge >= 18 || isParentPresent) {
            System.out.println("You can enter the venue.");
        } else {
            System.out.println("You cannot enter the venue.");
        }


        int memberAge = 16;
        boolean hasMembership = false;

        System.out.println("\nINFO: \n- memberAge: " + memberAge + "\n- hasMembership: " + hasMembership);
        System.out.println("Can I access the service?");

        // at least 18 or has a membership: System.out.println("The user can access the service.");
        // otherwise: System.out.println("The user cannot access the service.");
        if (memberAge >= 18 || hasMembership) {
            System.out.println("The user can access the service.");
        } else {
            System.out.println("The user cannot access the service.");
        }


        /**********************NOT OPERATOR**********************/

        String option = "cash";

        boolean cashOrCredit = option.equals("cash") || option.equals("credit");

        System.out.println("\nINFO: \n- option: " + option + "\n- cashOrCredit: " + cashOrCredit);
        System.out.println("Can I pay with " + option + "?");

        // if payment option is NOT cash or credit: System.out.println("Please choose another payment option");
        // otherwise: System.out.println("Sold. Pleasure doing business with you!");
        if (!cashOrCredit) {
            System.out.println("Please choose another payment option");
        } else {
            System.out.println("Sold. Pleasure doing business with you!");
        }


        char letter = 'A';

        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');

        System.out.println("\nINFO: \n- letter: " + letter + "\n- isVowel: " + isVowel);
        System.out.println("Is the letter " + letter + " a consonant or a vowel?");

        // if letter is NOT a vowel: System.out.println("The letter " + letter + " is a consonant");
        // otherwise: System.out.println("The letter " + letter + " is a vowel");
        if (!isVowel) {
            System.out.println("The letter " + letter + " is a consonant");
        } else {
            System.out.println("The letter " + letter + " is a vowel");
        }


        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");

        System.out.println("\nINFO: \n- move: " + move + "\n- isHitOrStay: " + isHitOrStay);
        System.out.println("I made my move: " + move);

        // if move is NOT hit or stay: System.out.println("Please choose a valid move");
        // otherwise: System.out.println("You win 10 bucks!");
        if (!isHitOrStay) {
            System.out.println("Please choose a valid move");
        } else {
            System.out.println("You win 10 bucks!");
        }
        System.out.println();
    }
}
