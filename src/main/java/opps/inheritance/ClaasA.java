package opps.inheritance;

/**
 * Created by JitendraSingh on 11/02/18.
 */
class ClassA {

    int z;

    public void addtion(int a, int b) {
        System.out.println("Addtion of two number : " + (a + b));
    }

    public void subtraction(int a, int b) {
        z= (a-b);
        System.out.println("Subtraction of two  number : " +z);
    }

     void m() {
        System.out.println("parent");
    }
}


class ClassB extends ClassA {

        public void multiplication(int x, int y) {
            z = x*y;
            System.out.println("Product of tow number : "+z);
        }
     void m() {
    System.out.println("chaild");
}

    public static void main(String[] args) {
        int a = 10, b = 20;
        ClassB obj = new ClassB();
        ClassA bb = new ClassB();
        bb.m();
        obj.addtion(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
    }
}

