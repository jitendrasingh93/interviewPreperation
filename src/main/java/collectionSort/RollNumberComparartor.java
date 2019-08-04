package collectionSort;

import java.util.Comparator;

/**
 * Created by JitendraSingh on 02/12/17.
 */
public class RollNumberComparartor implements Comparator<Student> {
    public int compare(Student o1, Student o2) {

        if (o1.getRollNumber() == o2.getRollNumber()) {
            return 0;
        }
        if (o1.getRollNumber() > o2.getRollNumber()) {
            return 1;
        }
        return -1;
    }
}
