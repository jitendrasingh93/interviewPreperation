package ds.sorting;

/**
 * Created by JitendraSingh on 23/07/18.
 */
public class BubbleSort {

    // sort array
    static void sortArray(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    // print array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 8, 5, 3, 4};
        int size = arr.length;

        System.out.println("Before Sort array is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        sortArray(arr, size);
        System.out.println("After Sort array : ");
        printArray(arr, size);

    }
}

