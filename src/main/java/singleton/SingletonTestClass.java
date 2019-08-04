package singleton;

/**
 * Created by JitendraSingh on 02/06/19.
 */


/*
*
* @SingletonTestClass
* In Opp's Singleton class is a class that can have only one object at a time.
* */

public class SingletonTestClass {


    private static SingletonTestClass singletonTestClass = null;

    private String s;

    private SingletonTestClass() {
        s = "Create only single instance";
    }

    public static SingletonTestClass getSingletonTestClassObject() {
        if (singletonTestClass == null)
            singletonTestClass = new SingletonTestClass();
        return singletonTestClass;
    }

    public static void main(String[] args) {
        System.out.println("1st object created");
        SingletonTestClass s1 = getSingletonTestClassObject();
        System.out.println(s1.s);

        System.out.println("2nd object created");

        SingletonTestClass s2 = getSingletonTestClassObject();
        System.out.println(s2.s);

        s1.s = s1.s.toUpperCase();

        System.out.println("to Upper : "+s2.s);

    }
}
