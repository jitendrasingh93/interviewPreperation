package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class DemonThread extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demon thread");
        } else {
            System.out.println("User thread");
        }
    }

    public static void main(String[] args) {
        DemonThread t1 = new DemonThread();
        DemonThread t2 = new DemonThread();
        DemonThread t3 = new DemonThread();

        //now t1 is daemon thread
        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
