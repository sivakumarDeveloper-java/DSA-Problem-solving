package problemsolving.linkedlist.linkedlist2;

public class RotateALL {
    public static Node rotateLL(Node head,int k){

        if(head==null || k==0) return head;

        Node tail=head;
        int length=1;

        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        tail.next=head;
        k=k%length;

        tail=head;
        for(int i=1;i<k;i++){
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;

        return head;
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
    public static void main(String [] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node (3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node (5);
        head.next.next.next.next.next=new Node (6);

        int k=5;
        printList(head);
        head=rotateLL(head,k);
        printList(head);
    }
}
