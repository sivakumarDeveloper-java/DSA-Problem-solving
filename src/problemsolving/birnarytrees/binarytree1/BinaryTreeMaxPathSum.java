package problemsolving.birnarytrees.binarytree1;

public class BinaryTreeMaxPathSum {
    public static int maxValue=Integer.MIN_VALUE;
    public static int maxPath(Node root){
        solve(root);
        return maxValue;
    }
    public static int solve(Node root){
        if(root==null) return 0;

        int leftHeight=solve(root.left);
        int rightHeight=solve(root.right);

        int left=Math.max(0,leftHeight);
        int right=Math.max(0,rightHeight);

        int currentValue=left+right+ root.data;

        maxValue=Math.max(currentValue,maxValue);
        return root.data+Math.max(left,right);
    }
    public static void main(String [] args){
        Node root=new Node(10);
        root.left=new Node (2);
        root.right=new Node(10);
        root.left.left=new Node (20);
        root.left.right=new Node (1);
        root.right.right=new Node(-25);
        root.right.right.left=new Node(3);
        root.right.right.right= new Node(4);

        int ans=maxPath(root);
        System.out.println(ans);
    }
}
