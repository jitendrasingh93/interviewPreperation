package constructor;

/**
 * Created by jeetu on 23/08/17.
 */
public class MyConstructor {

    protected MyConstructor(int i) {
        //super();

        System.out.println("constructor of SuperClass -->" +i);

    }
}

    class SubConstructor extends MyConstructor {

        protected SubConstructor() {
            super(1);
            System.out.println("constructor of SubClass --> ");
        }
    }

