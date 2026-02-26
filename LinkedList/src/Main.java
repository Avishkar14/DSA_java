public class Main {
    public static void main(String[] args) {
        //Create Linked List using LL class:
        //It would have at very base code :
        // pvt head , tail and int size //initially = 0;
        //Creating new object : list
        LL list = new LL();
//		LL.Node first = list.new Node(10); //would have worked if class Node was not private
        //So we need to create another method like insertFirst in class LL to access Node
        //within outer class and use it to create node object.

//        Insert node val at first index:
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

//        Insert node val at last index:
        list.insertLast(50);

//        Insert node val at any index:
        list.insert(40 , 3);

        list.display();

//        Insert node val at any index using recursion:
//        list.insert_rec(45 , 4, );

//        Display the list created by insertions:
        System.out.println("Original LL after both insertions:");
        list.display();

//        Delete node val at First index:
        System.out.println("Updated LL after deleting first node:");
        System.out.println(list.deleteFirst());
        list.display();

//        Delete node val at Last index:
        System.out.println("Updated LL after deleting last node:");
        System.out.println(list.deleteLast());
        list.display();

//        Delete node val at any index:
        System.out.println("Updated LL after deleting node at index any(1):");
        System.out.println(list.delete( 1));
        list.display();

//=============================================================================================
//=============================================================================================

//        Below Doubly LL is used:
        DLL list_dll = new DLL();

        list_dll.insertFirst(30);
        list_dll.insertFirst(20);
        list_dll.insertFirst(10);

        list_dll.display();
        list_dll.displayRev();

        DLL list_dll2 = new DLL();
        list_dll2.insertLast(10);
        list_dll2.insertLast(20);
        list_dll2.display();

        list_dll2.insert(15 , 1);
        list_dll2.display();

//=============================================================================================
//=============================================================================================

//        Below Circular LL is used:
        CLL list_cll = new CLL();
        list_cll.insert(11);
        list_cll.insert(15);
        list_cll.insert(21);
        list_cll.display();

        list_cll.delete(15);
        list_cll.display();
    }
}