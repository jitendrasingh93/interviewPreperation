package collectionSort;

import java.util.Comparator;

/**
 * Created by JitendraSingh on 02/12/17.
 */
public class LocationComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}
