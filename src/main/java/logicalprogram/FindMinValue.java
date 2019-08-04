package logicalprogram;

/**
 * Created by JitendraSingh on 07/11/17.
 */
public class FindMinValue  {

    //find the two min value in an array and both addition close to zero.

    public static void maxValue(int arr[]) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min1 > arr[i]) {
                min2 = min1;
                min1 = arr[i];
            } else if (min2 > arr[i]) {
                min2 = arr[i];
            }
        }
        System.out.println("min1 : "+min1);
        System.out.println("min2 : "+min2);
        System.out.println("close to zero : " +(min1+min2));
    }


    public static void main(String[] args) {
        int array[] = {3, 5, 7, 9, 30, 5, 1};
        maxValue(array);
    }
}
