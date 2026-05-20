package problemsolving.linkedlist.linkedlist2;

public class OddAndEvenList {
    public static Node oddAndEvenLL(Node head){
        if(head==null || head.next==null ) return head;

        Node odd=head;
        Node even=head.next;
        Node evenHead=even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
    public static void printList(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data);
            if(current.next!=null){
                System.out.print(" -> ");
            }
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head=new Node (1);
        head.next=new Node (2);
        head.next.next=new Node (3);
        head.next.next.next=new Node (4);
        head.next.next.next.next=new Node(5);

        printList(head);
        head=oddAndEvenLL(head);
        printList(head);
    }
}
