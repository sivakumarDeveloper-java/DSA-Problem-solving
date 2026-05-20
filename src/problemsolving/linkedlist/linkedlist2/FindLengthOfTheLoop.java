package problemsolving.linkedlist.linkedlist2;

public class FindLengthOfTheLoop {
    public static int findLengthOfTheLoop(Node head){
        Node slow=head;
        Node fast=head;

        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return countNode(slow);
            }
        }
        return 0;
    }

    private static int countNode(Node head) {
        int res=1;
        Node current=head;
        while(current.next!=head){
            res++;
            current=current.next;
        }
        return res;
    }

    public static void main(String[] args) {
        Node head=new Node(1);

        Node second=new Node (2);
        Node third=new Node (3);
        Node fourth=new Node (4);
        Node fifth=new Node(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        fifth.next=third;

        System.out.println(findLengthOfTheLoop(head));
    }
}
