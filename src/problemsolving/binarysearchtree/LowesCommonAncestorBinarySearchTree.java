package problemsolving.binarysearchtree;

public class LowesCommonAncestorBinarySearchTree {
    public static Node LCA(Node root,Node p,Node q){
        if(p.data < root.data && q.data <root.data){
            return LCA(root.left,p,q);
        }
        if(p.data > root.data && q.data > root.data){
            return LCA(root.right,p,q);
        }
        return root;
    }
    public static void main (String [] args){
        Node root=new Node (6);
        root.left=new Node(2);
        root.right=new Node(8);
        root.left.left=new Node(0);
        root.left.right=new Node (4);

        Node p=root.left;
        Node q=root.left.right;
        Node ans=LCA(root,p,q);

        System.out.println(ans.data);

    }
}
