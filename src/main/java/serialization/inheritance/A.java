package serialization.inheritance;

import java.io.Serializable;

/**
 * Created by JitendraSingh on 25/09/17.
 */
public class A {

    public   int i;
    public A(int i) {
        this.i = i;
    }

    // default constructor
    // this constructor must be present
    // otherwise we will get runtime exception
    public A()
    {
        i = 50;
        System.out.println("A's class constructor called");
    }
}
