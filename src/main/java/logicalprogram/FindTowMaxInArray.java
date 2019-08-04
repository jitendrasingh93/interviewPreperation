package logicalprogram;

/**
 * Created by JitendraSingh on 06/11/17.
 */
public class FindTowMaxInArray {

    public static void maxValue(int arr[]) {
        int max1 = 0, max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }

        System.out.println("max1 : "+max1);
        System.out.println("max2 : "+max2);
    }

    public static void main(String[] args) {
        int array [] = {3,5,1,9,30,5,0};
        maxValue(array);

    }
}
