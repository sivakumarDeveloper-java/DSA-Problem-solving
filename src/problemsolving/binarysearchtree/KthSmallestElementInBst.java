package problemsolving.binarysearchtree;

public class KthSmallestElementInBst {
    static int count =0;
    static int ans=0;
    public static int kthSmallestElement(Node root,int k){
        inorder(root,k);
        return ans;
    }
    public static void inorder(Node root, int k){
        if(root==null) return ;
        inorder(root.left,k);
        count++;
        if(count==k){
            ans=root.data;
            return;
        }
        inorder(root.right,k);
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node (3);
        root.right=new Node (6);
        root.left.left=new Node(2);
        root.left.right=new Node (4);
        root.left.left.left=new Node (1);

        int k=3;
        int result=kthSmallestElement(root,k);
        System.out.println(result);
    }
}
