package statickeyword;

/**
 * Created by jeetu on 01/09/17.
 */
public class StaticKeyWord {
    private static int a = 10;     //Inner classes can inherit static members that are not constant variables

    int b = 20;


    public StaticKeyWord() {

    }

    @Override
    public String toString() {
        return "StaticKeyWord [a="+a+",b="+b+"]";
    }

    static void staticMethod() {
        String s1 = "abc";
        String s2 = "bcd";
        System.out.print("string value -->> " +s1 + s2);
    }

    public void sum(int a, int b) {
        System.out.print("intiger ===>>> a= "+a+" b="+b);
    }

    public void sum(double a, double b) {
        System.out.print("double ===>>> a= "+a+" b="+b);
    }


    public static void main(String[] args) {

        staticMethod();
        System.out.println("value of a -->> " + a + "value of b -->> " + StaticKeyWord.a);

        StaticKeyWord staticKeyWord = new StaticKeyWord();
        staticKeyWord.sum(2,5);
        staticKeyWord.sum(2.4,2.03);


        StringBuilder builder = new StringBuilder();
        String s = "jeetu";
        String s1 = "aa" + builder.append("$$$$").toString() +s;
        System.out.print("string builder ==>> "+s1);
    }
    public class InnneClass {

        public void abc() {

        }

        //static {} compilation error

        //interface Interface {} compilation error

        public InnneClass() {

        }
        //Inner classes can declare instance initialization blocks
        {}
    }
}


class A {

    // inner calass
    class B extends  StaticKeyWord {

        // Inner classes cannot not be declare static members
        //static  int s = 10;  ***  compilation error

        //Inner classes can declare constant variables
        static final int j = 3; // Fine
    }
}
