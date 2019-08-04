package immutable;

/**
 * Created by JitendraSingh on 04/10/17.
 */
public class Main {

    public static void main(String[] args) {

        Integer badaInteger = new Integer(10);
        String s = new String("Tao");
        ImmutableClass immutableClass = new ImmutableClass(s, badaInteger);

        System.out.println("name -->>" +immutableClass.getName());
        System.out.println("age -->>" +immutableClass.getAge());

        System.out.println("after changing value in mamber variable !!!.....");

        badaInteger = 12;
        s = "dada dokara saheb";

        System.out.println("after chaging name -->>" +immutableClass.getName());
        System.out.println("after changing age -->>" +immutableClass.getAge());

        System.out.println("object  => "+immutableClass.getImmutableClass().getName());
    }
}

