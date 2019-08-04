package algorithms;

/**
 * Created by JitendraSingh on 11/01/18.
 */
public class BubbleSort {

    public void bubblesort(int arr[]) {

        int n = arr.length-1;

        for (int i = 0; i < n; i++) {
            for (int j = 0;j < n-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printSortedArr(int arr[]) {
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr [] = {3,12,345,22,9};
        System.out.println("Sorted array : ");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubblesort(arr);
        bubbleSort.printSortedArr(arr);
    }
}
