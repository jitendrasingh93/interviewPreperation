package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 07/11/17.
 */
public class PalindromNumber {
    public static int ifNumberIsPalindrom(int n) {

        //int s = 121;
        //for (int i = 1; i <= number; i++) {
            int temp = 0;
            //int n = i;

            while (n> 0) {
                int r = n % 10;
                temp = temp * 10 + r;
                n = n / 10;
            }
            if (n == temp) {
                System.out.println("palindrom number : "+temp);
            }
        return temp;
        }
   //121 }

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int nm = ifNumberIsPalindrom(n);
        if (nm == n) {
            System.out.println("Palindrom : "+n);
        } else {
            System.out.println("Not Palindrom : "+n);
        }
    }
}
