package interface_exp;

/**
 * Created by JitendraSingh on 11/04/18.
 */
public interface InterfaceOne extends InterfaceTwo,InterfaceThree{

    String s = null;

    void method1();

    default int sd() {
        return 2+3;
    }

    static void st() {

    }
}
