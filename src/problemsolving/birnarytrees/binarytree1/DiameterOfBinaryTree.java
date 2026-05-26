package problemsolving.birnarytrees.binarytree1;

public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int currentDiameter = leftHeight + rightHeight;

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        int maxDiameter = Math.max(leftDiameter, rightDiameter);

        return Math.max(currentDiameter, maxDiameter);
    }

    public static int height(Node root){
        if(root==null) return 0;

        int left=height(root.left);
        int right=height(root.right);

        return 1+Math.max(left,right);
    }
    public static void main(String [] args){
        Node root= new Node(1);
        root.left= new Node (2);
        root.right=new Node (3);
        root.left.left=new Node (4);
        root.left.right=new Node (5);

        int ans=diameterOfBinaryTree(root);
        System.out.println(ans);
    }
}
