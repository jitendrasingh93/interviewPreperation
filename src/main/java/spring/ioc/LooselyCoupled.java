package spring.ioc;

/**
 * Created by JitendraSingh on 18/12/17.
 */


/* In IOC
* makes the code loosely coupled so easy to maintain
* makes the code easy to test
*/

public class LooselyCoupled {

    private Addresss addresss;

    /*
    * thus, the IOC makes the code loosely coupled. in such case,
    * there is no need to modify the code if over logic is moved to new enviroment.
    */
    public LooselyCoupled(Addresss addresss) {
        this.addresss = addresss;
    }
}
