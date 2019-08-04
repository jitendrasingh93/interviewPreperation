package logicalprogram;

/**
 * Created by JitendraSingh on 23/01/18.
 */
public class SerchElementUnsortedArray {

    static int findElement(int arr[], int n, int key) {

        for (int i = 0; i < n; i++) {
            if (key == arr[i])
                return i+1;
        }
        return -1;
    }

    static int insertElement(int arr[], int n, int key, int capacity) {
            if (n  >= capacity) {
                return n;
            }
            arr[n] = key;
        return n+1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 23, 2, 10, 29};
        int array[] = new int [10];
        array[0] = 12;
        array[1] = 42;
        array[2] = 3;
        array[3] = 11;
        array[4] = 87;
        array[5] = 1;
        array[6] = 6;
        int insN = 7;
        int capacity = 10;
        int key = 2;
        int insKey = 90;
        int n = arr.length;

        int position = findElement(arr, n, key);

        System.out.println("Element position of "+ key + " : "+position);

        System.out.println("\nBefore insertion : ");
        for (int i = 0; i < insN; i++) {
            System.out.println(array[i]);
        }

        insN = insertElement(array, insN, insKey, +capacity);
        System.out.println("\n after insertion array :");
        for (int i = 0; i<insN; i++) {
            System.out.println(+array[i]);
        }
        System.out.println("Insert Element "+ insKey +" in :" +insN +" position");
    }
}
