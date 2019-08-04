package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 04/11/17.
 */
public class PrimeNumber {

    public static void primeNumber(int number) {
        boolean isPrime = true;
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        primeNumber(n);
    }
}
