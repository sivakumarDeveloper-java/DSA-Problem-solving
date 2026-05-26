package problemsolving.binarysearchtree;



public class SearchInABinarySearchTree {

    public static Node binarySearchTree(Node root,int val){
        while(root!=null){
            if(root.data==val){
                return root;
            }
            if(val<root.data){
                root=root.left;
            }
            else root=root.right;
        }
        return null;
    }
    public static void inorder(Node root){
           if(root==null){ return;}
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

    }
    public static void main(String [] args){
        Node root=new Node(4);
        root.left=new Node (2);
        root.right=new Node (7);
        root.left.left=new Node (1);
        root.left.right=new Node (3);
        int val=2;
        Node result=binarySearchTree(root,val);
        inorder(result);
    }
}
