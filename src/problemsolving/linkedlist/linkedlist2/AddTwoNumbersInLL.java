package problemsolving.linkedlist.linkedlist2;

public class AddTwoNumbersInLL {
    public static Node addTwoNumbers(Node head1,Node head2){
        head1=reverse(head1);
        head2=reverse(head2);

        Node dummy=new Node (0);
        Node current=dummy;

        int carry=0;
        while(head1!=null || head2!=null || carry>0 ){
            int sum=carry;
            if(head1!=null){
               sum+= head1.data;
               head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;
            Node newNode =new Node(sum%10);
            current.next=newNode;
            current=current.next;
        }
        Node result=reverse(dummy.next);
        while(result!=null && result.data==0 && result.next!=null){
            result=result.next;
        }
        return result;
    }
    public static Node reverse(Node head){
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
        Node head1=new Node (1);
        head1.next=new Node (2);
        head1.next.next=new Node (3);

        Node head2=new Node(9);
        head2.next=new Node (9);
        head2.next.next=new Node (9);

        Node result=addTwoNumbers(head1,head2);
        printList(result);

    }
}
