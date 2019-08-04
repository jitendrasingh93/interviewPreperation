package multithreading.threadpool;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String msg) {
        this.message = msg;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "(start) message " + message);
        processMessage(); // call process message that sleep the thread for 5 second
        System.out.println(Thread.currentThread().getName() + " End ");
    }

    public void processMessage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
