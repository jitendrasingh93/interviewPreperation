package multithreading;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class CallRunMethodDirectly extends Thread {

    @Override
    public void run() {

        for (int i = 0; i<=5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(+i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        CallRunMethodDirectly obj = new CallRunMethodDirectly();
        CallRunMethodDirectly obj1 = new CallRunMethodDirectly();
        obj.run();
        obj1.run();
    }
}
