package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class HashSetClass {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> strings = new HashSet<>();

        strings.add("vijay");
        strings.add("ajay");
        strings.add("chandra");
        strings.add("jeetu");

        set.add(1);
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
