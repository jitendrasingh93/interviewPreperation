package java_generics;

/**
 * Created by JitendraSingh on 16/05/18.
 */
public class GenericsMethods {

    /*
    * generics method to print all type array
    * accept all type array
    **/
    public static   <E> void printArry(E [] inArr) {
        for (E e : inArr) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String [] stringArray = {"john", "alex", "zoh", "mike"};

        System.out.println("Integer arr");
        printArry(intArray);

        System.out.println("Double arr");
        printArry(doubleArray);

        System.out.println("char arr");
        printArry(charArray);

        System.out.println("string arr");
        printArry(stringArray);
    }
}
