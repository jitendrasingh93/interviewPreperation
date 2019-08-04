package string;

/**
 * Created by JitendraSingh on 23/10/17.
 */
public class StringPalindrom {

    public static void main(String[] args) {
        String s = "abc";
        String reversse = "";
        for (int i = s.length()-1 ; i >0 ; i--) {

            reversse += s.charAt(i);
        }
        if (s.equalsIgnoreCase(reversse)) {
        System.out.println("Yes");
    } else {
            System.out.println("No");
        }
    }

}
