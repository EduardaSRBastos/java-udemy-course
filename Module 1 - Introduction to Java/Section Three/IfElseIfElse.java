public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "rainy";
        System.out.println("\n-If Else: ");
        System.out.println("\nWhat to do with this weather?");
        
        // sunny: System.out.println("It's a nice day for a walk.");
        // rainy: System.out.println("Bring an umbrella!");
        // otherwise: System.out.println("Not sure what to do in this weather.");

        if (weather.equals("sunny")) {
            System.out.println("It's a nice day for a walk.");
        } else if (weather.equals("rainy")) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("Not sure what to do in this weather.");
        }


        int score = 85;

        System.out.println("\nWhat was my score?");

        // 80 and above: System.out.println("You got an A!");
        // 70 and above: System.out.println("You got a B!");
        // 60 and above: System.out.println("You got a C.");
        // 50 and above: System.out.println("You got a D.");
        // Otherwise: System.out.println("You failed :(");

        if (score >= 80) {
            System.out.println("You got an A!");
        } else if (score >= 70) {
            System.out.println("You got a B!");
        } else if (score >= 60) {
            System.out.println("You got a C.");
        } else if (score >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You failed :(");
        }


        String jobTitle = "manager";

        System.out.println("\nWhat is my role?");

        // CEO: System.out.println("You're the boss!");
        // manager: System.out.println("You're in charge of a team.");
        // Otherwise: System.out.println("You're an employee.");

        if (jobTitle.equals("CEO")) {
            System.out.println("You're the boss!");
        } else if (jobTitle.equals("manager")) {
            System.out.println("You're in charge of a team.");
        } else {
            System.out.println("You're an employee.");
        }


        char grade = 'B';

        System.out.println("\nHow is my grade?");

        // A: System.out.println("Excellent work!");
        // B: System.out.println("Good job!");
        // C: System.out.println("You did okay.");
        // D: System.out.println("Hey, you still passed!");
        // Otherwise: System.out.println("You failed :(");
        
         if (grade == 'A') {
            System.out.println("Excellent work!");
        } else if (grade == 'B') {
            System.out.println("Good job!");
        } else if (grade == 'C') {
            System.out.println("You did okay.");
        } else if (grade == 'D') {
            System.out.println("Hey, you still passed!");
        } else {
            System.out.println("You failed :(");
        }

        System.out.println();
    }
}
