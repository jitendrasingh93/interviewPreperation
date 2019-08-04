package opps.abstraction;

/**
 * Created by JitendraSingh on 26/09/17.
 */
public class Test extends AbstructClass {

    public static void main(String[] args) {
        //Test test1 = new Test();
        AbstructClass test2 = new Test(); // is this correct ? This is upcasting
        test2.show();
        System.out.println("i value---...!!!!" + test2.i);
    }

    void show() {
        System.out.println("Show() method....!!!!");
    }

    public void demo1() {

    }
}
