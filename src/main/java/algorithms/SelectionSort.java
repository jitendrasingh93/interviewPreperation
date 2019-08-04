package algorithms;

/**
 * Created by JitendraSingh on 10/01/18.
 */
public class SelectionSort {

    private int i,j;

    public void sort(int arr[]) {

        int n = arr.length;

        for (i = 0; i<n-1; i++) {
            int min_indx = i;
            for (j = i+1; j < n; j++) {
                if (arr[j] < arr[min_indx]) {
                    min_indx = j;
                    int tmp = arr[min_indx];
                    arr[min_indx] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public void printArr(int arr[]) {
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int ar[] ={23,12,20,34,2};
        System.out.println("Sorted array");
        SelectionSort obj = new SelectionSort();
        obj.sort(ar);
        obj.printArr(ar);
    }
}
