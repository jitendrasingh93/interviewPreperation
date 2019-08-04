package opps.abstraction;

/**
 * Created by JitendraSingh on 03/10/17.
 */
public abstract class  AbstructClass implements TestInterface{

    int i = 0;

    public AbstructClass() {
        System.out.println("Parent class Constructor!!!!");
        i = 10;
    }

    public void demo() {}

    abstract void show();

}
