package problemsolving.linkedlist.linkedlist2;

public class InterSectionOfTwoList {
    public static Node intersectionList(Node headA,Node headB){
        if(headA==null || headB==null) return null;
        Node a=headA;
        Node b=headB;

        while(a!=b){
            if(a==null) a=headB;
            else a=a.next;

            if(b==null) b=headA;
            else b=b.next;

        }
        return a;
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
        Node common=new Node(8);
        common.next=new Node(4);
        common.next.next=new Node(5);

        Node head1=new Node(4);
        head1.next=new Node (1);
        head1.next.next=common;

        Node head2=new Node(5);
        head2.next=new Node (6);
        head2.next.next=new Node(1);
        head2.next.next.next=common;

        printList(head1);
        printList(head2);
        Node interSection=intersectionList(head1,head2);
        if(interSection!=null){
            System.out.println(interSection.data);
        }
        else System.out.println("No intersection");
    }
}
