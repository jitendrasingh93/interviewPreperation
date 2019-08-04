package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 07/11/17.
 */
public class CapitalCaseVowelsInString {

    public static String capitalCaseVowelsInString(String s) {
        //String s = "jitendra";

        char [] arr = s.toCharArray();
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                arr [i] = (char) (arr[i] - (32));
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("new String  : "+capitalCaseVowelsInString(name));
    }
}
