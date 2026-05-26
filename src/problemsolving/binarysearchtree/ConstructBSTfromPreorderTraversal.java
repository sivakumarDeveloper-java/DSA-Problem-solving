package problemsolving.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConstructBSTfromPreorderTraversal {
    static int index=0;
    public static Node constructBSTpreorder(int []preorder){
        return build(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static Node build(int []preorder,int min,int max){
        if(index>=preorder.length) return null;

        int value=preorder[index];
        if(value<min || value>max) return null;

        Node root=new Node(value);
        index++;

        root.left=build(preorder,min,value);
        root.right=build(preorder,value,max);

        return root;
    }
    public static void levelOrder(Node root) {

        List<String> result = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            if (current == null) {

                result.add("null");
            }
            else {

                result.add(String.valueOf(current.data));

                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        int i = result.size() - 1;

        while (i >= 0 && result.get(i).equals("null")) {
            result.remove(i);
            i--;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        int[] preorder = {8, 5, 1, 7, 10, 12};

        Node root = constructBSTpreorder(preorder);

        levelOrder(root);
    }
}