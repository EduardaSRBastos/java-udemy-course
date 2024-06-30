import model.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        System.out.print("\nThe traffic light is red.\nWhat should I do? ");
        car.drive(Car.TrafficLight.RED);
        System.out.println();
    }

}
