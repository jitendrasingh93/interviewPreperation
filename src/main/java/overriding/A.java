package overriding;

/**
 * Created by JitendraSingh on 24/09/17.
 */
public class A {

   void test() {
       System.out.println("This is super class");
   }
}

class B extends A {

    @Override
    void test() {
        System.out.println("This is subclass");
    }

    void show() {
        System.out.println("show print");
    }


    public static void main(String[] args) {

        A a = new A();
        A a1 = new B();
        B b = new B();

        a.test();
        a1.test();
        b.show();
    }
}