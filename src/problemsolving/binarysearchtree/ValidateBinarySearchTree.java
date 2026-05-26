package problemsolving.binarysearchtree;

public class ValidateBinarySearchTree {
    public static boolean validateBst(Node root){
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private static boolean valid(Node root, long minValue, long maxValue) {
        if(root==null) return true;

        if(!(root.data>minValue && root.data<maxValue)) return false;
        return valid(root.left,minValue,root.data)&&
                valid(root.right,root.data,maxValue);

    }

    public static void main(String[] args) {
        Node root=new Node (5);
        root.left=new Node(1);
        root.right=new Node (4);
        root.right.left=new Node (3);
        root.right.right=new Node(6);

        boolean result=validateBst(root);
        System.out.println(result);
    }
}
