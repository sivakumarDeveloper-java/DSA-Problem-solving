package problemsolving.linkedlist.linkedlist1;

public class SearchInLL {
    public static boolean searchLl(Node head ,int key){
        Node current=head;
        while(current!=null){
            if(current.data==key) return true;
            current=current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        int k=5;
        System.out.println(searchLl(head,k));
    }
}
