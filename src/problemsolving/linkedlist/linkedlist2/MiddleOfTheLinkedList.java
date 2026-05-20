package problemsolving.linkedlist.linkedlist2;

public class MiddleOfTheLinkedList {
    public static int middleOfLinkedList(Node head){
        int length=findLength(head);
        int mid=length/2;

        while(mid>0){
            head=head.next;
            mid--;                   //two passes
        }
        return head.data;
    }

    private static int findLength(Node head) {
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }

    public static int middleOfLinkedList1(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){     // hare and tortoise algorithm
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        System.out.println(middleOfLinkedList(head));
        System.out.println(middleOfLinkedList1(head));
    }
}
