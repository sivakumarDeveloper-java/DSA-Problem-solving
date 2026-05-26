package problemsolving.birnarytrees.binarytree1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversalBinary {
    public static List<Integer> boundaryTraversl(Node root){
        List<Integer>result=new ArrayList<>();
        if(!isLeaf(root)){
            result.add(root.data);
        }
        addLeftBoundary(root,result);
        addAllLeaves(root,result);
        addRightBoundary(root,result);
        return result;
    }


    private static boolean isLeaf(Node root) {
        return root.left==null && root.right==null;
    }
    private static void addLeftBoundary(Node root, List<Integer> result) {
        Node current=root.left;
        while(current!=null){
            if(!isLeaf(current)){
                result.add(current.data);
            }
            if(current.left!=null){
                current=current.left;
            }
            else{
                current=current.right;
            }
        }
    }
    private static void addAllLeaves(Node root, List<Integer> result) {
        if(root==null) return;

        if(isLeaf(root)){
            result.add(root.data);
            return;
        }
        addAllLeaves(root.left,result);
        addAllLeaves(root.right,result);
    }

    private static void addRightBoundary(Node root, List<Integer> result) {
        Node current=root.right;
        Stack<Integer>stack=new Stack<>();

        while (current != null) {
            if(!isLeaf(current)){
                stack.push(current.data);
            }
            if(current.right!=null){
                current=current.right;
            }
            else {
                current=current.left;
            }
        }
        while(!stack.empty()){
            result.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        List<Integer> ans=boundaryTraversl(root);
        System.out.println(ans);

    }


}
