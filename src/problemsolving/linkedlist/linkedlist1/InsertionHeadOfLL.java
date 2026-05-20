package problemsolving.linkedlist.linkedlist1;

public class InsertionHeadOfLL {
    public static Node insertBeginning(Node head,int x){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(10);
        int x=1;
        printList(head);
        head=insertBeginning(head,x);
        System.out.println();
        printList(head);
    }

    private static void printList(Node head) {
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
}
