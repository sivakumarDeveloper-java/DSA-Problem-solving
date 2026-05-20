package problemsolving.linkedlist.linkedlist2;

public class DeleteMiddleNode {
    public static Node deleteMiddleNode(Node head){
        if(head==null || head.next==null) return null;
        Node fast=head;
        Node slow=head;
        Node prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
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
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        printList(head);
        head=deleteMiddleNode(head);
        printList(head);
    }
}
