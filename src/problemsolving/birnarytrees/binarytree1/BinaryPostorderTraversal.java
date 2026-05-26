package problemsolving.birnarytrees.binarytree1;

import java.util.ArrayList;
import java.util.List;

public class BinaryPostorderTraversal {
    public static List<Integer> postOrderTraversal(Node root){
        List<Integer>result=new ArrayList<>();
        postorder(root,result);
        return result;
    }

    private static void postorder(Node head, List<Integer> result) {
        if(head==null) return;
        postorder(head.left,result);
        postorder(head.right,result);
        result.add(head.data);
    }
    public static void main(String []args){
        Node root=new Node(19);
        root.left=new Node (10);
        root.right=new Node (8);
        root.left.left=new Node(11);
        root.left.right=new Node (13);
        root.right.left=new Node (10);
        root.right.right=new Node(9);

        List<Integer> ans=postOrderTraversal(root);
        System.out.println(ans);
    }
}
