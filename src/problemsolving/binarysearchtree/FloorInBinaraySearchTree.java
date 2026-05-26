package problemsolving.binarysearchtree;

public class FloorInBinaraySearchTree {
    public static int floorInBinarySearchTree(Node root, int k){
        if(root==null) return -1;
        if(root.data==k) return root.data;

        if(root.data>k){
            return floorInBinarySearchTree(root.left,k);
        }
        int floor= floorInBinarySearchTree(root.right,k);
        return floor<=k && floor!=-1? floor:root.data;
    }
    public static int floorInBinarySearchTree1(Node root, int k){
        int floor=-1;
        while(root!=null){
            if(root.data==k) return root.data;

            if(root.data>k){

                root=root.left;
            }
            else {
                floor=root.data;
                root=root.right;
            }

        }
        return floor;
    }

    public static void main(String[] args) {
        Node root=new Node (10);
        root.left=new Node(5);
        root.right=new Node(11);
        root.left.left=new Node(4);
        root.left.right=new Node(7);
        root.left.right.right=new Node (8);

        int k=6;

        int result= floorInBinarySearchTree(root,k);
        int result1= floorInBinarySearchTree1(root,k);
        System.out.println(result);
        System.out.println(result1);

    }
}
