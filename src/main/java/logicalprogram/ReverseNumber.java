package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 03/11/17.
 */
public class ReverseNumber {

    public static int reverseNumber(int number) {
        int reverse=0;
        while (number > 0) {
            int r = number%10;
            number = number/10;
            reverse =reverse*10+r;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        System.out.println("Reverse Number is ; "+ reverseNumber(number));
    }
}
