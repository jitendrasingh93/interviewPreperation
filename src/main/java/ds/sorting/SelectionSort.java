package ds.sorting;

/**
 * Created by JitendraSingh on 24/07/18.
 */
public class SelectionSort {

    static void sortArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 8, 5, 3, 4};
        int n = arr.length;

        System.out.println("Before sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sortArray(arr, n);
        System.out.println("sorted array : ");
        printArray(arr, n);
    }
}
