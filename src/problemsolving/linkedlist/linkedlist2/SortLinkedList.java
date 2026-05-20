package problemsolving.linkedlist.linkedlist2;

public class SortLinkedList {
    public static Node sortedLL(Node head){
        if(head==null || head.next==null) return head;

        Node middle=findMiddle(head);

        Node rightHalf=middle.next;
        middle.next=null;

        Node rightSortedList=sortedLL(head);
        Node leftSortedList=sortedLL(rightHalf);

        return mergeSort(rightSortedList,leftSortedList);
    }

    private static Node findMiddle(Node head) {
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node mergeSort(Node rightList,Node leftList){

        Node dummmy=new Node(0);
        Node current=dummmy;

        while(rightList!=null && leftList!=null){
            if(leftList.data<=rightList.data){
                current.next=leftList;
                leftList=leftList.next;
            }
            else {
                current.next=rightList;
                rightList=rightList.next;
            }
            current=current.next;
        }
        if(rightList!=null){
            current.next=rightList;
        }
        if(leftList!=null){
            current.next=leftList;
        }
        return dummmy.next;
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
        Node head=new Node (10);
        head.next=new Node (30);
        head.next.next=new Node(20);
        head.next.next.next=new Node(5);

        printList(head);
        head=sortedLL(head);
        printList(head);
    }
}
