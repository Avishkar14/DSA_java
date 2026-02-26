package LinkedListQ;
//This has Q : Q 141 - https://leetcode.com/problems/linked-list-cycle/description/
// Q - count Nodes in cycle
//Q. 142 - https://leetcode.com/problems/linked-list-cycle-ii/description/
//Q. 876 - https://leetcode.com/problems/middle-of-the-linked-list/

public class Q_141_LLCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        // Connecting nodes: 3 -> 2 -> 0 -> -4
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle: -4 -> 2 (pos = 1)
        fourth.next = second;

        boolean result = hasCycle(head);
        System.out.println(result);

        System.out.println(NodesCycle(head));
        ListNode node = detectCycle(head);
        System.out.println(node.val);
    }
//Actual Cycle Q:
    static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if( fast == slow ){
                return true;
            }
        }

        return false;
    }
//    Q to calculate number of nodes in cycle:
    static int NodesCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if( fast == slow ){
                ListNode temp = slow.next;
                int length = 1;
                while( temp != slow ){  //OR use do{} while(); loop like KK.
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }

        return 0;
    }

    static ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode sec = head;
        int length = NodesCycle(head);
        if( length == 0){
            return null;
        }
        while( length != 0){
            sec = sec.next;
            length--;
        }

        while( first != sec ){
            first = first.next;
            sec = sec.next;
        }
        return first;
    }
//    Q.876 ) Middle node of LL :
    ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int length = 0;
        while( curr != null ){
            curr = curr.next;
            length++;
        }
        curr = head;
        for( int i = 0; i < length/2; i++){
            curr = curr.next;
        }

        return curr;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}