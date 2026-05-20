package problemsolving.linkedlist.linkedlist2;

public class LinkedListcycle {
    public static boolean linkedListCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node (2);
        head.next.next=new Node (3);
        head.next.next.next=new Node (4);
        head.next.next.next.next=head.next;

        if(linkedListCycle(head)){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
