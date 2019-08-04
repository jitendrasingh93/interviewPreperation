package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class JoinMethodWithMilliSec extends Thread {

    @Override
    public void run() {
        for (int i = 1; i<=4; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JoinMethodWithMilliSec t1 = new JoinMethodWithMilliSec();
        JoinMethodWithMilliSec t2 = new JoinMethodWithMilliSec();
        JoinMethodWithMilliSec t3 = new JoinMethodWithMilliSec();

        t1.start();
        try {
            t1.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());

    }
}
