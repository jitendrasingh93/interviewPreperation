package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class TestThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i<=10; i++) {
            Runnable t1 = new WorkerThread("Thread pool : " + i);
            executorService.execute(t1); //calling execute method of ExecutorService
        }
        executorService.shutdown();
        while (executorService.isTerminated()) {

        }
        System.out.println("Finished all thread");
    }
}
