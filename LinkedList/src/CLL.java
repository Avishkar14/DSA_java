public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if( head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val){
        Node temp = head;
        if( temp == null){
            return;
        }
//        For deleting head :
        if( temp.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            if( temp.next.val == val){
                break;
            }
            temp = temp.next;
        }while( temp != head);

        temp.next = temp.next.next;


    }
    public void display(){
        Node temp = head;
        if( head != null){
            do{
                System.out.print( temp.val + " -> ");
                temp = temp.next;
            }while ( temp != head);
        }
        System.out.println(" HEAD ");
    }

    private class Node{
        int val;
        Node next;

        public Node( int val){
            this.val = val;
        }

        public Node( int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
