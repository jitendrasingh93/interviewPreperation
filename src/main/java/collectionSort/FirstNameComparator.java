package collectionSort;

import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by JitendraSingh on 02/12/17.
 */
public class FirstNameComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
