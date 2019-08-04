package cloning;

/**
 * Created by JitendraSingh on 04/10/17.
 */
public class DeepCopy implements Cloneable {

    String name;
    int age;

    public DeepCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected DeepCopy clone() throws CloneNotSupportedException {
        int age1 = age;
        DeepCopy deepCopy = new DeepCopy(new String(name), age1);
        return deepCopy;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy deepCopy = new DeepCopy("Mr. JJ",13);
        DeepCopy deepCopy1 = (DeepCopy) deepCopy.clone();

        System.out.println(deepCopy == deepCopy1);

        System.out.println(deepCopy.name == deepCopy1.name);
        System.out.println(deepCopy.age == deepCopy1.age);

    }
}
