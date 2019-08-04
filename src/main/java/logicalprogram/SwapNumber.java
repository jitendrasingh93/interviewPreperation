package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 06/11/17.
 */
public class SwapNumber {

    public static void swap(int a, int b) {
        a = a+b; // a=6
        b = a-b; // b=2
        a = a-b; // a=4
        System.out.println("a= "+a + " b= "+b);
    }

    public static void main(String[] args) {
        System.out.println("Enter any two number : \n a = ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        System.out.println("b = ");
        int b = Integer.parseInt(sc.next());
        swap(a, b);
    }
}
