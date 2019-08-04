package utility;

/**
 * Created by JitendraSingh on 17/08/18.
 */
public final class CommontUtil {

    public static int [] sortArry (int arr[]){

            int n = arr.length-1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
    }

    public static void printArray(int arr[]) {
        if (arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
