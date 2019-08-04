package lamda_expressions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by JitendraSingh on 19/06/18.
 */
public class IterateList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(value -> {
            System.out.println("value : "+value);
        });

        //// iterate map using lambda
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "jeetu");
        map.put(2, "Jitendra");
        map.put(3, "jitendra singh");

        map.forEach((key, value)  -> {
            System.out.println(key + value);
        });


        //using entryset with lambda expression
        map.entrySet().forEach(entryset -> {
            System.out.println("key : "+entryset.getKey() + " value : "+entryset.getValue());
        });
    }

}
