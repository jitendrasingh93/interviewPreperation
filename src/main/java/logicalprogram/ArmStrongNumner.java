package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 05/11/17.
 */
public class ArmStrongNumner {

    //find armstrong number.
    /*
        An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself
        exp: 371= 3*3*3+7*7*7+1*1*1
     */

    public static int armstongNumber(int number) {
        int sum = 0;

        while (number > 0 ) {
            int r = number%10;
            int cube = r*r*r;
            sum = sum + cube;
            number = number/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (armstongNumber(n) == n) {
            System.out.println(+n+ " is armstrong number.");
        } else {
            System.out.println(+n + " is not armstrong number. ");
        }
    }
}
