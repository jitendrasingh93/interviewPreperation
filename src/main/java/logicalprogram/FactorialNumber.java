package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 05/11/17.
 */
public class FactorialNumber {

    public static void factorialNumber(int number) {
        int fact = 1;
        //"5 = 1*2*3*4*5= 120"
        for (int i = 1; i<=number; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial is : "+fact);
    }

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        factorialNumber(n);
    }
}
