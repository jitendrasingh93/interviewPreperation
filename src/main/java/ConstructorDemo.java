/**
 * Created by JitendraSingh on 21/09/17.
 */

class SuperClass {
     SuperClass(int a) {
         System.out.println("no-arg constructor of SuperClass");

     }
}

class SubClass extends SuperClass {

    SubClass() {
        this(1);
        System.out.println("no-arg constructor of SubClass");

    }

    SubClass(int d) {
        super(1);
        System.out.println("int-arg constructor of SubClass");
    }
}
public class ConstructorDemo {

    public static void main(String[] args) {

        new SubClass(); //will call constructor
    }
}
