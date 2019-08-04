package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by JitendraSingh on 18/05/18.
 */
public class LinkedListClass {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("alex");
        linkedList.add("chandra");
        linkedList.add("ajay");
        linkedList.add("vijay");

        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
