package problemsolving.linkedlist.doublylinkedlist1;

public class DeleteNodeHeadDLL {
    public static Node deleteNode(Node head){
        if(head==null) return null;
        if(head.next==null) return null;

        head=head.next;
        head.prev=null;

        return head;
    }
    public static void printList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data);
            if(current.next!=null){
                System.out.print(" <-> ");
            }
            current=current.next;
        }
    }

    public static void main(String[] args) {
//        Node head=new Node(1);
//        head.next=new Node(2);
//        head.next.prev=head;
//        head.next.next=new Node(3);
//        head.next.next.prev=head.next;

        Node head=new Node(1);
        Node second=new Node (2);
        Node third=new Node (3);

        head.next=second;
        second.prev=head;

        second.next=third;
        third.prev=second;

        printList(head);
        head=deleteNode(head);
        System.out.println();
        printList(head);
    }
}
