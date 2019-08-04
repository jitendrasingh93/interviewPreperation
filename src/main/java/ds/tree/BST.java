package ds.tree;

/**
 * Created by JitendraSingh on 23/07/18.
 */
public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int element) {
            this.data = element;
            this.left = null;
            this.right = null;
        }
    }
    static Node root;
    static void ifCheckIsBST(Node node, int element) {
        if (node == null) return;

        root = node;

        if (root.data > element) {
            if (root.left != null) {
                root = root.left;
                ifCheckIsBST(root, element);
            } else {
                System.out.println("insert left node : "+element);
                root = new Node(element);
                return;
            }
        } else {
            if (root.right != null) {
                root = root.right;
                ifCheckIsBST(root, element);
            } else {
                System.out.println("insert right node : "+element);
                root = new Node(element);
                return;
            }
        }
    }

    public static void printTree(Node node) {
        if (node == null) return;
        root = node;
        if (root.left != null) {
            System.out.println("tree data : " + root.data);
            root = root.left;
            printTree(root);
        }
        return;
    }

    public static void main(String[] args) {
        Node node = null;
        node = new Node(4);
        node.left = new Node(3);
        node.right = new Node(5);
        node.left.left = new Node(2);
        node.right.right = new Node(7);

        ifCheckIsBST(node, 6);

    }
}
