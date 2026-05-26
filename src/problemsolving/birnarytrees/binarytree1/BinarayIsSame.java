package problemsolving.birnarytrees.binarytree1;

public class BinarayIsSame {
    public static boolean binaryIsSame(Node root1, Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;

        if(root1.data !=root2.data) return false;

        boolean ans=binaryIsSame(root1.left,root2.left) && binaryIsSame(root1.right ,root2.right);
        return ans;
    }

    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(1);

        Node root2=new Node(1);
        root2.left=new Node(1);
        root2.right=new Node(2);

        boolean ans=binaryIsSame(root1,root2);
        System.out.println(ans);
    }
}
