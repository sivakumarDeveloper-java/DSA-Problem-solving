package problemsolving.birnarytrees.binarytree1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarayTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>>result=new ArrayList<>();
        if(root==null) return result;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>currentValue=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                currentValue.add(current.data);

                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
           result.add(currentValue);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(12);
        root.right=new Node(13);
        root.left.left=new Node(7);
        root.left.left.left=new Node(17);
        root.left.left.right=new Node(23);
        root.right.left=new Node(14);
        root.right.right=new Node(2);
        root.right.left.left=new Node(27);
        root.right.left.right=new Node(3);
        root.right.right.left=new Node (8);
        root.right.right.right=new Node(11);

        List<List<Integer>> ans=levelOrderTraversal(root);
        System.out.println(ans);
    }
}
