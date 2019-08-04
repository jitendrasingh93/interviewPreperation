/**
 * Created by JitendraSingh on 08/11/17.
 */
public class A1 implements Cloneable {
    /*

    int age ;
    String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public A1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    protected A1 clone() throws CloneNotSupportedException {
        A1 a = new A1(10, new String("LALA")); //deepcopy
        return a;
        //return super.clone(); //deepcopy
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        A1 a = new A1(10, "Ram");
        A1 a1 = (A1) a.clone();

    }*/

static int productOfSubsetSums(int arr[], int n)
        {
        int ans = 1;
        for (int i = 0; i < n; ++i )
        ans = ans * (arr[i] + 1);
        return ans-1;
        }

public static void main (String[] args)
        {
        int arr[] = {1, 2, 3};
        int n = arr.length;
        System.out.println(productOfSubsetSums(arr, n));
        }
}

