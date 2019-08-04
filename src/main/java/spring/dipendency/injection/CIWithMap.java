package spring.dipendency.injection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by JitendraSingh on 24/12/17.
 */
public class CIWithMap {

    private int id;
    private String name;
    private Map<String, String> map;

    public CIWithMap(int id, String name, Map<String, String> map) {
        this.id = id;
        this.name = name;
        this.map = map;
    }

    public void display() {

        System.out.println("Id : "+id + "\n Name : "+name);
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("Map value : "+itr.next());
        }
    }
}
