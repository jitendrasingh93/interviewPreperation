package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 03/11/17.
 */
public class ReverseString {

    static String reverseString(String s) {
        int i,j;
        char [] arr = s.toCharArray();
        for (i = 0, j = arr.length-1; i< arr.length/2; i++,j--) {
            char temp = arr[i];
            arr [i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }
    public static void main(String[] args) {

        System.out.println("Enter any string : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Reverse String is ; "+ reverseString(name) );

        revStr();
    }


   static void revStr() {
        String str = "nitin";
        String rev ="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }
}
