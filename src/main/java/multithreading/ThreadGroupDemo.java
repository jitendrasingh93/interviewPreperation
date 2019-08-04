package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class ThreadGroupDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup());
    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();

        ThreadGroup threadGroup = new ThreadGroup("Parent group");

        Thread t1 = new Thread(threadGroup, runnable,"one");
        t1.start();

        Thread t2 = new Thread(threadGroup, runnable, "two");
        t2.start();

        Thread t3 = new Thread(threadGroup, runnable, "three");
        t3.start();

        System.out.println("Thread group name : "+threadGroup.getName());
        threadGroup.list();
    }
}
