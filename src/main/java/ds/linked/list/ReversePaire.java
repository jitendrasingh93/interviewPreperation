package ds.linked.list;

/**
 * Created by JitendraSingh on 27/04/18.
 */
public class ReversePaire {
    static Node head;
    static class Node{
        int value;
        Node next;
        Node(int d) {
            value =d;
            next = null;
        }
    }

    static Node reversePaire(Node node) {
        Node current = node;
        Node temp = null;
        Node newNode = null;

        while (current != null && current.next != null) {

            if (temp != null) {
                // This is important step
                temp.next.next = current.next;
            }

            temp=current.next;
            current.next=temp.next;
            temp.next=current;

            if (newNode == null)
                newNode = temp;
            current = current.next;
        }
        return newNode;
    }

    static void printList(Node node) {

        if (node != null) {
            while (node != null) {
                System.out.println(node.value);
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        ReversePaire list = new ReversePaire();
        list.head = new Node(5);
        list.head.next = new Node(6);
        list.head.next.next = new Node(7);
        list.head.next.next.next = new Node(1);
        list.head.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next = new Node(8);

        printList(head);

        System.out.println("after reverse paire");
        head = reversePaire(head);
        printList(head);
    }
}
