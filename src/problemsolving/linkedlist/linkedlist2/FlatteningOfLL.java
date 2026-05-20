package problemsolving.linkedlist.linkedlist2;
class Node1{
    int data;
    Node1 next;
    Node1 bottom;
    Node1(int data){
        this.data=data;
        this.next=null;
        this.bottom=null;
    }
}
public class FlatteningOfLL {
    public static Node1 flatteningOfLL(Node1 headNode){
        if(headNode==null || headNode.next==null) return headNode;
        headNode.next=flatteningOfLL(headNode.next);
        headNode=mergeList(headNode,headNode.next);
        return headNode;
    }
    public static Node1 mergeList(Node1 firstList,Node1 secondList){
        Node1 dummy=new Node1(0);
        Node1 current=dummy;
        while(firstList!=null && secondList!=null){
            if(firstList.data<=secondList.data){
                current.bottom=firstList;
                firstList=firstList.bottom;

            }
            else {
                current.bottom=secondList;
                secondList=secondList.bottom;
            }
            current=current.bottom;
        }
        if(firstList!=null){
            current.bottom=firstList;
        }
        else{
            current.bottom=secondList;
        }
        return dummy.bottom;
    }
    public static void printList(Node1 head){
        Node1 current=head;
        while(current!=null ){
            System.out.print(current.data);
            if(current.bottom!=null){
                System.out.print(" -> ");
            }
            current=current.bottom;
        }
        System.out.println();


    }

    private static void printlistinput(Node1 head) {
        Node1 horizontal = head;
        while (horizontal != null) {
            Node1 vertical = horizontal;
            while (vertical != null) {
                System.out.print(vertical.data);       // Print bottom list
                if (vertical.bottom != null) {
                    System.out.print(" -> ");
                }
                vertical = vertical.bottom;
            }
            System.out.println();
            horizontal = horizontal.next;
        }
    }

    public static void main(String[] args) {
        Node1 head=new Node1(5);
        head.bottom=new Node1(7);
        head.bottom.bottom=new Node1(8);

        head.next=new Node1(10);
        head.next.bottom=new Node1(20);

        head.next.next=new Node1(19);
        head.next.next.bottom=new Node1(22);
        head.next.next.bottom.bottom=new Node1(50);

        printlistinput(head);
        head=flatteningOfLL(head);
        System.out.println();
        printList(head);
    }
}
