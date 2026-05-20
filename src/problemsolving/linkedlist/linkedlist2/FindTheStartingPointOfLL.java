package problemsolving.linkedlist.linkedlist2;

public class FindTheStartingPointOfLL {
    public static int linkedListCycleII(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                int index=0;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                    index++;
                }
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head=new Node(3);
        Node second=new Node (2);
        Node third=new Node (0);
        Node fourth=new Node (4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        fourth.next=second;

        int result=linkedListCycleII(head);
        if(result!=-1) System.out.println(result);
        else System.out.println("No cycle");
    }
}
