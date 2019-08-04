package comp_interview;

/**
 * Created by JitendraSingh on 20/05/18.
 */
public class MaxTreeWidth {

    int maxWidth = 0;
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            this.left = null;
            this.right = null;
            this.data  = value;
        }
    }

   Node root;


    // function to getMax width of binary tree
     int getMaxWidth(Node node) {

         int width;
         int i;
         int h = heigthOfTree(node);

         for (i = 1; i<= h; i++) {
             width = getWidth(node, i);
             if (width > maxWidth) {
                 maxWidth = width;
             }
         }
         return maxWidth;
     }

    //getWidth of each level
    public int getWidth(Node node, int level) {
        if (node == null) {
            return 0;
        } else {
            if (level == 1) {
                return 1;
            } else if (level > 1) {
                return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
            }
        }
        return 0;
    }
    // height of tree
    public int heigthOfTree(Node node) {
        if (node == null) {
            return 0;
        } else {
            /* compute the height of each subtree */
            int lHeight = heigthOfTree(node.left);
            int rHeight = heigthOfTree(node.right);
            return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
        }
    }
    public static void main(String[] args) {

         /*
        Constructed binary tree is:
              1
            /  \
           2    3
         /  \    \
        4   5     8
                 /  \
                6   7
        */

       MaxTreeWidth treeWidth = new MaxTreeWidth();
        treeWidth.root = new Node(1);
        treeWidth.root.left = new Node(2);
        treeWidth.root.right = new Node(3);
        treeWidth.root.left.left = new Node(4);
        treeWidth.root.left.right = new Node(5);
        treeWidth.root.right.right = new Node(8);
        treeWidth.root.right.right.left = new Node(6);
        treeWidth.root.right.right.right = new Node(7);
        //treeWidth.root.left.left.left = new Node(10);
        //treeWidth.root.left.left.right = new Node(11);


        System.out.println("heigth : "+treeWidth.heigthOfTree(treeWidth.root));
        System.out.println("max width : "+treeWidth.getMaxWidth(treeWidth.root));
    }

    public static Node createBinaryTree() {

        Node rootNode =new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);
        Node node80=new Node(80);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left = node70;
        node70.left = node80;
        node80.left = node60;

        return rootNode;
    }

    public void inOrder(Node rootNode) {

        System.out.println("Using Recursive solution:");
        System.out.println();
        if(rootNode !=  null) {
            inOrder(rootNode.left);
            //Visit the node by Printing the node data
            System.out.printf("%d ",root.data);
            inOrder(rootNode.right);
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution:");
        //bi.preorderIter(rootNode);
    }
}
