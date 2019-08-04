package comp_interview;

import java.util.HashMap;

/**
 * Created by JitendraSingh on 15/05/18.
 */
public class LRUcache {

    static class Node {

        Node next;
        Node pre;
        int value;
        int key;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head;
    private Node end;

    LRUcache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = null;
        end = null;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }
        return -1;
    }

    public void remove(Node node) {
        if (node.pre != null) {
            node.pre.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.pre = node.pre;
        } else {
            end = node.pre;
        }
    }

    public void setHead(Node node) {
        node.next = head;
        node.pre = null;

        if (head != null) {
            head.pre = node;
        }
        head = node;
        if (end == null) {
            end = head;
        }
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        } else {
            Node newNode = new Node(key, value);
            if (map.size() >= capacity) {
                map.remove(end.key);
                remove(end);
                setHead(newNode);
            } else {
                setHead(newNode);
            }
            map.put(key,newNode);
        }
    }
}
