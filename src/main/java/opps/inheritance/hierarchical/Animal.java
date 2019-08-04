package opps.inheritance.hierarchical;

/**
 * Created by JitendraSingh on 21/03/18.
 */
public class Animal {
    void eat() {
        System.out.println("eating....");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("dog barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("cat meowing");
    }
}

class MainClass {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
