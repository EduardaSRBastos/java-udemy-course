import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Eduarda";
        person.nationality ="portuguese";
        person.dateOfBirth = "28/01/2000";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 8;

        System.out.println();
        System.out.println("Name: " + person.name);
        System.out.println("Nationality: " + person.nationality);
        System.out.println("Date Of Birth: " + person.dateOfBirth);
        System.out.println("Passport: " + Arrays.toString(person.passport));
        System.out.println("Seat Number: " + person.seatNumber);
        System.out.println();
    }
}
