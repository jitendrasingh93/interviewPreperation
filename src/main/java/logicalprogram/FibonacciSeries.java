package logicalprogram;

/**
 * Created by JitendraSingh on 03/11/17.
 */
public class FibonacciSeries {

    public static void fibonacciSeries(int n) {

        // series: 0,1,1,2,3,5,8,13,21,....

        int firstNumber = 0,  seconfNumber = 1 , thirdNumber = 0;
        System.out.println("Fibonacci Series is :");
        System.out.println(firstNumber + "\n" + seconfNumber);
        for (int i = 0; i<= n; i++) {
            thirdNumber = firstNumber + seconfNumber;
            System.out.println(thirdNumber);
            firstNumber = seconfNumber;
            seconfNumber = thirdNumber;
        }
    }

    public static void main(String[] args) {
        fibonacciSeries(5);
    }
}
