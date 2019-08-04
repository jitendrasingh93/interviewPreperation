package lamda_expressions;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by JitendraSingh on 04/02/18.
 */
public class LemdaExpression {

    // without lembda expression
    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {

        }
    };

    // using lembda expression
    Runnable runnable = () -> System.out.println("Hello lemda");

    public void test() {
        Runnable runnable = () -> System.out.println("lemda running");
        ArrayList<String> list = new ArrayList<>();
        list.iterator().next().equalsIgnoreCase("h");

    }
}
