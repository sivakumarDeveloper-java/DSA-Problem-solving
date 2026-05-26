package problemsolving.birnarytrees.binarytree1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(Node root){
        List<Integer>result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public static void inorder(Node head,List<Integer>result){
        if(head==null) return;
        inorder(head.left,result);
        result.add(head.data);
        inorder(head.right,result);
    }

    public static void main(String[] args) {
        Node root=new Node (1);
        root.left=new Node (2);
        root.right=new Node (3);
        root.left.left=new Node (4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);

        List<Integer>ans=inorderTraversal(root);
        System.out.println(ans);
    }
}
