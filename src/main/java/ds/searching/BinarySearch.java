package ds.searching;

import utility.CommontUtil;

/**
 * Created by JitendraSingh on 10/08/18.
 */
public class BinarySearch {

    private static int binarySerach(int arr[], int l, int r, int element) {

        if (r >= l) {
            int mid = l + (r-l)/2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == element)
                return arr[mid];

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > element)
                return binarySerach(arr, l, mid-1, element);

            // Else the element can only be present
            // in right subarray
            return binarySerach(arr, mid+1, r, element);
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr [] = {1, 0, 6, 9, 3, 2};
        int n = arr.length-1;
        int searchElement = 2;
        int newArr [] = CommontUtil.sortArry(arr);
        int result = binarySerach(newArr, 0, n, searchElement);
        System.out.println("search element in arr : "+result);

    }
}
