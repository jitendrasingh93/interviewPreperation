package comp_interview;

/**
 * Created by JitendraSingh on 24/07/18.
 */
public class FindMidIndexOfLeftSumOrRightSum {

    static int[] prefixSum(int arr[], int n) {
        int prefix_Sum[] = new int[n];
        prefix_Sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix_Sum[i] =  prefix_Sum[i-1] + arr[i];
            //System.out.println("pre : "+prefix_Sum[i]);
        }
        return prefix_Sum;

    }

    static int[] suffixSum(int arr[], int n) {
        int suffix_Sum[] = new int[n];
        suffix_Sum[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffix_Sum[i] = suffix_Sum[i+1] + arr[i];
            //System.out.println("suffix : "+suffix_Sum[i+1]);
        }
        return suffix_Sum;
    }

    static int midPoint(int prefix_Sum[], int suffix_Sum[], int n) {
        for (int i = 0; i < n; i++) {
            if (prefix_Sum[i] == suffix_Sum[i]) {
                return i;
            }
        }
        return -1;
    }

    static void findAverage(int arr[], int n, int midElement) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0, j = n-1; i < midElement; i++,j--) {

        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 5};
        int n = arr.length;
        //prefixSum(arr, n);
        //suffixSum(arr, n);
        System.out.println("mid point index value : "+midPoint(prefixSum(arr, n), suffixSum(arr, n), n));
    }
}
