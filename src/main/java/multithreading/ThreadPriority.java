package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class ThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println("Current Thread is running Name : "+Thread.currentThread().getName());
        System.out.println("Current thread priority : "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        //ThreadPriority t3 = new ThreadPriority();

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
