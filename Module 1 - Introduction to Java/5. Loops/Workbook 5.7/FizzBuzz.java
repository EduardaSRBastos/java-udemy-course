public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("\nFizz: Divisible by 3");
        System.out.println("Buzz: Divisible by 5");
        System.out.println("FizzBuzz: Divisible by 3 and 5\n");
        // See Learn the Part for detailed instructions.
        for (int i = 1; i <= 20; i++) {
            
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
        System.out.println();
    }

}
