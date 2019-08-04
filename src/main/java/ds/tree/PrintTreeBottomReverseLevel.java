package ds.tree;

/**
 * Created by JitendraSingh on 23/07/18.
 */

/*
* print binary tree top to bottom and bottom to top with recursive function
* */
public class PrintTreeBottomReverseLevel {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;
        }

    }

// to print reverse level of tree node
    static void reverseLevel(Node node) {

        if ( node == null) return;

        int h = height(node);

        for (int i = h; i >= 1; i--) {
            printLevelOfTree(node, i);
        }

    }

    // to print tree top to bottomup
    static void sameOrderedLevel(Node node) {
        int h1 = height(node);
        for (int i = 0; i <= h1; i++) {
            printLevelOfTree(node, i);
        }
    }

    //print nodes of given level
    static void printLevelOfTree(Node node, int level) {

        if (node == null) return;

        if (level == 1) {
            System.out.println(node.data + " ");
        } else if (level > 1) {
            printLevelOfTree(node.left, level - 1);
            printLevelOfTree(node.right, level - 1);
        }
    }
    // calculate the height of tree
    static int height(Node node) {

        if (node == null) {
            return 0;
        } else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }

    public static void main(String[] args) {

        /*
        Example :

                1
              /   \
             2     3
            / \
          4    5

          output1 : 1 2 3 4 5
          output2 : 4 5 2 3 1
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Same Level Order traversal of binary tree is : ");
        sameOrderedLevel(root);
        System.out.println("Reverse Level Order traversal of binary tree is : ");
        reverseLevel(root);
    }
}
