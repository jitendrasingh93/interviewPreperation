package ds.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by JitendraSingh on 05/06/18.
 */
public class InorderWithOutRecursion {

    //ArrayList list = new ArrayList(200);
     static class Node {
        int data;
        Node left, right;

        Node( int key) {
            left = right = null;
            data = key;
        }
    }

    static Node root;

    // without using recursion
    public void inorder(Node node) {

        if (node == null)
            return;

        //Node node = root;
        Stack<Node> stack = new Stack<>();

        // first visit left node
        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        // traverse the tree
        while (stack.size() > 0) {

            // visit the top node
            node = stack.pop();
            System.out.println(node.data+ " ");

            if (node.right != null) {
                node = node.right;

                //the  next node to be visited to the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }

    // using recursion inorder traversal
    public void inorderWithoutRecursion(Node node) {

        if (node == null)
            return;

        inorderWithoutRecursion(node.left);
        System.out.println(node.data + " ");
        inorderWithoutRecursion(node.right);
    }


    // preordered traverse
    public void preorderd(Node node) {
        if (node == null) return;
        System.out.println(node.data + " ");
        preorderd(node.left);
        preorderd(node.right);
    }

    //postorder traverse
    public void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+ " ");
    }

    public static void main(String[] args) {

        InorderWithOutRecursion inorderWithOutRecursion = new InorderWithOutRecursion();

        inorderWithOutRecursion.root = new Node(1);
        inorderWithOutRecursion.root.left = new Node(2);
        inorderWithOutRecursion.root.right = new Node(3);
        inorderWithOutRecursion.root.left.left = new Node(4);
        inorderWithOutRecursion.root.left.right = new Node(5);
        inorderWithOutRecursion.root.right.right = new Node(6);

        System.out.println("without recursion in order travesal");
        inorderWithOutRecursion.inorder(root);

        System.out.println("using recursion in order travesal");
        inorderWithOutRecursion.inorderWithoutRecursion(root);

        System.out.println("pre-order");
        inorderWithOutRecursion.preorderd(root);
        System.out.println("post-order");
        inorderWithOutRecursion.postOrder(root);
    }


}
