public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("\n-- Ask Java --\n");
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("INFO: \n>chemistryGrade - " + chemistryGrade + "\n>biologyGrade - " + biologyGrade);
        // Add if-else statement here
        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes, you did, congrats :)");
        } else {
            System.out.println("No, you did not :(");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("\nMe: Hi Java, did we make money?");
        System.out.println("INFO: \n>sales - " + sales + "\n>costs - " + costs);
        // Add if-else statement here
        if (sales > costs) {
            System.out.println("Congrats, you're rich!");
        } else {
            System.out.println("Not this time.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");
        System.out.println("INFO: \n>temperature - " + temperature + "\n>targetTemperature - " + targetTemperature);
        // Add if-else statement here
        if (temperature < targetTemperature) {
            System.out.println("Yes, it is. The temperature is colder than usual.");
        } else {
            System.out.println("No, it is not.");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        System.out.println("INFO: \n>currentSpeed - " + currentSpeed + "\n>speedLimit - " + speedLimit);
        // Add if-else statement here
        if (currentSpeed < speedLimit) {
            System.out.println("You are driving lower than the speed limit.");
        } else {
            System.out.println("Please slow down!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("\nMe: Hi Java, am I old enough to retire?");
        System.out.println("INFO: \n>age - " + age + "\n>retirementAge - " + retirementAge);
        // Add if-else statement here
        if (age >= retirementAge) {
            System.out.println("Enjoy your pension!");
        } else {
            System.out.println("You still have to work for " + (retirementAge - age) + " years.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("\nMe: Hi Java, did I get the best possible grade?");
        System.out.println("INFO: \n>myGrade - " + myGrade + "\n>bestGrade - " + bestGrade);
        // Add if-else statement here
        if (myGrade == bestGrade) {
            System.out.println("Congrats, you got the highest score!");
        } else {
            System.out.println("No, but you will next time!");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("\nMe: Are the two words the same?");
        System.out.println("INFO: \n>word - " + word + "\n>secondWord - " + secondWord);
        // Add if-else statement here
        if (word.equals(secondWord)) {
            System.out.println("They are the same.");
        }else {
            System.out.println("They are not.");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("\nMe: Are the two words different");
        System.out.println("INFO: \n>thirdWord - " + thirdWord + "\n>fourthWord - " + fourthWord);
        // Add if-else statement here
        if (!thirdWord.equals(fourthWord)) {
            System.out.println("They are indeed different.");
        }else {
            System.out.println("No, they are not.");
        }
        System.out.println();
    }
}
