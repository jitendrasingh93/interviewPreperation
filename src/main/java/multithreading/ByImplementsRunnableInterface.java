package multithreading;

/**
 * Created by JitendraSingh on 06/04/18.
 */
public class ByImplementsRunnableInterface implements Runnable{


    @Override
    public void run() {
        System.out.println("by implenting runnable interface.");
        method();
    }

    static void method() {
        System.out.println("hii thread");
    }
}

 class MyClass {

    public static void main(String[] args) {

        ByImplementsRunnableInterface runnable = new ByImplementsRunnableInterface();
        Thread thread = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        thread.start();
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hjh: "+t2.getName());
        t2.start();
        ByImplementsRunnableInterface.method();

    }
}
