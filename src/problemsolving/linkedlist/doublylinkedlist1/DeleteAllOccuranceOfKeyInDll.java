package problemsolving.linkedlist.doublylinkedlist1;

public class DeleteAllOccuranceOfKeyInDll {
    public static Node deleteAllOccurance(Node head ,int k){
        Node current=head;
        while(current!=null){
            if(current.data==k){
                if(current==head){
                    head=head.next;
                }
                if(current.next!=null){
                    current.next.prev=current.prev;
                }
                if(current.prev!=null){
                    current.prev.next=current.next;
                }

            }
            current=current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head=new Node(2);
        Node second=new Node(3);
        Node third=new Node (4);
        Node fourth=new Node (2);
        Node fifth=new Node(1);
        Node sixth=new Node (2);

        head.next=second;
        second.prev=head;

        second.next=third;
        third.prev=second;

        third.next=fourth;
        fourth.prev=third;

        fourth.next=fifth;
        fifth.prev=fourth;

        fifth.next=sixth;
        sixth.prev=fifth;

        int k=2;
        printList(head);
        head=deleteAllOccurance(head,k);
        printList(head);

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
}
