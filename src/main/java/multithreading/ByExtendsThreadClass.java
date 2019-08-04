package multithreading;

/**
 * Created by JitendraSingh on 06/04/18.
 */
public class ByExtendsThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("by using extends thread class");
        System.out.println("current thred : "+Thread.currentThread().getName());
        //super.run();
    }

}

class MyThreadClass {
    public static void main(String[] args) {

        System.out.println("current thread main : "+Thread.currentThread().getName());

        ByExtendsThreadClass threadClass = new ByExtendsThreadClass();


        //Thread thread1 = new Thread(threadClass);
        threadClass.start();

        try {
            threadClass.sleep(5000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Thread thread2 = new Thread(threadClass);
        thread2.start();
    }


}
