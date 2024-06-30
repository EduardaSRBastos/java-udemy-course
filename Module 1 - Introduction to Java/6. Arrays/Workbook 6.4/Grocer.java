import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.4).
        
        Scanner scan = new Scanner(System.in);        
        
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. \n");
        System.out.print("We have: " );
        for (String item : store) {
            System.out.print(item + " ");
        }
        System.out.println("\nWhat can I help you find?");
        String food = scan.nextLine();
        
        for (int i = 0; i < store.length; i++) {
            if (food.equals(store[i])) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
        System.out.println();
        scan.close();

    }
}
