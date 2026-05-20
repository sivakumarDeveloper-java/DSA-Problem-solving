package problemsolving.linkedlist.doublylinkedlist1;

public class ReverseDLL {
    public static Node reversDLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node currentNode=head;
        Node prevNode=null;

        while(currentNode!=null){
            prevNode=currentNode.prev;
            currentNode.prev=currentNode.next;
            currentNode.next=prevNode;

            currentNode=currentNode.prev;
        }
        head=prevNode.prev;
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
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node secondNode=new Node (2);
        Node thirdNode=new Node(3);
        Node fourthNode=new Node (4);
        Node fifthNode =new Node(5);

        head.next=secondNode;
        secondNode.prev=head;

        secondNode.next=thirdNode;
        thirdNode.prev=secondNode;

        thirdNode.next=fourthNode;
        fourthNode.prev=thirdNode;

        fourthNode.next=fifthNode;
        fifthNode.prev=fourthNode;

        printList(head);
        head=reversDLL(head);
        System.out.println();
        printList(head);
    }
}
