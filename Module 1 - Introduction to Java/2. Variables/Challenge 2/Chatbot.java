//import Scanner
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 
        
        //set up scanner. 
        Scanner scan = new Scanner(System.in);
        String name = "";
        String home = "";
        int age = 0;
        String language = "";

        System.out.println("\n... ChatBot ... \n");
        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        name = scan.nextLine();

        //add new a line before asking next question. 
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        //Pick up user's home and store it. 
        home = scan.nextLine();                

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle.");
        System.out.println("How old are you?");
        //Pick up age and store it.
        age = scan.nextInt();
        scan.nextLine();

        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        language = scan.nextLine();
        if(language.toLowerCase().equals("python")) {
            System.out.println("\nNooooo.... Just kidding.");
        }
        //add new a line here.
        System.out.println(language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        System.out.println();
        //close scanner. 
        scan.close();
        
    }
}
