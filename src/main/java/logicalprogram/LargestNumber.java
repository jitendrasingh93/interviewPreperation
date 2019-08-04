package logicalprogram;

/**
 * Created by JitendraSingh on 06/11/17.
 */
public class LargestNumber {

    public static int checkNumber(int n1, int n2 , int n3) {
        int lageNumber;
        if (n1 > n2 && n1 > n3) {
            lageNumber = n1;
        }
        if (n2 > n3) {
            lageNumber = n2;
        } else {
            lageNumber = n3;
        }
        return lageNumber;
    }
    public static void main(String[] args) {
        System.out.println("large number is : "+checkNumber(7,5,9));
    }
}
