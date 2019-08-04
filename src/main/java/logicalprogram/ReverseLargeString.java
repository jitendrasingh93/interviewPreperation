package logicalprogram;

import java.util.Scanner;

/**
 * Created by JitendraSingh on 07/04/18.
 */
public class ReverseLargeString {

    static void reveese(String text) {

        char [] charArray = text.toCharArray();
        char [] ch1 = new char[charArray.length];
        //char [] ch2 = new char[charArray.length];
        int j = 0;
        int lastIndex = 0;

        for (int i =charArray.length-1; i>= 0; i--) {
            System.out.print(charArray[i]);
        }


        System.out.println();
        for (int i =charArray.length-1; i>= 0; i--) {
            ch1[j] = charArray[i];
            if (i==0) {
                ch1[j+1] = ' ';
            }
            j++;
            if (ch1[j-1] == ' ' || lastIndex == i) {
                for (int l = j-1; l >= 0; l--) {
                    System.out.print(ch1[l]);
                }
                j=0;
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s = "my name is jeetu";
        Scanner sc = new Scanner(System.in);
       // String s = sc.next();
        System.out.println(s);
        reveese(s);
    }
}



