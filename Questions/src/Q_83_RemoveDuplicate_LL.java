/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Q_83_RemoveDuplicate_LL {
    //psvm
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode curr_node = head;

        if (temp == null || temp.next == null) {
            return head;
        }

        while(temp != null){
            if( curr_node.val != temp.val ){
                curr_node.next = temp;
                curr_node = temp;
            }

            if( curr_node.val == temp.val && temp.next == null ){
                curr_node.next = null;
            }

            temp = temp.next;
        }

        return head;
    }
}
