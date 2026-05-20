package problemsolving.linkedlist.doublylinkedlist1;

public class InsertNodeBeforeHeadInDLL {
    public static Node insertNodeBeforeHead(Node head, int newData){

        Node newNode=new Node(newData);
        newNode.next=head;
        head.prev=newNode;

        return newNode;
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
        System.out.println();
    }

    public static void main(String[] args) {
//        Node head=new Node(2);
//        head.next=new Node(3);
//        head.next.prev=head;
//        head.next.next=new Node(4);
//        head.next.next.prev=head.next;
        Node head=new Node(2);
        Node second=new Node (3);
        Node third =new Node(4);

        head.next=second;
        second.prev=head;

        second.next=third;
        third.prev=second;

        int newData=1;
        printList(head);
        head=insertNodeBeforeHead(head,newData);
        printList(head);
    }
}
