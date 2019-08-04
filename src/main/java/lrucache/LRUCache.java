package lrucache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache<K, V> {

    private final Map<K, V> cacheMap;

    public static void main(String args[]){
    	LRUCache<Integer, String> lruCache = new LRUCache<>(10, .75f);
    	for(int i = 0; i < 20; i++){
    		if(i +1 == 12)
    			System.out.println("");
    		lruCache.put(i, "A-"+i);
    	}
    }
    
    public LRUCache(final int cacheSize, float threshold) {

        // true = use access order instead of insertion order.
        this.cacheMap = new LinkedHashMap<K, V>(cacheSize, 0.75f, true) {
            private static final long serialVersionUID = 123234454352323L;

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                // When to remove the eldest entry.
                boolean rs =  this.size() > cacheSize; // Size exceeded the max allowed.
                if(rs)
                	System.out.println("");
                return rs;
            }
        };
    }

    public void put(K key, V elem) {
        cacheMap.put(key, elem);
    }

    public V get(K key) {
        return cacheMap.get(key);
    }

    public void remove(K key) {
        cacheMap.remove(key);
    }

    public int size() {
        return cacheMap.size();
    }

    public Set<K> keySet() {
        return cacheMap.keySet();
    }

}