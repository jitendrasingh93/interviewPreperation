package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 06/11/17.
 */
public class PerfectNumber {

    /*
    * perfect number 6 = 1+2+3
    * 28= 1+2+4+7+14
    * 496= 1+2+4+8+16+31+62+124+248
    * */
    public static int perfectNumber(int number) {
        int sum = 0;
        for (int i =1; i < number; i++) {
            int r = number % i;
            if (r == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (perfectNumber(n) == n) {
            System.out.println(+n +" is perfect number.");
        } else {
            System.out.println(+n +" is not a perfect number.");
        }
    }
}
