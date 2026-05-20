package problemsolving.linkedlist.linkedlist2;

public class PalindromeOrNotLL {
    public static boolean isPalindrome(Node head){
        if(head==null && head.next==null) return true;

        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node firstHalf=head;
        Node secondHalf=reverse(slow);
        while(secondHalf!=null){
            if(firstHalf.data !=secondHalf.data) return false;
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
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

    public static boolean isPalindrome1(Node head){
        Node slow=head;
        Node fast=head;               //better approach
        Node prev=null;
        Node next=null;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;

            next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        if(fast!=null){    // odd move next node
            slow=slow.next;
        }
        while(prev!=null && slow!=null){
            if(prev.data!= slow.data) return false;
            prev=prev.next;
            slow=slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node (3);
        head.next.next.next=new Node (2);
        head.next.next.next.next=new Node (1);

        System.out.println(isPalindrome(head));

        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node (3);
        head1.next.next.next=new Node (2);
        head1.next.next.next.next=new Node (1);
        System.out.println(isPalindrome1(head1));
    }
}
