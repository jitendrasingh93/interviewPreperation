package serialization.inheritance;

import java.io.Serializable;

/**
 * Created by JitendraSingh on 25/09/17.
 */
public class B extends A implements Serializable {

    public int j;
    public B(int j, int i) {
        super(i);
        this.j =j;
    }
}
