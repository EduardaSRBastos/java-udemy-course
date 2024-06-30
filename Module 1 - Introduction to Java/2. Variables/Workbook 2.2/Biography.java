public class Biography {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.2 to access the link).

        // name (text)
        // age (whole number)
        // country (text)
        // sport (text)
        // game (text)
        // hours (whole number)
        // subject (text)
        // grade (character)
        String name = "Eduarda";
        int age = 23;
        String country = "Portugal";
        String sport = "swimming";
        String game = "Pokémon GO";
        int hours = 1;
        String subject = "Science";
        char grade = 'B';
     
        System.out.println("\n> My Biography < \n");
        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country + ".");
        System.out.println("My favourite sport is " + sport + ".");
        System.out.println("When I'm tired, I like to play " + game + ". I play for " + hours + " hour a day.");
        System.out.println("In school, my favourite subject was " + subject + ", I scored a " + grade + ".");
        System.out.println();
    }
}
