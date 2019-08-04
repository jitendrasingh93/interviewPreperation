/**
 * Created by JitendraSingh on 12/10/17.
 */
public class TestClone extends Exception implements Cloneable {

    int age;
    String name;

    public TestClone(int a, String n ) {
        this.age = a;
        this.name = n;
    }

    public TestClone() {
        super();
    }

    @Override
    protected TestClone clone() throws CloneNotSupportedException {
        /*
         * DeepCopy ::= Multiple objects wil have its own copy of member variables.
         */
        int a = age;
        TestClone testClone = new TestClone(a,new String(name));
        return testClone;

        /*
        * shallowCopy ::= multiple objects will have same copy of member varibles.
        */
       // return super.clone()

    }


}


