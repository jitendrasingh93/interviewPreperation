package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 05/11/17.
 */
public class OccurenceOfDigitInCube {

    public static int occurenceOfDigit(int number, int occurenceNumber) {
        int count = 0;
        int cube = number*number*number;
        System.out.println("Cube of "+number +": "+cube);
        int s = 123; //1860867
        while (cube > 0) {
            int remainder = cube%10;
            if (occurenceNumber == remainder) {
             count++;
            }
            cube = cube/10;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        System.out.println("Enter occurence number :");
        int occ = Integer.parseInt(sc.next());

        System.out.println("Number of occurence :"+occurenceOfDigit(n, occ));
    }
}
