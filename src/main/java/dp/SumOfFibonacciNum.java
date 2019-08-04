package dp;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by JitendraSingh on 03/04/18.
 */
public class SumOfFibonacciNum {

    // sum of fibonacci series using recursion.
    // Fn = (Fn-1) + (Fn-2);

    static int fib(int n) {
        if (n<=1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum +fib(i);
            System.out.println(fib(i));
        }
        System.out.println("sum of fibonacci series : "+sum);

        List list = new LinkedList<>(); //non-generics
        list.add("sushil");
        list.add(2);

        List<String> list1 = new LinkedList<>(); //generics linked list
        list1.add("aa");

        List arrayList = new ArrayList<>();
        System.out.println("for arrayList =++++");
        arrayList.add("as");
        arrayList.add("1");
        arrayList.add(3);
        System.out.println("arr: " +arrayList);
        arrayList.remove(1);
        System.out.println("arr1: " +arrayList);
        arrayList.add("adad");
        System.out.println("arr1: " +arrayList);

        System.out.println("for linked list");

        list.add("jeetu");
        list.add("rajat");

        System.out.println("linked : "+list);
        list.remove(3);
        System.out.println("linked : "+list);

        List s = Collections.synchronizedList(list);




    }
}
