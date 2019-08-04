package ds.tree;

import java.util.ArrayList;

/**
 * Created by JitendraSingh on 19/06/18.
 */
public class PrintLeftNode {

    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
            left = right = null;
        }
    }

    public void printLeftNode(Node node) {

        root = node;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(root.data);

        if (root == null) return;

        System.out.println("left node : ");
        while (root != null) {
            System.out.println(root.data);
            root = root.left;
            //temp.add(root.data);
        }

    }

    public void printRightNode(Node node) {

        root = node;
        if (root == null) return;

        System.out.println("right node : ");
        while (root != null) {
            System.out.println(root.data);
            root = root.right;
        }

    }

    public static void main(String[] args) {

        PrintLeftNode printLeftNode = new PrintLeftNode();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);

        printLeftNode.printLeftNode(node);
        System.out.println("===============");
        printLeftNode.printRightNode(node);
    }
}
