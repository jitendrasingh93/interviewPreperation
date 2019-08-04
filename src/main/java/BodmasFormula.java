import jdk.nashorn.internal.runtime.regexp.joni.constants.MetaChar;

/**
 * Created by JitendraSingh on 10/08/18.
 */
public class BodmasFormula {

    private static void equation(String equation) {


    }

    public static boolean ifCheckBreacket(String equation) {
        // [(1+2)]
        char ar [] = equation.toCharArray();
        String regex = "(-?[\\d\\.]+)(\\x)(-?[\\d\\.]+)";
        boolean perLeft = false;
        boolean perRight = false;
        boolean curlLeft = false;
        boolean curlRight = false;
        boolean bigLeft = false;
        boolean bigRight = false;

        int per = 0;
        int cur = 0;
        int big = 0;

        for (int i = 0; i < ar.length; i++) {
            char s = ar[i];

            switch (s) {

                case '(':
                    perLeft = true;
                    per++;
                    break;
                case ')':
                    perRight = true;
                    per++;
                    break;
                case '[':
                    bigLeft = true;
                    big++;
                    break;
                case ']':
                    bigRight = true;
                    big++;
                    break;
                case '{':
                    curlLeft = true;
                    cur++;
                    break;
                case '}':
                    curlRight = true;
                    cur++;
                    break;
                default:
                    break;
            }
        }


        if (perLeft == true && perRight == true && bigRight == false) {
            return false;
        }

        if (perLeft == true && perRight == true && bigLeft == false) {
            return false;
        }
        if (perLeft == true && perRight == true && bigLeft == true && bigRight == true && curlRight == false) {
            return false;
        }

        if (perLeft == true && perRight == true && bigLeft == true && bigRight == true && curlLeft == false) {
            return false;
        }

        if (perLeft == true && perRight == true) {
            return true;
        }
        if (perLeft == true && bigLeft == true && bigRight == true) {
            return false;
        }

        if ( curlLeft == true && curlRight == true && perRight == true) {
            return false;
        }

        if ( curlLeft == true && curlRight == true && perLeft == false) {
            return true;
        }

        if ( curlLeft == true && curlRight == true) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        String s = "{(1 + 2)}";
        System.out.println("value : "+ifCheckBreacket(s));
    }
}
