package comp_interview;

/**
 * Created by JitendraSingh on 21/05/18.
 */
public class FindElementInMatrix {

    static void getElement(int mat[][], int n, int x) {

        int i = 0, j = n-1;
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.println(x+" element found at : "+ "(" + i + ", "+j+") position");
                return;
            }

            if (mat[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(x+" element not found in a matrix");
    }

    public static void main(String[] args) {

        int mat[][] =
                {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        // find element x= 29
        getElement(mat, 4, 30);
    }
}
