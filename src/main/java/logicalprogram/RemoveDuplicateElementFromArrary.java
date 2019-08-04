package logicalprogram;

/**
 * Created by JitendraSingh on 05/11/17.
 */
public class RemoveDuplicateElementFromArrary {

    public static void removeElement(int a[] ) {
        int itr = 0,s=0;
        int dupArr[] = new int[a.length];
        for (int i = 0; i< a.length; i++) {
            for (int j = i; j<a.length; j++) {
                int value = a[i];
                int dValue = a[j];
                if (value == dValue) {
                    itr++;
                    if (itr > 1 ) {
                        System.out.println("duplicate : " + a[j]);
                    } else {
                        dupArr[s] = a[j];
                        s++;
                    }
                }
            }
            itr = 0;
            //System.out.println(i);
        }

        System.out.println("new Array : ");

        for (int i =0; i<dupArr.length;i++) {
            System.out.println(+dupArr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 3,5,4,5,1};
        removeElement(arr);
    }
}
