package multithreading;

/**
 * Created by JitendraSingh on 18/04/18.
 */

/*
*  How would serve the alternative things(coffee, Tea, Milk) given by three threads.
* */
public class CoffeeTeeMilk {

    private volatile int count = 1;
    private volatile int threadIdCount =1;
    private Object threadObject = new Object();

    static void coffee() {
        System.out.println("Coffee");
    }

    static void tee() {
        System.out.println("Tee");
    }

    static void milk() {
        System.out.println("Milk");
    }

    class PrintThred implements Runnable {

       private int threadId;

        public PrintThred(int threadId) {
            super();
            this.threadId = threadId;
        }
        @Override
        public void run() {
           startThread(threadId);
        }
    }
    public void startThread(int threadId) {

        try {
            while (count <= 20) {
                synchronized (threadObject) {
                    if (threadId != threadIdCount) {
                        threadObject.wait();
                    } else {
                        System.out.println("Thread " + threadId + " printed " + count);
                        count += 1;
                        if (threadId == 1) {
                            threadIdCount = 2;
                            CoffeeTeeMilk.coffee();
                        }else if (threadId == 2) {
                            CoffeeTeeMilk.milk();
                            threadIdCount = 3;
                        }else if (threadId == 3) {
                            threadIdCount = 1;
                            CoffeeTeeMilk.tee();
                        }
                        threadObject.notifyAll();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CoffeeTeeMilk obj = new CoffeeTeeMilk();
        Thread thread1 = new Thread(obj.new PrintThred(1));
        thread1.setName("jeetu");
        Thread thread2 = new Thread(obj.new PrintThred(2));
        Thread thread3 = new Thread(obj.new PrintThred(3));




        thread1.start();
        System.out.println("thread name : "+ thread1.getName());
        thread2.start();
        thread3.start();
    }
}
