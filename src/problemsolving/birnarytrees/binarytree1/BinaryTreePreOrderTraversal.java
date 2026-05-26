package problemsolving.birnarytrees.binarytree1;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {
    public static List<Integer> preorderTraversal(Node root){
        List<Integer> result=new ArrayList<>();
        preorder(root,result);
        return result;
    }
    public static void preorder(Node node,List<Integer> result){
        if(node==null){
            return;
        }
        result.add(node.data);
        preorder(node.right,result);
        preorder(node.left,result);
    }

    public static void main(String[] args) {
       // Node root=new Node(1, null, new Node(2, new Node(3), null));

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer>ans=preorderTraversal(root);
        System.out.println(ans);
    }
}
