package exceptionhandling;

import java.io.FileNotFoundException;

/**
 * Created by JitendraSingh on 16/10/17.
 */
public class A {

    void display() throws FileNotFoundException {
        System.out.println("parent class method");
    }
}

class B extends A {

    @Override
    void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("child class method");
    }
}