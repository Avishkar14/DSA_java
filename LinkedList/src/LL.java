/*
 Doubts :
 what is static inner class? also isn't Node like method? Also can we create a class inside a class? why do we do that and whats its actual function?
 so generally all is non static unless we declare it in that way like normal variables like int a ; also what is use of static then and why is there static , non static exists?
 
 *
 */

public class LL {

    private Node head;
    private Node tail;

    private int size;

    //constructor for LL:
    public LL(){
        //Initially the size of node is 0 .
        //before creating one node , so its default.
        this.size = 0;
    }

    //Method of outer class to insert element at first
    //position in LL.
    public void insertFirst(int val) {
        //create first node with val:
        Node newNode = new Node(val);
        //Node class's object created is newNode
        //whose next pointer points to head as its inserted at first position of LL.
        newNode.next = head;

        // head updated after insertion of new Node at first position:
        head = newNode;

        //if first item is being added then tail and head initially points to same node
        if( tail == null) {
            tail = head;
        }

        //size increased as node added:
        size += 1;
    }

    public void insertLast(int val) {

        //If the tail is already null then we first create a node object but rather
        //writing it again we reuse block of code insertFirst() and then return as
        //no need to again create newNode.
        if( tail == null) {
            insertFirst(val);
            return;
        }
        //create newNode with val:
        Node newNode = new Node(val);

        //Assign current tail's next which would be null by default to newNode;
        tail.next = newNode;

        // tail updated after insertion of new Node at last position:
        tail = newNode;

        //size increased as node added:
        size += 1;
    }

    //Insert node at any index:
    public void insert(int val, int index) {
        if( index == 0) {
            insertFirst(val);
            return;
        }
        if( index == size) {
            insertLast(val);
            return;
        }

        Node temp = head; //creating temp ref variable of Node dt to point to Node where head points. No new memory is allocated.
//        Just like KK said Changing temp.value will also change head.value (because it's the same object i.e, both are pointing to same obj.).


        for(int i = 1; i < index; i++) { //We reach here at "index - 1" (temp at i - 1) and temp.next == index;
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;

        size += 1;
    }

    public void insert_rec(int val, int index, Node prev){
        if( index == 0){
            Node newNode = new Node(val);
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
            return;
        }
        prev = prev.next ;

        insert_rec( val, index - 1, prev);
    }

    //return type int as it's going to delete first element
    // to show user what its deleted (I guess its not necessary)
    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if(head == null ) {
            tail = null;
        }

        size -= 1;
        return val;
    }

    public int deleteLast(){

        if(size <= 1 ) {
            return deleteFirst();
        }
        Node temp = head;
        for(int i = 1; i < size - 1; i++) {
            //size -1 to stop temp at second last node.
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        tail.next = null;

        size -= 1;
        return val;
    }

    public int delete(int index){
        if( index == 0){
            return deleteFirst();
        }
        if( index == size - 1){
            return deleteLast();
        }
        Node prev = head;
        for(int i = 0; i < index; i++){
            //We get prev to index - 1:
            prev = prev.next;
        }
        //The value of node to be deleted is :
        int val = prev.next.value;
//To reach to node next to index as we want to assign it as
// next of prev node so used extra temp node created :(My way)
//        Node temp = prev.next;
//        prev.next = temp.next;
        //But more easier way is :
        prev.next = prev.next.next; //this is all objects and references

        return val;
    }

//    Should it be pvt?
    public Node find(int value){
        Node newNode = head;
        while( newNode != null ){
            if( newNode.value == value){
                return newNode;
            }
            newNode = newNode.next;
        }
        //If not found in above LL then not found = return null;
        return null;
    }

    public void display() {
        //temporary node created and equate to head :
        Node temp = head;
        while( temp != null) {
            System.out.print( temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }

    private class Node{
        private int value;
        private Node next;

        //constructor:
        //For just creating the node, it has next as null (address
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //QUESTIONS :

    public static LL merge_2Lists(LL list1, LL list2 ){
        Node first = list1.head;
        Node sec = list2.head;

        LL ans = new LL();

        while( first != null && sec != null){
            if( first.value < sec.value){
                ans.insertLast(first.value);
                first = first.next;
            }
            else{
                ans.insertLast(sec.value);
                sec = sec.next;
            }
        }

        while( first != null || sec != null){
            if( first != null ){
                ans.insertLast(first.value);
                first = first.next;
            }
            else if( sec != null){
                ans.insertLast(sec.value);
                sec = sec.next;
            }
        }
        return ans;
    }

    //Needed this for user to use in main and also start the recursion call :
    public Node reverseList( Node head) {
//        Below is for recursion based reverse:======================================
        if (head == null) {
            return head;
        }
//        reverse(head);

// Below is for iterative based reverse:======================================
//        if( size < 2){
//            //1 or less node then return same;
//            return;
//        }

        Node prev = null;
        Node pres = head;
        Node nxt = pres.next;

        while( pres != null){

            pres.next = prev;
            prev = pres;
            pres = nxt;
            if( nxt != null){
                nxt = nxt.next;
            }
        }
        head = prev;
        return head;
    }
    private Node reverse(Node node){
        if( node == tail ){
//            Base condition :
            head = tail;
            return node;
        }
        Node newHead = reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
        return newHead;
    }

    Node MidNode(Node head){
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //1x speed
            fast = fast.next.next; //2x speed
        }
        return slow;

    }

    public void reorderList(Node head){
        //First find mid using MidNode() and then reverse after middle node.
        if( head == null || head.next == null){
            return;
        }
        Node mid = MidNode(head);
        Node f = head;
        Node s = reverseList(mid);
        Node temp = head;

        //Now rearrange them use temp variable also.
        while( s != null && f != null){
         temp = f.next;
         f.next = s;
         f = temp;
         temp = s.next;
         s.next = f;
         s = temp;
        }
        //Need to make tail (f.next) as null:
        if( f != null){
            f.next = null;
        }
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(6);

//        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(4);
        list2.insertLast(5);

        list1.display();
        list2.display();

        LL ans = LL.merge_2Lists(list1 , list2);
        ans.display();

//        ans.reverseList( ans.head);
//        ans.display();
//        System.out.println(ans.MidNode(ans.head).value);
//        System.out.println(ans.head.value);
        ans.reorderList(ans.head);
        ans.display();
    }
}