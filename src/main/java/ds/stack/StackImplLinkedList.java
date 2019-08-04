package ds.stack;

/**
 * Created by JitendraSingh on 29/04/18.
 */
public class StackImplLinkedList {

    private Node head;

    private class Node {
        Node next;
        int value;
    }

    public StackImplLinkedList() {
        head = null;
    }

    public void push(int element) {
        Node oldHead = head;
        head = new Node();
        head.value = element;
        System.out.println("push element : "+head.value);
        head.next = oldHead;
    }
    public int pop() throws LinkedListEmptyException {

        if (head == null) {
            throw new RuntimeException();
        }
        int v = head.value;
        head = head.next;
        System.out.println("pop element : "+v);
        return v;

    }

    public static void main(String[] args) {
        StackImplLinkedList stackImplLinkedList = new StackImplLinkedList();
        System.out.println("<== push element ==>");
        stackImplLinkedList.push(2);
        stackImplLinkedList.push(4);
        stackImplLinkedList.push(8);

        System.out.println("<=== pop element ==>");
        stackImplLinkedList.pop();
        stackImplLinkedList.pop();
        stackImplLinkedList.pop();
    }

    /**
     *
     * Exception to indicate that LinkedList is empty.
     */
    class LinkedListEmptyException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public LinkedListEmptyException() {
            super();
        }

        public LinkedListEmptyException(String message) {
            super(message);
        }
    }
}
