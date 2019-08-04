package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class LinkedHashSetClass {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("vijay");
        linkedHashSet.add("ajay");
        linkedHashSet.add("sushil");
        linkedHashSet.add("jeetu");

        Iterator<String> itr = linkedHashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
