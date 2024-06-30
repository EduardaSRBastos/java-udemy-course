import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    
    static AtomicInteger counter = new AtomicInteger(0);
    
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(55);
        //ReentrantLock lock = new ReentrantLock();
        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        for(int index = 0; index < 55; index++) {
            executor.submit(() -> task(latch));
        }
        
        // Thread thread1 = new Thread(() -> task(lock, latch));
        // Thread thread2 = new Thread(() -> task(lock, latch));
        // Thread thread3 = new Thread(() -> task(lock, latch));
        // Thread thread4 = new Thread(() -> task(lock, latch));

        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();

        try {
            // thread1.join();
            // thread2.join();
            // thread3.join();
            // thread4.join();

            latch.await();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
        }
        System.out.println("\nCounter: " + counter + "\n");
    }
    
    public static void task(CountDownLatch latch) {
        //some really long operations that need to run in the background...
        for (int i = 0; i < 10000; i++) {
            counter.addAndGet(1); // there happens to be a line that updates the counter variable. 
        }
        latch.countDown();
        //more really long operations...
    }
  
}
