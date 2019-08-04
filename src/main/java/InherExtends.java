/**
 * Created by JitendraSingh on 07/04/18.
 */
public class InherExtends {
    public void methode1 () {
        System.out.println("method1");
    }
}

class AB extends InherExtends {
    void method2() {
        System.out.println("method2");
    }
}

class Xyz extends AB {
    public void mothode3() {
        System.out.println("method3");
    }
}

class Main {

    public static void main(String[] args) {

        int arr [] = {1,2,3,3};
        AB a =  new Xyz ();
        a.methode1();
        a.method2();


        for (int ad : arr) {
            System.out.println("value : "+ad);
        }
    }
}