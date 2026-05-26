package problemsolving.binarysearchtree;

import java.util.HashSet;

public class TwoSumIVInputInABST {
    static HashSet<Integer>set=new HashSet<>();
    public static boolean twoSum(Node root,int k){

        if(root==null) return false;

        int needed=k-root.data;

        if(set.contains(needed)) return true;

        set.add(root.data);

        boolean left=twoSum(root.left,k);
        boolean right=twoSum(root.right,k);

        return right|| left;
    }
    public static void main(String [] args){
        Node root=new Node(5);
        root.left=new Node (3);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right=new Node (6);
        root.right.right=new Node (7);

        int k=9;

        boolean ans=twoSum(root,k);

        System.out.println(ans);

    }
}
