import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {

    static double[] TARGET = new double[] {0.5, 0.8, 0.3};
    static final double PRECISION = 0.000000001;

    static double result = 0;

    public static void main(String[] args) {

        //call generateNumber here...
        //calculate precision level here...
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        Future<Double> future2 = executor.submit(() -> generateNumber(0));
        Future<Double> future3 = executor.submit(() -> generateNumber(1));
        Future<Double> future4 = executor.submit(() -> generateNumber(2));

        // FutureTask<Double> future2 = new FutureTask<>(() -> generateNumber(0));
        // Thread thread2 = new Thread(future2);
        // FutureTask<Double> future3 = new FutureTask<>(() -> generateNumber(1));
        // Thread thread3 = new Thread(future3);
        // FutureTask<Double> future4 = new FutureTask<>(() -> generateNumber(2));
        // Thread thread4 = new Thread(future4);
        // thread2.start();
        // thread3.start();
        // thread4.start();

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Please enter a name to generate a number: ");
        // scan.nextLine();
        // scan.close();
        System.out.println("\nThreads: \n");
        try {
            //thread2.join();
            future2.get();
            future3.get();
            future4.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
        }

        //double precision = difference(result);

        System.out.println("Finished running background operations.");
        // System.out.println("The computer returned a value of: " + result);
        // System.out.println("The value was generated to a precision of : " + precision);
        System.out.println();
    }

    /**
     * Function name: generateNumber
     * @return double
     * 
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     * 
     */
    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);

        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number, index);
        }

        return number;
    }

    public static double difference(double number, int index) {
        return Math.abs(TARGET[index] - number);
    }

}
