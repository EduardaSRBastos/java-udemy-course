import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        City paris = new City("Paris", 2161000);
        City copy = new City(paris);
        System.out.println();
        System.out.println("Is Paris on the list of cities? " + paris.equals(copy));
        copy.setPopulation(2059003);
        //paris.setPopulation(3129003);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));
        
        System.out.println("Is Paris on the list of cities? " + cities.contains(paris));
        System.out.println();
    }

}