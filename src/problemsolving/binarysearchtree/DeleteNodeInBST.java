package problemsolving.binarysearchtree;



public class DeleteNodeInBST {
    public static Node deleteNodeBst(Node root,int k){
        if(root==null) return root;

        if(root.data>k){
            root.left=deleteNodeBst(root.left,k);
        }
        else if(root.data<k){
            root.right=deleteNodeBst(root.right,k);
        }
        else{
            if(root.right==null) return root.left;
            if(root.left==null) return root.right;

            Node successor=findMin(root.right);
            root.data= successor.data;
            root.right=deleteNodeBst(root.right,root.data);
        }
        return root;
    }

    private static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node (3);
        root.right=new Node (6);
        root.right.right=new Node (7);
        root.left.left=new Node(2);
        root.left.right= new Node(4);
        int k=5;
        Node result=deleteNodeBst(root,k);
        inorder(result);
    }
}
