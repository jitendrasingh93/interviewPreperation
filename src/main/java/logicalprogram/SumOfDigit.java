package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 04/11/17.
 */
public class SumOfDigit {

    public static void sumOfDigit(int n) {
        int sum = 0, evenSum = 0;

        if (n % 2 == 0) {
            while (n > 0) {
                int remainder = n % 10;
                if (remainder % 2 == 0) {
                    evenSum = evenSum + remainder;
                }
                sum = sum + remainder;
                n = n / 10;
            }
            System.out.println("sum of digit : " + sum + "\n" + "sum of even digis : " + evenSum);
        } else {
            System.out.println(+n + " : odd number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        sumOfDigit(number);
    }
}