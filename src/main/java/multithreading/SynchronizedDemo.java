package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
 class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i<=10; i++) {
            System.out.println(n*i);
        }
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {
        Table.printTable(1);
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        Table.printTable(10);
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        Table.printTable(100);
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        Table.printTable(1000);
    }
}

public class SynchronizedDemo {

    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        MyThread4 thread4 = new MyThread4();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}