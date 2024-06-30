public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.
        System.out.println("\n>Even or Odd \n");
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
            System.out.println(i + " - even");
            } else {
            System.out.println(i + " - odd");
            }
        }
        System.out.println();
    }
}
