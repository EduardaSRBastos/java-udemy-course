public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 3;   //3rd day of the week...
        boolean holiday = true;
        System.out.println("\n Work Schedule - Wednesday\n");
        if (holiday) {
            System.out.println("Woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("It's the weekend, no work!");
        } else if (day >= 1 && day <= 5 ) {
            System.out.println("Wake up at 7:00 :(");
        } else {
            System.out.println("Invalid day value.");
        }
        System.out.println();
    }
}
