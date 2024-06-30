import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        System.out.println();
        try {
            FileInputStream file = new FileInputStream("greetings.txt");
            Scanner scan = new Scanner(file);
            System.out.println(scan.nextLine());
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Complete...\n");
        }
    }
    
}