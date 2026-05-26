package problemsolving.binarysearchtree;

public class CeilInBinaraySearchTree {
    public static int ceilInBinarySearchTree(Node root, int k){
        if(root==null) return -1;
        if(root.data==k) return root.data;

        if(root.data<k){
            return ceilInBinarySearchTree(root.right,k);
        }
        int ceil=ceilInBinarySearchTree(root.left,k);
        return ceil>=k? ceil:root.data;
    }
    public static int ceilInBinarySearchTree1(Node root,int k){
        int ceil=-1;
        while(root!=null){
            if(root.data==k) return root.data;

            if(root.data>k){
                ceil=root.data;
                root=root.left;
            }
            else {
                root=root.right;
            }

        }
        return ceil;
    }

    public static void main(String[] args) {
        Node root=new Node (10);
        root.left=new Node(5);
        root.right=new Node(11);
        root.left.left=new Node(4);
        root.left.right=new Node(7);
        root.left.right.right=new Node (8);

        int k=6;

        int result=ceilInBinarySearchTree(root,k);
        int result1=ceilInBinarySearchTree1(root,k);
        System.out.println(result);
        System.out.println(result1);

    }
}
