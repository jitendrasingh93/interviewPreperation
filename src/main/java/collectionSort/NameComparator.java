package collectionSort;

import java.util.Comparator;

/**
 * Created by JitendraSingh on 02/12/17.
 */
public class NameComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
