package problemsolving.linkedlist.linkedlist2;

public class ReverseLLinGroupOfGivenK {
    public static Node reverseKGroup(Node head,int k){
        if(head ==null) return null;

        Node current=head;
        Node prev=null;
        Node next=null;
        int count=0;
        while(current!=null && count<k){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if(next!=null){
           head.next=reverseKGroup(next,k);
        }
        return prev;
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
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node (4);
        head.next.next.next.next=new Node (5);
        int k=2;
        printList(head);
        head=reverseKGroup(head,k);
        printList(head);
    }
}
