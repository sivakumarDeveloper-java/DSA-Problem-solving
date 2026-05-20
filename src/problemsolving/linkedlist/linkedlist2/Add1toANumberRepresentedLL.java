package problemsolving.linkedlist.linkedlist2;

public class Add1toANumberRepresentedLL {
    public static Node addNumber1(Node head){
        head=reverse(head);
        Node current=head;
        int carry=1;
        while(current != null){
            int sum=current.data+carry;
            current.data = sum%10;
            carry=sum/10;
            if(carry==0){
                break;
            }
            if(current.next==null && carry>0){
                current.next=new Node(carry);
                break;
            }
            current=current.next;
        }
        return reverse(head);
    }
    private static Node reverse(Node head){
        Node current=head;
        Node prev=null;
        Node next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void printList(Node head){
        Node current=head;
        while (current!=null){
            System.out.print(current.data);
            if(current.next!=null){
                System.out.print(" -> ");
            }
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node (9);
        head.next.next=new Node(9);
        head.next.next.next=new Node(9);

        printList(head);
        head= addNumber1(head);
        printList(head);
    }
}
