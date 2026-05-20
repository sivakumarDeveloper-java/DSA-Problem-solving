package problemsolving.linkedlist.linkedlist2;

public class RemoveNthNodeFromTheBackOfLL {
    public static Node removeNthNode(Node head,int n){
        Node dummy=new Node (0);
        dummy.next=head;

        Node slow=dummy;
        Node fast=dummy;

        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
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
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        int n=2;
        printList(head);
        head=removeNthNode(head,n);
        printList(head);
    }
}
