package string;

/**
 * Created by JitendraSingh on 05/06/18.
 */


// Java code to illustrate how to reverse
// an array without affecting special characters.

public class ReverseStr {

    public static void reverse(char [] arr) {
      int left = 0;
        int right = arr.length-1;

        while (right > left) {
            if (!Character.isAlphabetic(arr[left])) {
                left++;
            } else if (!Character.isAlphabetic(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
                left++;
            }
        }
    }


    public static void reverse() {

        String s = "adds fere fsf";
        String arr [] = s.split(" ");
        int j = 0;

        for (int i = 0; i<arr.length; i++) {
            String s1 = arr[i];
            char a[] = s1.toCharArray();
            int length = arr.length - 1;
            if (length >=j) {
                char c  = a[length];
                a[length] = a[i];
                a[i] = c;
                j++;
                length--;
            }
            char tmp = a[i];



        }
    }

    public static void main(String[] args) {

        String s = " ";
        System.out.println("check empty : "+s);

        reverse();

        String str = "a,b$c";

        System.out.println("input  : "+str);
        char strArr [] = str.toCharArray();
        reverse(strArr);
        System.out.println("reverse : "+ new String(strArr));
    }
}
