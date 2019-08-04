package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class JoinMethod extends Thread {
    @Override
    public void run() {

        for (int i = 1; i<=5; i++) {
                try {
                    Thread.sleep(500);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    public static void main(String[] args) {
        JoinMethod t1 = new JoinMethod();
        JoinMethod t2 = new JoinMethod();
        JoinMethod t3 = new JoinMethod();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
