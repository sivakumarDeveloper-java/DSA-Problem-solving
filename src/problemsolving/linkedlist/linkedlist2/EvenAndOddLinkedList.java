package problemsolving.linkedlist.linkedlist2;

public class EvenAndOddLinkedList {
    public static Node evenAndOddLL(Node head){
        if(head==null || head.next==null) return head;

        Node evenHead=null;
        Node evenTail=null;
        Node oddHead=null;
        Node oddTail=null;

        Node current=head;


        while(current!=null){
            if(current.data%2==0){
                if(evenHead==null){
                    evenHead=current;
                    evenTail=current;
                }
                else{
                    evenTail.next=current;
                    evenTail=evenTail.next;
                }
            }
            else {
                if(oddHead==null){
                    oddHead=current;
                    oddTail=current;
                }
                else{
                    oddTail.next=current;
                    oddTail=oddTail.next;
                }
            }
            current=current.next;
        }
        if(evenHead==null){
            oddTail.next=null;
            return oddHead;
        }
        if(oddHead==null){
            evenTail.next=null;
            return evenHead;
        }
        evenTail.next=oddHead;
        oddTail.next=null;

        return evenHead;
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
        Node head=new Node(1);
        head.next=new Node (2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        printList(head);
        head= evenAndOddLL(head);
        printList(head);
    }
}
