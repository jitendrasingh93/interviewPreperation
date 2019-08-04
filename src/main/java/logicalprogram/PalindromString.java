package logicalprogram;

import sun.tools.tree.Node;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 05/11/17.
 */
public class PalindromString {

    public static boolean palindromString(String inputString) {

        char arr [] = inputString.toCharArray();
        boolean isPalindrom = true;
        /*for (int i = 0, j = arr.length-1; i < (arr.length)/2; i++, j--) {
            if (arr[i] != arr[j]) {
                isPalindrom = false;
            }
        }*/
        int s=-1;
        int e = inputString.length();
        while(++s < --e){
            if(inputString.charAt(s) != inputString.charAt(e))
                return false;
        }
        return isPalindrom;
    }

    public static void main(String[] args) {
        System.out.println("Enter any String : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (palindromString(name)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }
    }
}
