package logicalprogram;

import java.util.ArrayList;

/**
 * Created by JitendraSingh on 19/12/17.
 */
public class FindMissingNumInArray {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        int [] arr = {1,2,3,5,7,9,};
        int j = arr [0];
        int i;

        for (i = 0; i < arr.length; i++) {
            if (j == arr[i]) {
                j++;
            } else {
                array.add(j);
                j++;
                i--;
            }
        }
        System.out.println("Missing Number in array : \n");
        for (int a : array) {
            System.out.println(+a);
        }

        int[] arr1={7,5,6,1,4,2};
        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
        int[] arr2={5,3,1,2};
        System.out.println("Missing number from array arr2: "+missingNumber(arr2));
    }

    public static int missingNumber(int[] arr) {

        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum+=arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
