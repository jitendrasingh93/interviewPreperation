package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 06/11/17.
 */
public class EvenOddNumber {

    public static void checkEvenOdd(int number) {
        if ((number&1) == 0) {
            System.out.println("number is even." +(number&2));
        } else {
            System.out.println("number is odd.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        checkEvenOdd(n);
    }
}
