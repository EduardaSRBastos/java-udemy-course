import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExampleTwo {
    public static void main(String[] args) {
        System.out.println();
        try {
            readFile("greetings.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Complete...\n");
        }
    }
    
    public static void readFile(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}