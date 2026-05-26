package problemsolving.binarysearchtree;

import java.util.HashSet;

public class TwoSumIVinBST {
    static HashSet<Integer>set =new HashSet<>();
    public static boolean findTarget(Node root,int k){
        if(root==null) return false;
        int needed=k- root.data;

        if(set.contains(needed)){
            return true;
        }
        set.add(root.data);
        boolean left=findTarget(root.left,k);
        boolean right=findTarget(root.right,k);

        return left||right;
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node (3);
        root.right=new Node(6);
        root.right.right=new Node(7);

        root.left.left=new Node(2);
        root.left.right=new Node(4);
        int k=9;
        boolean ans=findTarget(root,k);
        System.out.println(ans);

    }
}
