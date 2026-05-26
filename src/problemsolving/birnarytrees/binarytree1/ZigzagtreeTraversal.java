package problemsolving.birnarytrees.binarytree1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagtreeTraversal {
    public static List<List<Integer>> zigzag(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        boolean leftToRight=true;

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currentLevel=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node current=queue.poll();

                if(leftToRight){
                    currentLevel.add(current.data);
                }
                else {
                    currentLevel.add(0, current.data);
                }
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);
            leftToRight=!leftToRight;
        }
        return result;
    }

    public static void main(String[] args) {
        Node root=new Node (20);
        root.left=new Node(8);
        root.right=new Node (22);
        root.left.left=new Node (4);
        root.left.right=new Node (12);
        root.left.right.left=new Node (10);
        root.left.right.right=new Node(14);

        List<List<Integer>>ans=zigzag(root);
        System.out.println(ans);
    }
}
