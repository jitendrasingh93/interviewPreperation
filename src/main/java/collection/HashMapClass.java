package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JitendraSingh on 19/05/18.
 */
public class HashMapClass {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "amit");
        map.put(2, "sumit");
        map.put(5, "jeetu");
        map.put(3, "ajay");
        map.put(null, "X");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey()+"_"+ entry.getValue());
        }

        map.remove(5);
        System.out.println(map);
    }
}
