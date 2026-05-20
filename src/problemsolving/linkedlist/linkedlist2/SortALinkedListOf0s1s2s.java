package problemsolving.linkedlist.linkedlist2;

public class SortALinkedListOf0s1s2s {
    public static Node sortList(Node head){
        Node zeroDummy=new Node(0);
        Node oneDummy=new Node (0);
        Node twoDummy=new Node (0);

        Node zero=zeroDummy;
        Node one=oneDummy;
        Node two=twoDummy;

        Node current=head;

        while(current!=null){
            if(current.data==0){
                zero.next=current;
                zero=zero.next;
            }
            else if(current.data==1){
                one.next=current;
                one=one.next;
            }
            else {
                two.next=current;
                two=two.next;
            }
            current=current.next;
        }
        zero.next=(oneDummy.next!=null)?oneDummy.next:twoDummy.next;
        one.next=twoDummy.next;
        two.next=null;

        return zeroDummy.next;
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
    public static void main(String[]args){
        Node head=new Node (1);
        head.next=new Node(2);
        head.next.next=new Node (0);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node (0);

        printList(head);
        head=sortList(head);
        printList(head);
    }

}
