import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class Main {

    static final String SALES = "data/sales.csv"; //Use backslash Windows users
    static double furnitureSales;
    static double techSales;
    static double officeSales;
    static double totalAverage;

    public static void main(String[] args) {
        
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());
            //calculate average sales of "Furniture" here
            //calculate average sales of "Technology" here
            //calculate average sales of "Office Supplies" here
            //calculate total average of sales here
            int nThreads = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(nThreads);
            Future<Double> future2 = executor.submit(() -> average(path, "Furniture"));
            Future<Double> future3 = executor.submit(() -> average(path, "Technology"));
            Future<Double> future4 = executor.submit(() -> average(path, "Office Supplies"));
            Future<Double> future5 = executor.submit(() -> totalAverage(path));

            // FutureTask<Double> future2 = new FutureTask<>(() -> average(path, "Furniture"));
            // Thread thread2 = new Thread(future2);
            // FutureTask<Double> future3 = new FutureTask<>(() -> average(path, "Technology"));
            // Thread thread3 = new Thread(future3);
            // FutureTask<Double> future4 = new FutureTask<>(() -> average(path, "Office Supplies"));
            // Thread thread4 = new Thread(future4);
            // FutureTask<Double> future5 = new FutureTask<>(() -> totalAverage(path));
            // Thread thread5 = new Thread(future5);
            
            // thread2.start();
            // thread3.start();
            // thread4.start();
            // thread5.start();

            Scanner scan = new Scanner(System.in);
            System.out.print("\nPlease enter your name to access the Global Superstore dataset: ");
            String name = scan.nextLine();
            
            try {
                furnitureSales = future2.get();
                techSales = future3.get();
                officeSales = future4.get();
                totalAverage = future5.get();

                System.out.println("\nThank you " + name + ". The average sales for Global Superstore are:\n");
                System.out.println("Average Furniture Sales: " + furnitureSales);
                System.out.println("Average Technology Sales: " + techSales);
                System.out.println("Average Office Supplies Sales: " + officeSales);
                System.out.println("Total Average: " + totalAverage);
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                executor.shutdown();
            }
            
            //System.out.println("Access Denied. We apologize for the inconvenience. Have a good day " + name + ".");
            
            scan.close();       
            
            // System.out.println("Average sales of Furniture: " + average(path, "Furniture"));
            // System.out.println("Average sales of Technology: " + average(path, "Technology"));
            // System.out.println("Average sales of Office Supplies: " + average(path, "Office Supplies"));
            // System.out.println("Total Average: " + totalAverage(path));
            System.out.println();
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Function name: average
     * @param path (Path)
     * @param category (String)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three String values.
     *   3. Filters every value by the @param category
     *   4. Maps every element in the stream to a double (price * quantity).
     *   5. Applies the terminal operation average.
     *   6. Returns the average as double.
     * 
     */
    public static Double average(Path path, String category) {
        try {
            return Files.lines(path)
                .skip(1)
                .map((line) -> line.split(","))
                .filter((values) -> values[0].equals(category))
                .mapToDouble((values) -> Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average().getAsDouble();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }


    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */
    public static Double totalAverage(Path path) {
        try {
            return Files.lines(path)
                .skip(1)
                .map((line) -> line.split(","))
                .mapToDouble((values) -> Double.parseDouble(values[1]) * Double.parseDouble(values[2]))
                .average().getAsDouble();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }


}
