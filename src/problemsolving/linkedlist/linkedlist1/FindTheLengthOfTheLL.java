package problemsolving.linkedlist.linkedlist1;

public class FindTheLengthOfTheLL {
    public static int lengthOftheLl(Node head){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(1);
        head.next.next.next=new Node(3);

        System.out.println(lengthOftheLl(head));
    }
}
