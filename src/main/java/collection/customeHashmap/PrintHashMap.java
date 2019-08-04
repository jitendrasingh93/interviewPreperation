package collection.customeHashmap;


/**
 * Created by JitendraSingh on 20/04/18.
 */
public class PrintHashMap {
    static int s[] = {1,2,3};

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(23, "jeetu");
        map.put(12, "ajit");

        System.out.println("Display map");
        map.display();
        main(s);
    }


    public static void main(int []ar) {
        System.out.println(ar);

        int x = 3;
        switch (x) {

            case 1:
                System.out.println("case1");
                break;
            case 2:
                System.out.println("case2");
                break;
            default:
                System.out.println("default");
                break;

            case 3:
                System.out.println("Case3");

        }
    }
}

