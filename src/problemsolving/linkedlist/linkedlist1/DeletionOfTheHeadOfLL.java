package problemsolving.linkedlist.linkedlist1;

public class DeletionOfTheHeadOfLL {
    public static Node deleteHeadNode(Node head){
        if(head==null) return null;
        Node temp=head;
        head=head.next;
        temp=null;
        return head;
    }

    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(8);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node (1);
        head.next.next.next.next=new Node(7);

        printList(head);
        head=deleteHeadNode(head);
        System.out.println();
        printList(head);

    }
}
