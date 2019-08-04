package comp_interview;

/**
 * Created by JitendraSingh on 15/05/18.
 */
public class LRUcacheTest {

    public static void main(String[] args) {
        LRUcache lrUcache = new LRUcache(4);
        lrUcache.set(1, 10);
        lrUcache.set(2, 20);
        lrUcache.set(3, 30);
        lrUcache.set(4, 40);
        System.out.println("get : "+lrUcache.get(4));
        System.out.println("get : "+lrUcache.get(1));
        lrUcache.set(5, 50);
        System.out.println("get : "+lrUcache.get(5));
        System.out.println("get : "+lrUcache.get(2));
    }
}
