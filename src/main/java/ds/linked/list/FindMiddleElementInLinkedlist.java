package ds.linked.list;

/**
 * Created by JitendraSingh on 27/04/18.
 */
public class FindMiddleElementInLinkedlist {

    static Node head;

    static class Node {
        int value;
        Node next;
         Node(int data) {
             value = data;
             next = null;
         }
    }

    static Node middleElementOfLinkedList(Node node) {
        Node slowPointer;
        Node fastPointer;
        slowPointer = fastPointer = node;

        while (fastPointer != null) {

            fastPointer = fastPointer.next;
            if (fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }
        return slowPointer;
    }

    static void printLinkedList(Node node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {

        FindMiddleElementInLinkedlist linkedlist = new FindMiddleElementInLinkedlist();
        linkedlist.head = new Node(2);
        linkedlist.head.next = new Node(5);
        linkedlist.head.next.next = new Node(7);
        linkedlist.head.next.next.next = new Node(3);
        linkedlist.head.next.next.next.next = new Node(2);
        linkedlist.head.next.next.next.next.next = new Node(6);
        linkedlist.head.next.next.next.next.next.next = new Node(9);

        System.out.println("linked list : ");
        printLinkedList(head);
        head = middleElementOfLinkedList(head);
        System.out.println("middle element :"+head.value);
    }
}
