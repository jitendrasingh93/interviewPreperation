package interface_exp;

import opps.abstraction.TestInterface;

/**
 * Created by JitendraSingh on 11/04/18.
 */
public class MultipleInterfaceExtends extends TestClassInterface implements InterfaceOne {

    @Override
    public void method1() {
        System.out.println("method1 intrface");
    }

    @Override
    public void interfaceThree(int x, int y) {

    }

    @Override
    public void method2() {

    }

    public static void main(String[] args) {
        MultipleInterfaceExtends obj = new MultipleInterfaceExtends();
        obj.method1();
    }
}
