package cloning;

/**
 * Created by JitendraSingh on 04/10/17.
 */
public class ShallowCopy implements Cloneable {
    String name;
    int age;

    public ShallowCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy shallowCopy = new ShallowCopy("jeetu", 13);
        ShallowCopy shallowCopy1 = (ShallowCopy) shallowCopy.clone();
        System.out.println(shallowCopy == shallowCopy1);

        System.out.println(shallowCopy.age == shallowCopy1.age);
        System.out.println(shallowCopy.name == shallowCopy1.name);
    }
}
