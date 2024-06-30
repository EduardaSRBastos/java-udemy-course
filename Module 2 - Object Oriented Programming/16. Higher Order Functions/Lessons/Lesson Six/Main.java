import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        Arrays.stream(greetings).forEach(greeting -> System.out.println(greeting));

        System.out.println();
        // Creating Stream from Datasource: File
        try {
            Path path = Paths.get("chorus.txt");
            Files.lines(path).forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
        
    }
}