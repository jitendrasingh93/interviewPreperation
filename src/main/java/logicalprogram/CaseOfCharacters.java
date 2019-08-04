package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 06/11/17.
 */
public class CaseOfCharacters {
    static {
        System.out.println("hello");
    }
    public static String toChaeckCharactersCase(String ch) {
        char ar[] = ch.toCharArray();

       for (int i = 0; i < ar.length; i++) {
         /*   char a = arr[i];
            System.out.println("sss "+arr[i]);
        }*/

           if (ar[i] >= 65 && ar[i] <= 90) { //convert upperCase to lowerCase
               ar[i] += 32;
           } else if (ar[i] >= 97 && ar[i] <= 122) {  //convert lowerCase to upperCase.
               ar[i] -= 32;
           }
       }
        return new String(ar);
    }

    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("case of characters : "+toChaeckCharactersCase(s));
    }
}
