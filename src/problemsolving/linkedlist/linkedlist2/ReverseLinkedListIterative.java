package problemsolving.linkedlist.linkedlist2;

public class ReverseLinkedListIterative {
    public static Node reverseLL(Node head){
        Node current=head;
        Node next=null;
        Node prev=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node (2);
        head.next.next=new Node(3);
        head.next.next.next=new Node (4);
        head.next.next.next.next=new Node (5);

        printList(head);
        head=reverseLL(head);
        printList(head);

    }

    private static void printList(Node head) {
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
}
