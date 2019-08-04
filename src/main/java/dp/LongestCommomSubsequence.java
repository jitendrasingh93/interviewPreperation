package dp;

/**
 * Created by JitendraSingh on 01/05/18.
 */
public class LongestCommomSubsequence {

    public static int lsc(char [] X, char [] Y, int m , int n) {

        int  arr [][] = new int [m+1][n+1];
        for (int i = 1; i<= m; i++) {

            for (int j = 1; j<=n; j++) {

                 if (X[i-1] == Y[j-1]) {
                    arr[i][j] = arr[i-1][j-1]+1;
                } else {
                    arr[i][j] = max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        return arr[m][n];

    }

    public static int max(int a, int b) {

        return (a > b )? a : b;
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYA";

        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();

        System.out.println("lcs : "+lsc(x, y, s1.length(), s2.length()));
    }
}
