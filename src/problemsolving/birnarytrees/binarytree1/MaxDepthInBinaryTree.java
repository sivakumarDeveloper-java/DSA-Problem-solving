package problemsolving.birnarytrees.binarytree1;

public class MaxDepthInBinaryTree {
    public static int maxDepthInBT(Node root){
        if(root==null) return -1; //edge  //count node return 0

        int leftHeight=maxDepthInBT(root.left);
        int rightHeight=maxDepthInBT(root.right);

        int max=Math.max(leftHeight,rightHeight);
        return 1+max;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node (2);
        root.right=new Node(3);
        root.left.left=new Node (4);

        int ans=maxDepthInBT(root);
        System.out.println(ans);
    }
}
