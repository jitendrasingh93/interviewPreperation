package accessmodifiers;

/**
 * Created by JitendraSingh on 23/09/17.
 */

 class SuperClass {
    public void sum(int x, int y) {
        System.out.println("sum of 2 int type arguments = "+ (x+y));
    }
        }

 class SubClass extends SuperClass {

     public void sum(double x, double y) {
         System.out.println("sum of 2 double type arguments = "+ (x+y));
     }
 }



public class AccessModifier {

    public void sum(int x, int y) {
        System.out.println("sum of two argument ==>> " +(x+y));
    }


    public void sum(int a, int b, int c) {
        System.out.println("sum of three argument ==>> " +(a+b+c));
    }

    public void sum(double x, double y) {
        System.out.println("sum of 2 double type arguments = "+ (x+y));
    }
    public static void main(String[] args) {

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.sum(2, 4);
        accessModifier.sum(2, 4, 5);
        accessModifier.sum(2.8, 4.0);

        SubClass subClass = new SubClass();
        subClass.sum(3, 5);
        subClass.sum(2.0,1.8);
    }
}
