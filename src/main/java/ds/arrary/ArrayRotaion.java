package ds.arrary;

/**
 * Created by JitendraSingh on 22/03/18.
 */
public class ArrayRotaion {
        /*Function to left rotate arr[] of size n by d*/
        void leftRotate(int arr[], int d, int n) {
            int i;
            for (i = 0; i < d; i++)
                leftRotatebyOne(arr, n);
        }

        void leftRotatebyOne(int arr[], int n) {
            int i, temp;
            temp = arr[0];
            for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[i] = temp;
        }

        /* utility function to print an array */
        void printArray(int arr[], int size) {
            int i;
            for (i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
        }

        // Driver program to test above functions
        public static void main(String[] args) {
            ArrayRotaion rotate = new ArrayRotaion();
            int arr[] = {1, 2, 3, 4, 5};
            rotate.leftRotate(arr, 4, 5);
            rotate.printArray(arr, 5);
        }

//hakerRank left rotation
   /* Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int d = scan.nextInt();
    int[] array = new int[n];
    for(int i=0; i<n;i++) {
        array[(i+n-d)%n] = scan.nextInt();
    }
    for(int i=0; i<n;i++) {
        System.out.print(array[i] + " ");
    }*/

    void s() {
        try {
            int i = 10 / 0; //will throw ArithmeticException
        } catch (ArithmeticException ae) {
            System.out.println("try-catch block handled - ArithmeticException");

            //using nested try-catch block
            try {
                String s = null;
                s.charAt(0); //will throw NullPointerException
            } catch (NullPointerException npe) {
                System.out.println("NESTED try-catch block handled - "
                        + "NullPointerException");
            }

        }
    }
}
