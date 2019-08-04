/**
 * Created by JitendraSingh on 12/10/17.
 */
public class Abc {

    public static void main(String[] args) throws CloneNotSupportedException {

        TestClone testClone = new TestClone(1,"alu");
        TestClone testClone1 = (TestClone) testClone.clone();
        System.out.println("shallow copy with cloning");
        System.out.println("name == "+testClone.name+ " age == "+testClone.age);
        System.out.println("shallow copy with new copy obj");
        System.out.println("name == "+testClone1.name+ " age == "+testClone1.age);



        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println("task1 is completed");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("task 2 completed");}
        catch(Exception e){
            System.out.println("common task completed");

        }
        System.out.println("rest of the code...");

        int ab = 3;

        switch(ab) {

            case 1:
                System.out.println("abc == "+ab);
                break;
            case 2:
                System.out.println("abc1 == "+ab);
                break;
        }
        System.out.println("abc3 == "+ab);
    }

}
