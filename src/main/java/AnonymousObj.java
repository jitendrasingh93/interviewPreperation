/**
 * Created by JitendraSingh on 16/11/17.
 */
public class AnonymousObj {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Annoymous class");
            }
        };
     runnable.run();
    }


    public void run() {
        System.out.println("Inside Run method");
    }
}
