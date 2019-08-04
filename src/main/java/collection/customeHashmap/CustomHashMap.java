package collection.customeHashmap;

/**
 * Created by JitendraSingh on 20/04/18.
 */
 public class CustomHashMap<K,V> {

 private Entry<K, V> [] table; // array of entry
 private int capacity = 5; // initial capacity of  map

 static class Entry<K, V> {

  K key;
  V value;
  Entry<K, V> next;

  public Entry(K key, V value, Entry<K, V> next) {

   this.next = next;
   this.key = key;
   this.value = value;
  }
 }

 public CustomHashMap() {

  table = new Entry[capacity];
 }


 public void put(K newKey, V data) {

  if (newKey == null) {
   return; // null key not allow
  }

  int hash = hash(newKey);

  Entry<K, V> newEntry = new Entry<K, V>(newKey, data, null);

  if (table[hash] == null) {

   table[hash] = newEntry;
  } else {
   Entry<K, V> previous = null;
   Entry<K, V> current = table[hash];

   while (current != null) {
    if (current.key.equals(newKey)) {

     if (previous == null) {
      newEntry.next = current.next;
      table[hash] = newEntry;
      return;
     } else {

      newEntry.next = current.next;
      previous.next = newEntry;
      return;
     }

    }
    previous = current;
    current = current.next;
   }
   previous.next = newEntry;
  }
 }

 public void display() {

  for(int i=0;i<capacity;i++) {
   if(table[i]!=null){
    Entry<K, V> entry=table[i];
    while(entry!=null){
     System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
     entry=entry.next;
    }
   }
  }

 }

 private int hash(K key) {
  return Math.abs(key.hashCode()) % capacity;
 }
}
