package ds.linked.list;

/**
 * Created by JitendraSingh on 17/03/18.
 */
public class ReverseLinkedList {

    static Node head;

    static class Node {
        int value;
        Node next;
        Node(int d) {
            value = d;
            next = null;
        }
    }

    //function to reverse the linkedlist.
    Node reverse(Node node) {
        Node current = node;
        Node pre = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        node = pre;
        return node;

    }

    // print linked list
    void printList(Node node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.head = new Node(10);
        linkedList.head.next = new Node(20);
        linkedList.head.next.next = new Node(30);
        linkedList.head.next.next.next = new Node(40);
        linkedList.head.next.next.next.next = new Node(50);
        linkedList.head.next.next.next.next.next = new Node(60);




        System.out.println("Given linked list : ");
        linkedList.printList(head);

        System.out.println("new method : ");
        head = linkedList.rev(head);
        linkedList.printList(head);

        head = linkedList.reverse(head);
        System.out.println("reverse linked list : ");
        linkedList.printList(head);
    }


    Node rev(Node node) {
        Node curr = node;
        Node next = null;
        Node pre = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        node = pre;
        return node;
    }
}
