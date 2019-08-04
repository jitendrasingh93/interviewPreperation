import java.util.Scanner;

/**
 * Created by JitendraSingh on 30/10/17.
 */
    class A {
        int b=10;
        public A() {
            this.b=7;
        }
        static void f(String s) {
        }

         void f(int a) {

        }
    }
    class B extends A {


        //int b;

    }
    public class Test1 {
        public static void main(String[] args) {

            String s1 = "abc"; //pool ,literal
            String s2 = new String("abc"); //heap
            String s3 = new String("hhhh").intern(); //
            A a = new B();
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));


            System.out.println("Enter the number of elements for fibonacci : ");
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            for (int i=1; i<=n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        static int fibonacci(int num) {
            if (num == 1) {
                return 0;
            } else if (num == 2) {
                return 1;
            }else {
                return fibonacci(num-1) + fibonacci(num-2);
            }
        }

    }

