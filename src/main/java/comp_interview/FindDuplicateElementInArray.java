package comp_interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by JitendraSingh on 15/05/18.
 */
public class FindDuplicateElementInArray {

    int arr[] = {1,4,2,9,4,8,6,1};

    //using broute force method
    //linear search
    void findDuplicateUsingBrouteForce() {
        System.out.println("using broute force method");
    for(int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.println("duplicate : "+arr[j]);
                }
            }
        }
    }

    // using hashset
    void findDuplicateUsingHashSet() {
        System.out.println(" using hashset");
        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println("duplicate : "+arr[i]);
            }
        }
    }

    // using hash table data structure
    void duplicateUsingHashTable() {
        System.out.println("using hash table");

        Map<Integer, Integer> map = new HashMap<>();

        // build hash table with count
        for (Integer value : arr) {
            Integer count = map.get(value);
            if (count == null) {
                map.put(value, 1);
            } else {
                map.put(value, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        FindDuplicateElementInArray duplicateElementInArray = new FindDuplicateElementInArray();
        duplicateElementInArray.findDuplicateUsingBrouteForce();
        duplicateElementInArray.findDuplicateUsingHashSet();
        duplicateElementInArray.duplicateUsingHashTable();
    }
}
