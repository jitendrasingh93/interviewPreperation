package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class DeadLoack {

    public static void main(String[] args) {

        final String resource1 = "X";
        final String resource2 = "Y";

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("thread 1 locked resource 1" );

                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {

                    }

                    synchronized (resource2) {
                        System.out.println("thread 1 locked resource 2" );
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("thread 2 locked resource 2");

                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {

                    }
                }

                synchronized (resource1) {
                    System.out.println("thread 2 locked resource 1" );
                }
            }
        };


        thread1.start();
        thread2.start();
    }

}
