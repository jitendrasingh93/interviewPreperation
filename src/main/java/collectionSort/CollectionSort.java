package collectionSort;

import java.util.*;

/**
 * Created by JitendraSingh on 01/12/17.
 */
public class CollectionSort {

    public static void main(String[] args) {


        List<String> names = new ArrayList<String>();

        names.add("Jeetu");
        names.add("Rohit");
        names.add("Alex");

        System.out.println("Collections before sorting.....>>>");
        for (String s : names) {
            System.out.println(s);
        }

        // Sort the collection using inbuild method available in Collections
        //Collections.sort(names);
        Collections.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("Collections after sorting.....>>>");

        for (String s1 : names) {
            System.out.println(s1);
        }

        Employee e1 = new Employee(2, "Jeetu", "Gurgaon");
        Employee e2 = new Employee(1, "Rohit", "Delhi");
        Employee e3 = new Employee(3, "Alex", "USA");

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Employee objects before sorting.....");
        for(Employee e : employees){
            System.out.println(e.toString());
        }

        Collections.sort(employees, new LocationComparator());

        System.out.println("Employee objects after sorting.....");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }
}
