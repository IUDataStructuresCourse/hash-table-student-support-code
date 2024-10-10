import java.util.ArrayList;
import java.util.LinkedList;


public class HashTable<K,V> implements Map<K,V> {

    class Entry {
        Entry(K k, V v) { key = k; value = v; }
        K key; V value;
    };

    protected ArrayList<LinkedList<Entry>> table;

    protected int hash(K key) {
        /* TODO: Your Code Here */
    }

    public HashTable(int table_size) {
        /* TODO: Your Code Here */
    }

    public boolean containsKey(K key) {
        /* TODO: Your Code Here */
    }

    public V get(K key) throws Exception {
        /* TODO: Your Code Here */
    }

    public void put(K key, V value) {
        /* TODO: Your Code Here */
    }

    public void remove(K key) {
        /* TODO: Your Code Here */
    }
}
