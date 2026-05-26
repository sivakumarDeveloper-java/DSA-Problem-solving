package problemsolving.birnarytrees.binarytree1;

public class BalancedBinaryTree {
    public static boolean balancedBinaryTree(Node root){
        return check(root)!=-1;
    }
    public static int check (Node head){
        if(head==null) return 0;

        int left=check(head.left);

        if(left==-1) return -1;


        int right=check(head.right);
        if(right==-1) return -1;

        if(Math.abs(left-right)>1) return -1;

        return 1+Math.max(left,right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node (4);
        root.right=new Node(3);

        boolean ans=balancedBinaryTree(root);
        System.out.println(ans);
    }
}
