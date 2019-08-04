package spring.ioc;

/**
 * Created by JitendraSingh on 18/12/17.
 */
public class TightlyCoupled {

    public Addresss addresss;
    /*
    * in such case, there is dependency between the TightlyCupled and Address (tight coupling). in the IOC (inversion of control scenerio).
    */
    public TightlyCoupled() {
        addresss = new Addresss();
    }
}
