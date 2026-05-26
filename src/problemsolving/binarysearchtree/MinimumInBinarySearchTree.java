package problemsolving.binarysearchtree;

public class MinimumInBinarySearchTree {
    public static int  minBinaraySearchTree(Node root){
        if(root==null) return -1;
        Node current=root;
        while(current.left!=null){
            current=current.left;
        }
        return current.data;
    }

    public static void main(String[] args) {
        Node root= new Node (4);
        root.left=new Node (2);
        root.right=new Node (7);
        root.left.left=new Node (1);
        root.left.right=new Node (3);

        int result=minBinaraySearchTree(root);
        System.out.println(result);
    }
}
