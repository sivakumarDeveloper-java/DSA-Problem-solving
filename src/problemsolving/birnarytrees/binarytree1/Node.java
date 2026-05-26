package problemsolving.birnarytrees.binarytree1;

public class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data =data;
    }
    Node(int data,Node left,Node right){
        this.data =data;
        this.left=left;
        this.right=right;

    }

}

