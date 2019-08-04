package collectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JitendraSingh on 02/12/17.
 */
public class StudentSort {

    public static void main(String[] args) {

        List<Student> morons = new ArrayList<Student>();
        morons.add(new Student(3, 45, "Chandra", "Devrajan", "Tamilnandu"));
        morons.add(new Student(2, 43, "Ike", "Kavas", "California"));
        morons.add(new Student(8, 55, "Dean", "Huge", "South Koria"));
        morons.add(new Student(1, 23, "Alex", "lolu", "US"));

        System.out.println("Before Sorting display moron guys ...");

        for (Student s : morons) {
            System.out.println(s.toString());
        }

        System.out.println("\n After Sorting display moron guys ...\n");
        Collections.sort(morons);

        for (Student s : morons) {
            System.out.println(s.toString());
        }

        System.out.println("\n Using RollNumber comparator....\n");
        Collections.sort(morons, new RollNumberComparartor());
        for (Student s : morons) {
            System.out.println(s.toString());
        }

        System.out.println("\n Using First name comparator....\n");
        Collections.sort(morons, new FirstNameComparator());
        for (Student s : morons) {
            System.out.println(s.toString());
        }
    }
}
