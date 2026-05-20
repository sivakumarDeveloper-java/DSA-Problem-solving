package problemsolving.linkedlist.doublylinkedlist1;

public class RemoveDuplicatesFromASortedDll {
    public static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        while (current != null && current.next!=null) {
            if(current.data==current.next.data){
                Node duplicate=current.next;
                current.next=duplicate.next;

                if(duplicate.next!=null){

                    duplicate.next.prev=current;

                }
            }
            else {
                current=current.next;
            }
        }
        return head;
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
        Node head=new Node (1);
        Node second=new Node (1);
        Node third=new Node (2);
        Node fourth=new Node (3);
        Node fifth=new Node (4);

        head.next=second;
        second.prev=head;

        second.next=third;
        third.prev=second;

        third.next=fourth;
        fourth.prev=third;

        fourth.next=fifth;
        fifth.prev=fourth;

        int k=1;
        printList(head);
        head=removeDuplicates(head);
        printList(head);
    }
}



