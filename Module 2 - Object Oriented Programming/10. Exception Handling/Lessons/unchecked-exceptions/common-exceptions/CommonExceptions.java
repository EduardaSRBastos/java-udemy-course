import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {
        System.out.println();
        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        //System.out.println(grades[4]);
        System.out.println("Grade 3: " + grades[3]);

        System.out.println();
       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        // for (String name : names) {
        //     System.out.println(name.toUpperCase());
        // }

        System.out.print("Upper Case Names: ");
        for (String name : names) {
            if (name != null) {
                System.out.print(name.toUpperCase() + "  ");
            }
        }

        System.out.println("\n");
        //**************InputMismatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer: ");
        //scanner.nextInt();

        if (scanner.hasNextInt()) {
            scanner.nextInt();
        } else {
            scanner.next();
        }
        scanner.close();
        System.out.println();
    }
}